package typings.chosenJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chosen {
  
  /* Rewritten from type alias, can be one of: 
    - typings.chosenJs.chosenJsStrings.chosenColonready
    - typings.chosenJs.chosenJsStrings.chosenColonmaxselected
    - typings.chosenJs.chosenJsStrings.chosenColonshowing_dropdown
    - typings.chosenJs.chosenJsStrings.chosenColonhiding_dropdown
    - typings.chosenJs.chosenJsStrings.chosenColonno_results
  */
  trait OnEvent extends StObject
  object OnEvent {
    
    @scala.inline
    def chosenColonhiding_dropdown: typings.chosenJs.chosenJsStrings.chosenColonhiding_dropdown = "chosen:hiding_dropdown".asInstanceOf[typings.chosenJs.chosenJsStrings.chosenColonhiding_dropdown]
    
    @scala.inline
    def chosenColonmaxselected: typings.chosenJs.chosenJsStrings.chosenColonmaxselected = "chosen:maxselected".asInstanceOf[typings.chosenJs.chosenJsStrings.chosenColonmaxselected]
    
    @scala.inline
    def chosenColonno_results: typings.chosenJs.chosenJsStrings.chosenColonno_results = "chosen:no_results".asInstanceOf[typings.chosenJs.chosenJsStrings.chosenColonno_results]
    
    @scala.inline
    def chosenColonready: typings.chosenJs.chosenJsStrings.chosenColonready = "chosen:ready".asInstanceOf[typings.chosenJs.chosenJsStrings.chosenColonready]
    
    @scala.inline
    def chosenColonshowing_dropdown: typings.chosenJs.chosenJsStrings.chosenColonshowing_dropdown = "chosen:showing_dropdown".asInstanceOf[typings.chosenJs.chosenJsStrings.chosenColonshowing_dropdown]
  }
  
  trait Options extends StObject {
    
    /**
      * When set to true on a single select, Chosen adds a UI element which selects the first element (if it is blank).
      * @default false
      */
    var allow_single_deselect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, Chosen's search is case-insensitive. Setting this option to true makes the search case-sensitive.
      * @default false
      */
    var case_sensitive_search: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set to true, Chosen will not display the search field (single selects only).
      * @default false
      */
    var disable_search: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Hide the search input on single selects if there are n or fewer options.
      * @default 0
      */
    var disable_search_threshold: js.UndefOr[Double] = js.undefined
    
    /**
      * By default, Chosen includes disabled options in search results with a special styling. Setting this option to false will hide disabled results and exclude them from searches.
      * @default true
      */
    var display_disabled_options: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, Chosen includes selected options in search results with a special styling. Setting this option to false will hide selected results and exclude them from searches.
      * Note: this is for multiple selects only. In single selects, the selected result will always be displayed.
      * @default true
      */
    var display_selected_options: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, searching will match on any word within an option tag. Set this option to false if you want to only match on the entire text of an option tag.
      * @default true
      */
    var enable_split_word_search: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, Chosen will search group labels as well as options, and filter to show all options below matching groups. Set this to false to search only in the options.
      * @default true
      */
    var group_search: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, Chosen's results are hidden after a option is selected. Setting this option to false will keep the results open after selection. This only applies to multiple selects.
      * @default true
      */
    var hide_results_on_select: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, Chosen only shows the text of a selected option. Setting this option to true will show the text and group (if any) of the selected option.
      * @default false
      */
    var include_group_label_in_selected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set to true, Chosen will grab any classes on the original select field and add them to Chosen’s container div.
      * @default false
      */
    var inherit_select_classes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Limits how many options the user can select. When the limit is reached, the `chosen:maxselected` event is triggered.
      * @default Infinity
      */
    var max_selected_options: js.UndefOr[Double] = js.undefined
    
    /**
      * Only show the first (n) matching options in the results. This can be used to increase performance for selects with very many options.
      * @default Infinity
      */
    var max_shown_results: js.UndefOr[Double] = js.undefined
    
    /**
      * The text to be displayed when no matching results are found. The current search is shown at the end of the text (e.g., No results match "Bad Search").
      * @default "No results match"
      */
    var no_results_text: js.UndefOr[String] = js.undefined
    
    /**
      * The text to be displayed as a placeholder when no options are selected for a multiple select.
      * @default "Select Some Options"
      */
    var placeholder_text_multiple: js.UndefOr[String] = js.undefined
    
    /**
      * The text to be displayed as a placeholder when no options are selected for a single select.
      * @default "Select an Option"
      */
    var placeholder_text_single: js.UndefOr[String] = js.undefined
    
    /**
      * Chosen supports right-to-left text in select boxes. Set this option to true to support right-to-left text options.
      * @default false
      */
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, Chosen’s search matches starting at the beginning of a word. Setting this option to true allows matches starting from anywhere within a word.
      * This is especially useful for options that include a lot of special characters or phrases in ()s and []s.
      * @default false
      */
    var search_contains: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, pressing delete/backspace on multiple selects will remove a selected choice.
      * When false, pressing delete/backspace will highlight the last choice, and a second press deselects it.
      * @default true
      */
    var single_backstroke_delete: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The width of the Chosen select box. By default, Chosen attempts to match the width of the select box you are replacing.
      * If your select is hidden when Chosen is instantiated, you must specify a width or the select will show up with a width of 0.
      */
    var width: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllow_single_deselect(value: Boolean): Self = StObject.set(x, "allow_single_deselect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllow_single_deselectUndefined: Self = StObject.set(x, "allow_single_deselect", js.undefined)
      
      @scala.inline
      def setCase_sensitive_search(value: Boolean): Self = StObject.set(x, "case_sensitive_search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCase_sensitive_searchUndefined: Self = StObject.set(x, "case_sensitive_search", js.undefined)
      
      @scala.inline
      def setDisable_search(value: Boolean): Self = StObject.set(x, "disable_search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable_searchUndefined: Self = StObject.set(x, "disable_search", js.undefined)
      
      @scala.inline
      def setDisable_search_threshold(value: Double): Self = StObject.set(x, "disable_search_threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable_search_thresholdUndefined: Self = StObject.set(x, "disable_search_threshold", js.undefined)
      
      @scala.inline
      def setDisplay_disabled_options(value: Boolean): Self = StObject.set(x, "display_disabled_options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay_disabled_optionsUndefined: Self = StObject.set(x, "display_disabled_options", js.undefined)
      
      @scala.inline
      def setDisplay_selected_options(value: Boolean): Self = StObject.set(x, "display_selected_options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay_selected_optionsUndefined: Self = StObject.set(x, "display_selected_options", js.undefined)
      
      @scala.inline
      def setEnable_split_word_search(value: Boolean): Self = StObject.set(x, "enable_split_word_search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnable_split_word_searchUndefined: Self = StObject.set(x, "enable_split_word_search", js.undefined)
      
      @scala.inline
      def setGroup_search(value: Boolean): Self = StObject.set(x, "group_search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroup_searchUndefined: Self = StObject.set(x, "group_search", js.undefined)
      
      @scala.inline
      def setHide_results_on_select(value: Boolean): Self = StObject.set(x, "hide_results_on_select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHide_results_on_selectUndefined: Self = StObject.set(x, "hide_results_on_select", js.undefined)
      
      @scala.inline
      def setInclude_group_label_in_selected(value: Boolean): Self = StObject.set(x, "include_group_label_in_selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInclude_group_label_in_selectedUndefined: Self = StObject.set(x, "include_group_label_in_selected", js.undefined)
      
      @scala.inline
      def setInherit_select_classes(value: Boolean): Self = StObject.set(x, "inherit_select_classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInherit_select_classesUndefined: Self = StObject.set(x, "inherit_select_classes", js.undefined)
      
      @scala.inline
      def setMax_selected_options(value: Double): Self = StObject.set(x, "max_selected_options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_selected_optionsUndefined: Self = StObject.set(x, "max_selected_options", js.undefined)
      
      @scala.inline
      def setMax_shown_results(value: Double): Self = StObject.set(x, "max_shown_results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_shown_resultsUndefined: Self = StObject.set(x, "max_shown_results", js.undefined)
      
      @scala.inline
      def setNo_results_text(value: String): Self = StObject.set(x, "no_results_text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNo_results_textUndefined: Self = StObject.set(x, "no_results_text", js.undefined)
      
      @scala.inline
      def setPlaceholder_text_multiple(value: String): Self = StObject.set(x, "placeholder_text_multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholder_text_multipleUndefined: Self = StObject.set(x, "placeholder_text_multiple", js.undefined)
      
      @scala.inline
      def setPlaceholder_text_single(value: String): Self = StObject.set(x, "placeholder_text_single", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholder_text_singleUndefined: Self = StObject.set(x, "placeholder_text_single", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setSearch_contains(value: Boolean): Self = StObject.set(x, "search_contains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch_containsUndefined: Self = StObject.set(x, "search_contains", js.undefined)
      
      @scala.inline
      def setSingle_backstroke_delete(value: Boolean): Self = StObject.set(x, "single_backstroke_delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingle_backstroke_deleteUndefined: Self = StObject.set(x, "single_backstroke_delete", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SelectedData extends StObject {
    
    var deselected: String
    
    var selected: String
  }
  object SelectedData {
    
    @scala.inline
    def apply(deselected: String, selected: String): SelectedData = {
      val __obj = js.Dynamic.literal(deselected = deselected.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectedData]
    }
    
    @scala.inline
    implicit class SelectedDataMutableBuilder[Self <: SelectedData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeselected(value: String): Self = StObject.set(x, "deselected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chosenJs.chosenJsStrings.chosenColonupdated
    - typings.chosenJs.chosenJsStrings.chosenColonactivate
    - typings.chosenJs.chosenJsStrings.chosenColonopen
    - typings.chosenJs.chosenJsStrings.chosenColonclose
  */
  trait TriggerEvent extends StObject
  object TriggerEvent {
    
    @scala.inline
    def chosenColonactivate: typings.chosenJs.chosenJsStrings.chosenColonactivate = "chosen:activate".asInstanceOf[typings.chosenJs.chosenJsStrings.chosenColonactivate]
    
    @scala.inline
    def chosenColonclose: typings.chosenJs.chosenJsStrings.chosenColonclose = "chosen:close".asInstanceOf[typings.chosenJs.chosenJsStrings.chosenColonclose]
    
    @scala.inline
    def chosenColonopen: typings.chosenJs.chosenJsStrings.chosenColonopen = "chosen:open".asInstanceOf[typings.chosenJs.chosenJsStrings.chosenColonopen]
    
    @scala.inline
    def chosenColonupdated: typings.chosenJs.chosenJsStrings.chosenColonupdated = "chosen:updated".asInstanceOf[typings.chosenJs.chosenJsStrings.chosenColonupdated]
  }
}
