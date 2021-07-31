package typings.bootstrapMultiselect

import typings.bootstrapMultiselect.bootstrapMultiselectStrings.both
import typings.bootstrapMultiselect.bootstrapMultiselectStrings.text
import typings.bootstrapMultiselect.bootstrapMultiselectStrings.value
import typings.std.Event
import typings.std.HTMLElement
import typings.std.HTMLOptionElement
import typings.std.HTMLOptionsCollection
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiSelectOptions extends StObject {
  
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
  def apply(): MultiSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiSelectOptions]
  }
  
  @scala.inline
  implicit class MultiSelectOptionsMutableBuilder[Self <: MultiSelectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllSelectedText(value: String | Boolean): Self = StObject.set(x, "allSelectedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllSelectedTextUndefined: Self = StObject.set(x, "allSelectedText", js.undefined)
    
    @scala.inline
    def setButtonClass(value: String): Self = StObject.set(x, "buttonClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonClassUndefined: Self = StObject.set(x, "buttonClass", js.undefined)
    
    @scala.inline
    def setButtonContainer(value: String): Self = StObject.set(x, "buttonContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonContainerUndefined: Self = StObject.set(x, "buttonContainer", js.undefined)
    
    @scala.inline
    def setButtonText(value: (/* options */ HTMLOptionsCollection, /* select */ HTMLSelectElement) => String): Self = StObject.set(x, "buttonText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
    
    @scala.inline
    def setButtonTitle(value: (/* options */ js.Array[HTMLOptionElement], /* select */ HTMLSelectElement) => String): Self = StObject.set(x, "buttonTitle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setButtonTitleUndefined: Self = StObject.set(x, "buttonTitle", js.undefined)
    
    @scala.inline
    def setButtonWidth(value: String): Self = StObject.set(x, "buttonWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonWidthUndefined: Self = StObject.set(x, "buttonWidth", js.undefined)
    
    @scala.inline
    def setCheckboxName(value: String): Self = StObject.set(x, "checkboxName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxNameUndefined: Self = StObject.set(x, "checkboxName", js.undefined)
    
    @scala.inline
    def setDelimiterText(value: String): Self = StObject.set(x, "delimiterText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterTextUndefined: Self = StObject.set(x, "delimiterText", js.undefined)
    
    @scala.inline
    def setDisableIfEmpty(value: Boolean): Self = StObject.set(x, "disableIfEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableIfEmptyUndefined: Self = StObject.set(x, "disableIfEmpty", js.undefined)
    
    @scala.inline
    def setDisabledText(value: String): Self = StObject.set(x, "disabledText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledTextUndefined: Self = StObject.set(x, "disabledText", js.undefined)
    
    @scala.inline
    def setDropRight(value: Boolean): Self = StObject.set(x, "dropRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropRightUndefined: Self = StObject.set(x, "dropRight", js.undefined)
    
    @scala.inline
    def setDropUp(value: Boolean): Self = StObject.set(x, "dropUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropUpUndefined: Self = StObject.set(x, "dropUp", js.undefined)
    
    @scala.inline
    def setEnableCaseInsensitiveFiltering(value: Boolean): Self = StObject.set(x, "enableCaseInsensitiveFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCaseInsensitiveFilteringUndefined: Self = StObject.set(x, "enableCaseInsensitiveFiltering", js.undefined)
    
    @scala.inline
    def setEnableClickableOptGroups(value: Boolean): Self = StObject.set(x, "enableClickableOptGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableClickableOptGroupsUndefined: Self = StObject.set(x, "enableClickableOptGroups", js.undefined)
    
    @scala.inline
    def setEnableCollapsibleOptGroups(value: Boolean): Self = StObject.set(x, "enableCollapsibleOptGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCollapsibleOptGroupsUndefined: Self = StObject.set(x, "enableCollapsibleOptGroups", js.undefined)
    
    @scala.inline
    def setEnableFiltering(value: Boolean): Self = StObject.set(x, "enableFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableFilteringUndefined: Self = StObject.set(x, "enableFiltering", js.undefined)
    
    @scala.inline
    def setEnableFullValueFiltering(value: Boolean): Self = StObject.set(x, "enableFullValueFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableFullValueFilteringUndefined: Self = StObject.set(x, "enableFullValueFiltering", js.undefined)
    
    @scala.inline
    def setEnableHTML(value: Boolean): Self = StObject.set(x, "enableHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHTMLUndefined: Self = StObject.set(x, "enableHTML", js.undefined)
    
    @scala.inline
    def setFilterBehavior(value: text | value | both): Self = StObject.set(x, "filterBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterBehaviorUndefined: Self = StObject.set(x, "filterBehavior", js.undefined)
    
    @scala.inline
    def setFilterPlaceholder(value: String): Self = StObject.set(x, "filterPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterPlaceholderUndefined: Self = StObject.set(x, "filterPlaceholder", js.undefined)
    
    @scala.inline
    def setIncludeSelectAllOption(value: Boolean): Self = StObject.set(x, "includeSelectAllOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeSelectAllOptionUndefined: Self = StObject.set(x, "includeSelectAllOption", js.undefined)
    
    @scala.inline
    def setInheritClass(value: Boolean): Self = StObject.set(x, "inheritClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritClassUndefined: Self = StObject.set(x, "inheritClass", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setNSelectedText(value: String): Self = StObject.set(x, "nSelectedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNSelectedTextUndefined: Self = StObject.set(x, "nSelectedText", js.undefined)
    
    @scala.inline
    def setNonSelectedText(value: String): Self = StObject.set(x, "nonSelectedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonSelectedTextUndefined: Self = StObject.set(x, "nonSelectedText", js.undefined)
    
    @scala.inline
    def setNumberDisplayed(value: Double): Self = StObject.set(x, "numberDisplayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberDisplayedUndefined: Self = StObject.set(x, "numberDisplayed", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* option */ JQuery, /* checked */ Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnDeselectAll(value: () => Unit): Self = StObject.set(x, "onDeselectAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDeselectAllUndefined: Self = StObject.set(x, "onDeselectAll", js.undefined)
    
    @scala.inline
    def setOnDropdownHidden(value: /* event */ Event => Unit): Self = StObject.set(x, "onDropdownHidden", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDropdownHiddenUndefined: Self = StObject.set(x, "onDropdownHidden", js.undefined)
    
    @scala.inline
    def setOnDropdownHide(value: /* event */ Event => Unit): Self = StObject.set(x, "onDropdownHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDropdownHideUndefined: Self = StObject.set(x, "onDropdownHide", js.undefined)
    
    @scala.inline
    def setOnDropdownShow(value: /* event */ Event => Unit): Self = StObject.set(x, "onDropdownShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDropdownShowUndefined: Self = StObject.set(x, "onDropdownShow", js.undefined)
    
    @scala.inline
    def setOnDropdownShown(value: /* event */ Event => Unit): Self = StObject.set(x, "onDropdownShown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDropdownShownUndefined: Self = StObject.set(x, "onDropdownShown", js.undefined)
    
    @scala.inline
    def setOnInitialized(value: (/* select */ HTMLSelectElement, /* container */ HTMLElement) => Unit): Self = StObject.set(x, "onInitialized", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnInitializedUndefined: Self = StObject.set(x, "onInitialized", js.undefined)
    
    @scala.inline
    def setOnSelectAll(value: () => Unit): Self = StObject.set(x, "onSelectAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSelectAllUndefined: Self = StObject.set(x, "onSelectAll", js.undefined)
    
    @scala.inline
    def setOptionClass(value: /* element */ HTMLElement => String): Self = StObject.set(x, "optionClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptionClassUndefined: Self = StObject.set(x, "optionClass", js.undefined)
    
    @scala.inline
    def setOptionLabel(value: /* element */ HTMLElement => String): Self = StObject.set(x, "optionLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptionLabelUndefined: Self = StObject.set(x, "optionLabel", js.undefined)
    
    @scala.inline
    def setSelectAllJustVisible(value: Boolean): Self = StObject.set(x, "selectAllJustVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAllJustVisibleUndefined: Self = StObject.set(x, "selectAllJustVisible", js.undefined)
    
    @scala.inline
    def setSelectAllName(value: String): Self = StObject.set(x, "selectAllName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAllNameUndefined: Self = StObject.set(x, "selectAllName", js.undefined)
    
    @scala.inline
    def setSelectAllNumber(value: Boolean): Self = StObject.set(x, "selectAllNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAllNumberUndefined: Self = StObject.set(x, "selectAllNumber", js.undefined)
    
    @scala.inline
    def setSelectAllText(value: String): Self = StObject.set(x, "selectAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAllTextUndefined: Self = StObject.set(x, "selectAllText", js.undefined)
    
    @scala.inline
    def setSelectAllValue(value: String | Double): Self = StObject.set(x, "selectAllValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAllValueUndefined: Self = StObject.set(x, "selectAllValue", js.undefined)
    
    @scala.inline
    def setSelectedClass(value: String): Self = StObject.set(x, "selectedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedClassUndefined: Self = StObject.set(x, "selectedClass", js.undefined)
    
    @scala.inline
    def setTemplates(value: Templates): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
  }
}
