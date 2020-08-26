package typings.chosenJs.Chosen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * When set to true on a single select, Chosen adds a UI element which selects the first element (if it is blank).
    * @default false
    */
  var allow_single_deselect: js.UndefOr[Boolean] = js.native
  /**
    * By default, Chosen's search is case-insensitive. Setting this option to true makes the search case-sensitive.
    * @default false
    */
  var case_sensitive_search: js.UndefOr[Boolean] = js.native
  /**
    * When set to true, Chosen will not display the search field (single selects only).
    * @default false
    */
  var disable_search: js.UndefOr[Boolean] = js.native
  /**
    * Hide the search input on single selects if there are n or fewer options.
    * @default 0
    */
  var disable_search_threshold: js.UndefOr[Double] = js.native
  /**
    * By default, Chosen includes disabled options in search results with a special styling. Setting this option to false will hide disabled results and exclude them from searches.
    * @default true
    */
  var display_disabled_options: js.UndefOr[Boolean] = js.native
  /**
    * By default, Chosen includes selected options in search results with a special styling. Setting this option to false will hide selected results and exclude them from searches.
    * Note: this is for multiple selects only. In single selects, the selected result will always be displayed.
    * @default true
    */
  var display_selected_options: js.UndefOr[Boolean] = js.native
  /**
    * By default, searching will match on any word within an option tag. Set this option to false if you want to only match on the entire text of an option tag.
    * @default true
    */
  var enable_split_word_search: js.UndefOr[Boolean] = js.native
  /**
    * By default, Chosen will search group labels as well as options, and filter to show all options below matching groups. Set this to false to search only in the options.
    * @default true
    */
  var group_search: js.UndefOr[Boolean] = js.native
  /**
    * By default, Chosen's results are hidden after a option is selected. Setting this option to false will keep the results open after selection. This only applies to multiple selects.
    * @default true
    */
  var hide_results_on_select: js.UndefOr[Boolean] = js.native
  /**
    * By default, Chosen only shows the text of a selected option. Setting this option to true will show the text and group (if any) of the selected option.
    * @default false
    */
  var include_group_label_in_selected: js.UndefOr[Boolean] = js.native
  /**
    * When set to true, Chosen will grab any classes on the original select field and add them to Chosen’s container div.
    * @default false
    */
  var inherit_select_classes: js.UndefOr[Boolean] = js.native
  /**
    * Limits how many options the user can select. When the limit is reached, the `chosen:maxselected` event is triggered.
    * @default Infinity
    */
  var max_selected_options: js.UndefOr[Double] = js.native
  /**
    * Only show the first (n) matching options in the results. This can be used to increase performance for selects with very many options.
    * @default Infinity
    */
  var max_shown_results: js.UndefOr[Double] = js.native
  /**
    * The text to be displayed when no matching results are found. The current search is shown at the end of the text (e.g., No results match "Bad Search").
    * @default "No results match"
    */
  var no_results_text: js.UndefOr[String] = js.native
  /**
    * The text to be displayed as a placeholder when no options are selected for a multiple select.
    * @default "Select Some Options"
    */
  var placeholder_text_multiple: js.UndefOr[String] = js.native
  /**
    * The text to be displayed as a placeholder when no options are selected for a single select.
    * @default "Select an Option"
    */
  var placeholder_text_single: js.UndefOr[String] = js.native
  /**
    * Chosen supports right-to-left text in select boxes. Set this option to true to support right-to-left text options.
    * @default false
    */
  var rtl: js.UndefOr[Boolean] = js.native
  /**
    * By default, Chosen’s search matches starting at the beginning of a word. Setting this option to true allows matches starting from anywhere within a word.
    * This is especially useful for options that include a lot of special characters or phrases in ()s and []s.
    * @default false
    */
  var search_contains: js.UndefOr[Boolean] = js.native
  /**
    * By default, pressing delete/backspace on multiple selects will remove a selected choice.
    * When false, pressing delete/backspace will highlight the last choice, and a second press deselects it.
    * @default true
    */
  var single_backstroke_delete: js.UndefOr[Boolean] = js.native
  /**
    * The width of the Chosen select box. By default, Chosen attempts to match the width of the select box you are replacing.
    * If your select is hidden when Chosen is instantiated, you must specify a width or the select will show up with a width of 0.
    */
  var width: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllow_single_deselect(value: Boolean): Self = this.set("allow_single_deselect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_single_deselect: Self = this.set("allow_single_deselect", js.undefined)
    @scala.inline
    def setCase_sensitive_search(value: Boolean): Self = this.set("case_sensitive_search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCase_sensitive_search: Self = this.set("case_sensitive_search", js.undefined)
    @scala.inline
    def setDisable_search(value: Boolean): Self = this.set("disable_search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable_search: Self = this.set("disable_search", js.undefined)
    @scala.inline
    def setDisable_search_threshold(value: Double): Self = this.set("disable_search_threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable_search_threshold: Self = this.set("disable_search_threshold", js.undefined)
    @scala.inline
    def setDisplay_disabled_options(value: Boolean): Self = this.set("display_disabled_options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay_disabled_options: Self = this.set("display_disabled_options", js.undefined)
    @scala.inline
    def setDisplay_selected_options(value: Boolean): Self = this.set("display_selected_options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay_selected_options: Self = this.set("display_selected_options", js.undefined)
    @scala.inline
    def setEnable_split_word_search(value: Boolean): Self = this.set("enable_split_word_search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable_split_word_search: Self = this.set("enable_split_word_search", js.undefined)
    @scala.inline
    def setGroup_search(value: Boolean): Self = this.set("group_search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup_search: Self = this.set("group_search", js.undefined)
    @scala.inline
    def setHide_results_on_select(value: Boolean): Self = this.set("hide_results_on_select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHide_results_on_select: Self = this.set("hide_results_on_select", js.undefined)
    @scala.inline
    def setInclude_group_label_in_selected(value: Boolean): Self = this.set("include_group_label_in_selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_group_label_in_selected: Self = this.set("include_group_label_in_selected", js.undefined)
    @scala.inline
    def setInherit_select_classes(value: Boolean): Self = this.set("inherit_select_classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInherit_select_classes: Self = this.set("inherit_select_classes", js.undefined)
    @scala.inline
    def setMax_selected_options(value: Double): Self = this.set("max_selected_options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_selected_options: Self = this.set("max_selected_options", js.undefined)
    @scala.inline
    def setMax_shown_results(value: Double): Self = this.set("max_shown_results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_shown_results: Self = this.set("max_shown_results", js.undefined)
    @scala.inline
    def setNo_results_text(value: String): Self = this.set("no_results_text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNo_results_text: Self = this.set("no_results_text", js.undefined)
    @scala.inline
    def setPlaceholder_text_multiple(value: String): Self = this.set("placeholder_text_multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder_text_multiple: Self = this.set("placeholder_text_multiple", js.undefined)
    @scala.inline
    def setPlaceholder_text_single(value: String): Self = this.set("placeholder_text_single", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder_text_single: Self = this.set("placeholder_text_single", js.undefined)
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    @scala.inline
    def setSearch_contains(value: Boolean): Self = this.set("search_contains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch_contains: Self = this.set("search_contains", js.undefined)
    @scala.inline
    def setSingle_backstroke_delete(value: Boolean): Self = this.set("single_backstroke_delete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingle_backstroke_delete: Self = this.set("single_backstroke_delete", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

