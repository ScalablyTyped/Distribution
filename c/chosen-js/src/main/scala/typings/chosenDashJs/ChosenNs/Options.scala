package typings.chosenDashJs.ChosenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
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
  def apply(
    allow_single_deselect: js.UndefOr[Boolean] = js.undefined,
    case_sensitive_search: js.UndefOr[Boolean] = js.undefined,
    disable_search: js.UndefOr[Boolean] = js.undefined,
    disable_search_threshold: Int | Double = null,
    display_disabled_options: js.UndefOr[Boolean] = js.undefined,
    display_selected_options: js.UndefOr[Boolean] = js.undefined,
    enable_split_word_search: js.UndefOr[Boolean] = js.undefined,
    group_search: js.UndefOr[Boolean] = js.undefined,
    hide_results_on_select: js.UndefOr[Boolean] = js.undefined,
    include_group_label_in_selected: js.UndefOr[Boolean] = js.undefined,
    inherit_select_classes: js.UndefOr[Boolean] = js.undefined,
    max_selected_options: Int | Double = null,
    max_shown_results: Int | Double = null,
    no_results_text: String = null,
    placeholder_text_multiple: String = null,
    placeholder_text_single: String = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    search_contains: js.UndefOr[Boolean] = js.undefined,
    single_backstroke_delete: js.UndefOr[Boolean] = js.undefined,
    width: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_single_deselect)) __obj.updateDynamic("allow_single_deselect")(allow_single_deselect)
    if (!js.isUndefined(case_sensitive_search)) __obj.updateDynamic("case_sensitive_search")(case_sensitive_search)
    if (!js.isUndefined(disable_search)) __obj.updateDynamic("disable_search")(disable_search)
    if (disable_search_threshold != null) __obj.updateDynamic("disable_search_threshold")(disable_search_threshold.asInstanceOf[js.Any])
    if (!js.isUndefined(display_disabled_options)) __obj.updateDynamic("display_disabled_options")(display_disabled_options)
    if (!js.isUndefined(display_selected_options)) __obj.updateDynamic("display_selected_options")(display_selected_options)
    if (!js.isUndefined(enable_split_word_search)) __obj.updateDynamic("enable_split_word_search")(enable_split_word_search)
    if (!js.isUndefined(group_search)) __obj.updateDynamic("group_search")(group_search)
    if (!js.isUndefined(hide_results_on_select)) __obj.updateDynamic("hide_results_on_select")(hide_results_on_select)
    if (!js.isUndefined(include_group_label_in_selected)) __obj.updateDynamic("include_group_label_in_selected")(include_group_label_in_selected)
    if (!js.isUndefined(inherit_select_classes)) __obj.updateDynamic("inherit_select_classes")(inherit_select_classes)
    if (max_selected_options != null) __obj.updateDynamic("max_selected_options")(max_selected_options.asInstanceOf[js.Any])
    if (max_shown_results != null) __obj.updateDynamic("max_shown_results")(max_shown_results.asInstanceOf[js.Any])
    if (no_results_text != null) __obj.updateDynamic("no_results_text")(no_results_text)
    if (placeholder_text_multiple != null) __obj.updateDynamic("placeholder_text_multiple")(placeholder_text_multiple)
    if (placeholder_text_single != null) __obj.updateDynamic("placeholder_text_single")(placeholder_text_single)
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl)
    if (!js.isUndefined(search_contains)) __obj.updateDynamic("search_contains")(search_contains)
    if (!js.isUndefined(single_backstroke_delete)) __obj.updateDynamic("single_backstroke_delete")(single_backstroke_delete)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Options]
  }
}

