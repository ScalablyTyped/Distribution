package typings.bootstrapMultiselect

import typings.bootstrapMultiselect.bootstrapMultiselectStrings.both
import typings.bootstrapMultiselect.bootstrapMultiselectStrings.text
import typings.bootstrapMultiselect.bootstrapMultiselectStrings.value
import typings.std.Event
import typings.std.HTMLElement
import typings.std.HTMLOptionElement
import typings.std.HTMLOptionsCollection
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSelectOptions extends js.Object {
  /**
    * allSelectedText is the text displayed if all options are selected. You can disable displaying the allSelectedText by setting it to false.
    */
  var allSelectedText: js.UndefOr[String | Boolean] = js.undefined
  /**
    * The class of the multiselect button.
    * @exampl.
    * $('#example-buttonClass').multiselect({
    *      buttonClass: 'btn btn-link'
    *   });
    */
  var buttonClass: js.UndefOr[String] = js.undefined
  /**
    * The container holding both the button as well as the dropdown.
    * @exampl.
    * $('#example-buttonContainer').multiselect({
    *       buttonContainer: '<div class="btn-group" />'
    *   });
    */
  var buttonContainer: js.UndefOr[String] = js.undefined
  /**
    * A callback specifying the text shown on the button dependent on the currently selected options.
    * The callback gets the currently selected options and the select as argument and returns the string shown as button text.
    * The default buttonText callback returns nonSelectedText in the case no option is selected,
    * {@link nSelectedText} in the case more than {@link numberDisplayed} options are selected
    * and the names of the selected options if less than {@link numberDisplayed} options are selected.
    * @param options
    * @param select
    */
  var buttonText: js.UndefOr[
    js.Function2[/* options */ HTMLOptionsCollection, /* select */ HTMLSelectElement, String]
  ] = js.undefined
  /**
    * A callback specifying the title of the button.
    * The callback gets the currently selected options and the select as argument and returns the title of the button as string.
    * The default buttonTitle callback returns nonSelectedText in the case no option is selected and the names of the selected options of less than {@link numberDisplayed} options are selected.
    * If more than numberDisplayed options are selected, {@link nSelectedText} is returned.
    * @param options
    * @param select
    */
  var buttonTitle: js.UndefOr[
    js.Function2[/* options */ js.Array[HTMLOptionElement], /* select */ HTMLSelectElement, String]
  ] = js.undefined
  /**
    * The width of the multiselect button may be fixed using this option.
    * Actually, buttonWidth describes the width of the .btn-group container and the width of the button is set to 100%.
    * @example.
    * $('#example-buttonWidth').multiselect({
    *       buttonWidth: '400px'
    *   });
    */
  var buttonWidth: js.UndefOr[String] = js.undefined
  /**
    * The name used for the generated checkboxes.
    * See {@link https://davidstutz.github.io/bootstrap-multiselect/#post|Server-Side Processing} for details.
    */
  var checkboxName: js.UndefOr[String] = js.undefined
  /**
    * Sets the separator for the list of selected items for mouse-over. Defaults to ', '. Set to '\n' for a neater display.
    */
  var delimiterText: js.UndefOr[String] = js.undefined
  /**
    * If set to true, the multiselect will be disabled if no options are given.
    */
  var disableIfEmpty: js.UndefOr[Boolean] = js.undefined
  /**
    * The text shown if the multiselect is disabled.
    * Note that this option is set to the empty string '' by default,
    * that is nonSelectedText is shown if the multiselect is disabled and no options are selected.
    */
  var disabledText: js.UndefOr[String] = js.undefined
  /**
    * The dropdown can also be dropped right.
    */
  var dropRight: js.UndefOr[Boolean] = js.undefined
  /**
    * The dropdown can also be dropped up. Note that it is recommended to also set {@link maxHeight}.
    * The plugin calculates the necessary height of the dropdown and takes the minimum of the calculated value and maxHeight.
    */
  var dropUp: js.UndefOr[Boolean] = js.undefined
  /**
    * The filter as configured above will use case sensitive filtering.
    * by setting enableCaseInsensitiveFiltering to true this behavior can be changed to use case insensitive filtering.
    */
  var enableCaseInsensitiveFiltering: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, optgroup's will be clickable, allowing to easily select multiple options belonging to the same group.
    * enableClickableOptGroups is not available in single selection mode, i.e. when the multiple attribute is not present.
    * When using selectedClass, the selected classes are also applied on the option groups.
    */
  var enableClickableOptGroups: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, optgroup's will be collapsible.
    */
  var enableCollapsibleOptGroups: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to true or false to enable or disable the filter. A filter input will be added to dynamically filter all options.
    */
  var enableFiltering: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to true to enable full value filtering, that is all options are shown where the query is a prefix of.
    */
  var enableFullValueFiltering: js.UndefOr[Boolean] = js.undefined
  /**
    * XSS injection is a serious threat for all modern web applications. Setting enableHTML to false (default setting) will create a XSS safe multiselect.
    */
  var enableHTML: js.UndefOr[Boolean] = js.undefined
  /**
    * The options are filtered based on their text. This behavior can be changed to use the value of the options or both the text and the value.
    */
  var filterBehavior: js.UndefOr[text | value | both] = js.undefined
  /**
    * The placeholder used for the filter input.
    * @example   $('#example-filter-placeholder').multiselect({
    *        enableFiltering: true,
    *        filterPlaceholder: 'Search for something...'
    *   });
    */
  var filterPlaceholder: js.UndefOr[String] = js.undefined
  /**
    *  Set to true or false to enable or disable the select all option.
    */
  var includeSelectAllOption: js.UndefOr[Boolean] = js.undefined
  /**
    * Inherit the class of the button from the original select.
    */
  var inheritClass: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum height of the dropdown. This is useful when using the plugin with plenty of options.
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  /**
    * The text displayed if more than  {@link numberDisplayed} options are selected. This option is used by the default buttonText and buttonTitle callbacks.
    */
  var nSelectedText: js.UndefOr[String] = js.undefined
  /**
    * The text displayed when no option is selected. This option is used in the default buttonText and buttonTitle functions.
    */
  var nonSelectedText: js.UndefOr[String] = js.undefined
  /**
    * This option is used by the buttonText and buttonTitle functions to determine of too much options would be displayed.
    */
  var numberDisplayed: js.UndefOr[Double] = js.undefined
  /**
    * A function which is triggered on the change event of the options.
    * Note that the event is not triggered when selecting or deselecting options using the select and deselect methods provided by the plugin.
    * @param option The option item that was changed, wrapped in a JQuery object.
    * @param checked Whether the checkbox was checked or not.
    */
  var onChange: js.UndefOr[js.Function2[/* option */ JQuery, /* checked */ Boolean, Unit]] = js.undefined
  /**
    * This function is triggered when the select all option is used to deselect all options.
    * Note that this can also be triggered manually using the {@link .multiselect('deselectAll')} method.
    * Note that the onChange option is not triggered when (de)selecting all options using the select all option.
    * The onDeselectAll option is only triggered if the select all option was unchecked.
    * it is not triggered if all options were unchecked manually (causing the select all option to be unchecked as well).
    */
  var onDeselectAll: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A callback called after the dropdown has been closed.
    * The onDropdownHidden option is not available when using Twitter Bootstrap 2.3.
    */
  var onDropdownHidden: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  /**
    * A callback called when the dropdown is closed.
    * The onDropdownHide option is not available when using Twitter Bootstrap 2.3.
    */
  var onDropdownHide: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  /**
    * A callback called when the dropdown is shown.
    * The onDropdownShow option is not available when using Twitter Bootstrap 2.3.
    */
  var onDropdownShow: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  /**
    * A callback called after the dropdown has been shown.
    * The onDropdownShown option is not available when using Twitter Bootstrap 2.3.
    */
  var onDropdownShown: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  /**
    * A function which is triggered when the multiselect is finished initializing.
    */
  var onInitialized: js.UndefOr[js.Function2[/* select */ HTMLSelectElement, /* container */ HTMLElement, Unit]] = js.undefined
  /**
    * This function is triggered when the select all option is used to select all options.
    * Note that this can also be triggered manually using the {@link .multiselect('selectAll')} method.
    * Note that the onChange option is not triggered when (de)selecting all options using the select all option.
    * The onSelectAll option is only triggered if the select all option was checked.
    * it is not triggered if all options were checked manually (causing the select all option to be checked as well).
    */
  var onSelectAll: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A callback used to define the classes for the li elements containing checkboxes and labels.
    */
  var optionClass: js.UndefOr[js.Function1[/* element */ HTMLElement, String]] = js.undefined
  /**
    * A callback used to define the labels of the options.
    */
  var optionLabel: js.UndefOr[js.Function1[/* element */ HTMLElement, String]] = js.undefined
  /**
    * Setting both {@link includeSelectAllOption} and {@link enableFiltering} to true, the select all option does always select only the visible option.
    * With setting selectAllJustVisible to false this behavior is changed such that always all options (irrespective of whether they are visible) are selected.
    */
  var selectAllJustVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * This option allows to control the name given to the select all option.
    * See {@link https://davidstutz.github.io/bootstrap-multiselect/#post|Server-Side Processing} for more details.
    */
  var selectAllName: js.UndefOr[String] = js.undefined
  /**
    * If set to true (default), the number of selected options will be shown in parantheses when all options are seleted.
    */
  var selectAllNumber: js.UndefOr[Boolean] = js.undefined
  /**
    * The text displayed for the select all option.
    */
  var selectAllText: js.UndefOr[String] = js.undefined
  /**
    * The select all option is added as additional option within the select.
    * To distinguish this option from the original options the value used for the select all option can be configured using the selectAllValue option.
    */
  var selectAllValue: js.UndefOr[String | Double] = js.undefined
  /**
    * The class(es) applied on selected options.
    */
  var selectedClass: js.UndefOr[String] = js.undefined
  /**
    * The generated HTML markup can be controlled using templates. Basically, templates are simple configuration options.
    */
  var templates: js.UndefOr[Templates] = js.undefined
}

object MultiSelectOptions {
  @scala.inline
  def apply(
    allSelectedText: String | Boolean = null,
    buttonClass: String = null,
    buttonContainer: String = null,
    buttonText: (/* options */ HTMLOptionsCollection, /* select */ HTMLSelectElement) => String = null,
    buttonTitle: (/* options */ js.Array[HTMLOptionElement], /* select */ HTMLSelectElement) => String = null,
    buttonWidth: String = null,
    checkboxName: String = null,
    delimiterText: String = null,
    disableIfEmpty: js.UndefOr[Boolean] = js.undefined,
    disabledText: String = null,
    dropRight: js.UndefOr[Boolean] = js.undefined,
    dropUp: js.UndefOr[Boolean] = js.undefined,
    enableCaseInsensitiveFiltering: js.UndefOr[Boolean] = js.undefined,
    enableClickableOptGroups: js.UndefOr[Boolean] = js.undefined,
    enableCollapsibleOptGroups: js.UndefOr[Boolean] = js.undefined,
    enableFiltering: js.UndefOr[Boolean] = js.undefined,
    enableFullValueFiltering: js.UndefOr[Boolean] = js.undefined,
    enableHTML: js.UndefOr[Boolean] = js.undefined,
    filterBehavior: text | value | both = null,
    filterPlaceholder: String = null,
    includeSelectAllOption: js.UndefOr[Boolean] = js.undefined,
    inheritClass: js.UndefOr[Boolean] = js.undefined,
    maxHeight: js.UndefOr[Double] = js.undefined,
    nSelectedText: String = null,
    nonSelectedText: String = null,
    numberDisplayed: js.UndefOr[Double] = js.undefined,
    onChange: (/* option */ JQuery, /* checked */ Boolean) => Unit = null,
    onDeselectAll: () => Unit = null,
    onDropdownHidden: /* event */ Event => Unit = null,
    onDropdownHide: /* event */ Event => Unit = null,
    onDropdownShow: /* event */ Event => Unit = null,
    onDropdownShown: /* event */ Event => Unit = null,
    onInitialized: (/* select */ HTMLSelectElement, /* container */ HTMLElement) => Unit = null,
    onSelectAll: () => Unit = null,
    optionClass: /* element */ HTMLElement => String = null,
    optionLabel: /* element */ HTMLElement => String = null,
    selectAllJustVisible: js.UndefOr[Boolean] = js.undefined,
    selectAllName: String = null,
    selectAllNumber: js.UndefOr[Boolean] = js.undefined,
    selectAllText: String = null,
    selectAllValue: String | Double = null,
    selectedClass: String = null,
    templates: Templates = null
  ): MultiSelectOptions = {
    val __obj = js.Dynamic.literal()
    if (allSelectedText != null) __obj.updateDynamic("allSelectedText")(allSelectedText.asInstanceOf[js.Any])
    if (buttonClass != null) __obj.updateDynamic("buttonClass")(buttonClass.asInstanceOf[js.Any])
    if (buttonContainer != null) __obj.updateDynamic("buttonContainer")(buttonContainer.asInstanceOf[js.Any])
    if (buttonText != null) __obj.updateDynamic("buttonText")(js.Any.fromFunction2(buttonText))
    if (buttonTitle != null) __obj.updateDynamic("buttonTitle")(js.Any.fromFunction2(buttonTitle))
    if (buttonWidth != null) __obj.updateDynamic("buttonWidth")(buttonWidth.asInstanceOf[js.Any])
    if (checkboxName != null) __obj.updateDynamic("checkboxName")(checkboxName.asInstanceOf[js.Any])
    if (delimiterText != null) __obj.updateDynamic("delimiterText")(delimiterText.asInstanceOf[js.Any])
    if (!js.isUndefined(disableIfEmpty)) __obj.updateDynamic("disableIfEmpty")(disableIfEmpty.get.asInstanceOf[js.Any])
    if (disabledText != null) __obj.updateDynamic("disabledText")(disabledText.asInstanceOf[js.Any])
    if (!js.isUndefined(dropRight)) __obj.updateDynamic("dropRight")(dropRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dropUp)) __obj.updateDynamic("dropUp")(dropUp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCaseInsensitiveFiltering)) __obj.updateDynamic("enableCaseInsensitiveFiltering")(enableCaseInsensitiveFiltering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableClickableOptGroups)) __obj.updateDynamic("enableClickableOptGroups")(enableClickableOptGroups.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCollapsibleOptGroups)) __obj.updateDynamic("enableCollapsibleOptGroups")(enableCollapsibleOptGroups.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFiltering)) __obj.updateDynamic("enableFiltering")(enableFiltering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFullValueFiltering)) __obj.updateDynamic("enableFullValueFiltering")(enableFullValueFiltering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHTML)) __obj.updateDynamic("enableHTML")(enableHTML.get.asInstanceOf[js.Any])
    if (filterBehavior != null) __obj.updateDynamic("filterBehavior")(filterBehavior.asInstanceOf[js.Any])
    if (filterPlaceholder != null) __obj.updateDynamic("filterPlaceholder")(filterPlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSelectAllOption)) __obj.updateDynamic("includeSelectAllOption")(includeSelectAllOption.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inheritClass)) __obj.updateDynamic("inheritClass")(inheritClass.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (nSelectedText != null) __obj.updateDynamic("nSelectedText")(nSelectedText.asInstanceOf[js.Any])
    if (nonSelectedText != null) __obj.updateDynamic("nonSelectedText")(nonSelectedText.asInstanceOf[js.Any])
    if (!js.isUndefined(numberDisplayed)) __obj.updateDynamic("numberDisplayed")(numberDisplayed.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onDeselectAll != null) __obj.updateDynamic("onDeselectAll")(js.Any.fromFunction0(onDeselectAll))
    if (onDropdownHidden != null) __obj.updateDynamic("onDropdownHidden")(js.Any.fromFunction1(onDropdownHidden))
    if (onDropdownHide != null) __obj.updateDynamic("onDropdownHide")(js.Any.fromFunction1(onDropdownHide))
    if (onDropdownShow != null) __obj.updateDynamic("onDropdownShow")(js.Any.fromFunction1(onDropdownShow))
    if (onDropdownShown != null) __obj.updateDynamic("onDropdownShown")(js.Any.fromFunction1(onDropdownShown))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction2(onInitialized))
    if (onSelectAll != null) __obj.updateDynamic("onSelectAll")(js.Any.fromFunction0(onSelectAll))
    if (optionClass != null) __obj.updateDynamic("optionClass")(js.Any.fromFunction1(optionClass))
    if (optionLabel != null) __obj.updateDynamic("optionLabel")(js.Any.fromFunction1(optionLabel))
    if (!js.isUndefined(selectAllJustVisible)) __obj.updateDynamic("selectAllJustVisible")(selectAllJustVisible.get.asInstanceOf[js.Any])
    if (selectAllName != null) __obj.updateDynamic("selectAllName")(selectAllName.asInstanceOf[js.Any])
    if (!js.isUndefined(selectAllNumber)) __obj.updateDynamic("selectAllNumber")(selectAllNumber.get.asInstanceOf[js.Any])
    if (selectAllText != null) __obj.updateDynamic("selectAllText")(selectAllText.asInstanceOf[js.Any])
    if (selectAllValue != null) __obj.updateDynamic("selectAllValue")(selectAllValue.asInstanceOf[js.Any])
    if (selectedClass != null) __obj.updateDynamic("selectedClass")(selectedClass.asInstanceOf[js.Any])
    if (templates != null) __obj.updateDynamic("templates")(templates.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSelectOptions]
  }
}

