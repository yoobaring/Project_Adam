package com.example.BasiceTheQuran.ui.main.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.BasiceTheQuran.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class Chapter2n3 extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";



    public static Chapter2n3 newInstance(int index) {
        Chapter2n3 fragment = new Chapter2n3();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }

    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_chapter2n3, container, false);
        final TextView textView = root.findViewById(R.id.section_label);

        return root;
    }
}