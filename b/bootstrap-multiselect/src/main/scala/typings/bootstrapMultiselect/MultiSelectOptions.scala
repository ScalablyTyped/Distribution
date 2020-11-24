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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiSelectOptions extends js.Object {
  
  /**
    * allSelectedText is the text displayed if all options are selected. You can disable displaying the allSelectedText by setting it to false.
    */
  var allSelectedText: js.UndefOr[String | Boolean] = js.native
  
  /**
    * The class of the multiselect button.
    * @exampl.
    * $('#example-buttonClass').multiselect({
    *      buttonClass: 'btn btn-link'
    *   });
    */
  var buttonClass: js.UndefOr[String] = js.native
  
  /**
    * The container holding both the button as well as the dropdown.
    * @exampl.
    * $('#example-buttonContainer').multiselect({
    *       buttonContainer: '<div class="btn-group" />'
    *   });
    */
  var buttonContainer: js.UndefOr[String] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  /**
    * The width of the multiselect button may be fixed using this option.
    * Actually, buttonWidth describes the width of the .btn-group container and the width of the button is set to 100%.
    * @example.
    * $('#example-buttonWidth').multiselect({
    *       buttonWidth: '400px'
    *   });
    */
  var buttonWidth: js.UndefOr[String] = js.native
  
  /**
    * The name used for the generated checkboxes.
    * See {@link https://davidstutz.github.io/bootstrap-multiselect/#post|Server-Side Processing} for details.
    */
  var checkboxName: js.UndefOr[String] = js.native
  
  /**
    * Sets the separator for the list of selected items for mouse-over. Defaults to ', '. Set to '\n' for a neater display.
    */
  var delimiterText: js.UndefOr[String] = js.native
  
  /**
    * If set to true, the multiselect will be disabled if no options are given.
    */
  var disableIfEmpty: js.UndefOr[Boolean] = js.native
  
  /**
    * The text shown if the multiselect is disabled.
    * Note that this option is set to the empty string '' by default,
    * that is nonSelectedText is shown if the multiselect is disabled and no options are selected.
    */
  var disabledText: js.UndefOr[String] = js.native
  
  /**
    * The dropdown can also be dropped right.
    */
  var dropRight: js.UndefOr[Boolean] = js.native
  
  /**
    * The dropdown can also be dropped up. Note that it is recommended to also set {@link maxHeight}.
    * The plugin calculates the necessary height of the dropdown and takes the minimum of the calculated value and maxHeight.
    */
  var dropUp: js.UndefOr[Boolean] = js.native
  
  /**
    * The filter as configured above will use case sensitive filtering.
    * by setting enableCaseInsensitiveFiltering to true this behavior can be changed to use case insensitive filtering.
    */
  var enableCaseInsensitiveFiltering: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, optgroup's will be clickable, allowing to easily select multiple options belonging to the same group.
    * enableClickableOptGroups is not available in single selection mode, i.e. when the multiple attribute is not present.
    * When using selectedClass, the selected classes are also applied on the option groups.
    */
  var enableClickableOptGroups: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, optgroup's will be collapsible.
    */
  var enableCollapsibleOptGroups: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to true or false to enable or disable the filter. A filter input will be added to dynamically filter all options.
    */
  var enableFiltering: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to true to enable full value filtering, that is all options are shown where the query is a prefix of.
    */
  var enableFullValueFiltering: js.UndefOr[Boolean] = js.native
  
  /**
    * XSS injection is a serious threat for all modern web applications. Setting enableHTML to false (default setting) will create a XSS safe multiselect.
    */
  var enableHTML: js.UndefOr[Boolean] = js.native
  
  /**
    * The options are filtered based on their text. This behavior can be changed to use the value of the options or both the text and the value.
    */
  var filterBehavior: js.UndefOr[text | value | both] = js.native
  
  /**
    * The placeholder used for the filter input.
    * @example   $('#example-filter-placeholder').multiselect({
    *        enableFiltering: true,
    *        filterPlaceholder: 'Search for something...'
    *   });
    */
  var filterPlaceholder: js.UndefOr[String] = js.native
  
  /**
    *  Set to true or false to enable or disable the select all option.
    */
  var includeSelectAllOption: js.UndefOr[Boolean] = js.native
  
  /**
    * Inherit the class of the button from the original select.
    */
  var inheritClass: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum height of the dropdown. This is useful when using the plugin with plenty of options.
    */
  var maxHeight: js.UndefOr[Double] = js.native
  
  /**
    * The text displayed if more than  {@link numberDisplayed} options are selected. This option is used by the default buttonText and buttonTitle callbacks.
    */
  var nSelectedText: js.UndefOr[String] = js.native
  
  /**
    * The text displayed when no option is selected. This option is used in the default buttonText and buttonTitle functions.
    */
  var nonSelectedText: js.UndefOr[String] = js.native
  
  /**
    * This option is used by the buttonText and buttonTitle functions to determine of too much options would be displayed.
    */
  var numberDisplayed: js.UndefOr[Double] = js.native
  
  /**
    * A function which is triggered on the change event of the options.
    * Note that the event is not triggered when selecting or deselecting options using the select and deselect methods provided by the plugin.
    * @param option The option item that was changed, wrapped in a JQuery object.
    * @param checked Whether the checkbox was checked or not.
    */
  var onChange: js.UndefOr[js.Function2[/* option */ JQuery, /* checked */ Boolean, Unit]] = js.native
  
  /**
    * This function is triggered when the select all option is used to deselect all options.
    * Note that this can also be triggered manually using the {@link .multiselect('deselectAll')} method.
    * Note that the onChange option is not triggered when (de)selecting all options using the select all option.
    * The onDeselectAll option is only triggered if the select all option was unchecked.
    * it is not triggered if all options were unchecked manually (causing the select all option to be unchecked as well).
    */
  var onDeselectAll: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * A callback called after the dropdown has been closed.
    * The onDropdownHidden option is not available when using Twitter Bootstrap 2.3.
    */
  var onDropdownHidden: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  /**
    * A callback called when the dropdown is closed.
    * The onDropdownHide option is not available when using Twitter Bootstrap 2.3.
    */
  var onDropdownHide: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  /**
    * A callback called when the dropdown is shown.
    * The onDropdownShow option is not available when using Twitter Bootstrap 2.3.
    */
  var onDropdownShow: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  /**
    * A callback called after the dropdown has been shown.
    * The onDropdownShown option is not available when using Twitter Bootstrap 2.3.
    */
  var onDropdownShown: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  /**
    * A function which is triggered when the multiselect is finished initializing.
    */
  var onInitialized: js.UndefOr[js.Function2[/* select */ HTMLSelectElement, /* container */ HTMLElement, Unit]] = js.native
  
  /**
    * This function is triggered when the select all option is used to select all options.
    * Note that this can also be triggered manually using the {@link .multiselect('selectAll')} method.
    * Note that the onChange option is not triggered when (de)selecting all options using the select all option.
    * The onSelectAll option is only triggered if the select all option was checked.
    * it is not triggered if all options were checked manually (causing the select all option to be checked as well).
    */
  var onSelectAll: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * A callback used to define the classes for the li elements containing checkboxes and labels.
    */
  var optionClass: js.UndefOr[js.Function1[/* element */ HTMLElement, String]] = js.native
  
  /**
    * A callback used to define the labels of the options.
    */
  var optionLabel: js.UndefOr[js.Function1[/* element */ HTMLElement, String]] = js.native
  
  /**
    * Setting both {@link includeSelectAllOption} and {@link enableFiltering} to true, the select all option does always select only the visible option.
    * With setting selectAllJustVisible to false this behavior is changed such that always all options (irrespective of whether they are visible) are selected.
    */
  var selectAllJustVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * This option allows to control the name given to the select all option.
    * See {@link https://davidstutz.github.io/bootstrap-multiselect/#post|Server-Side Processing} for more details.
    */
  var selectAllName: js.UndefOr[String] = js.native
  
  /**
    * If set to true (default), the number of selected options will be shown in parantheses when all options are seleted.
    */
  var selectAllNumber: js.UndefOr[Boolean] = js.native
  
  /**
    * The text displayed for the select all option.
    */
  var selectAllText: js.UndefOr[String] = js.native
  
  /**
    * The select all option is added as additional option within the select.
    * To distinguish this option from the original options the value used for the select all option can be configured using the selectAllValue option.
    */
  var selectAllValue: js.UndefOr[String | Double] = js.native
  
  /**
    * The class(es) applied on selected options.
    */
  var selectedClass: js.UndefOr[String] = js.native
  
  /**
    * The generated HTML markup can be controlled using templates. Basically, templates are simple configuration options.
    */
  var templates: js.UndefOr[Templates] = js.native
}
object MultiSelectOptions {
  
  @scala.inline
  def apply(): MultiSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiSelectOptions]
  }
  
  @scala.inline
  implicit class MultiSelectOptionsOps[Self <: MultiSelectOptions] (val x: Self) extends AnyVal {
    
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
    def setAllSelectedText(value: String | Boolean): Self = this.set("allSelectedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllSelectedText: Self = this.set("allSelectedText", js.undefined)
    
    @scala.inline
    def setButtonClass(value: String): Self = this.set("buttonClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonClass: Self = this.set("buttonClass", js.undefined)
    
    @scala.inline
    def setButtonContainer(value: String): Self = this.set("buttonContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonContainer: Self = this.set("buttonContainer", js.undefined)
    
    @scala.inline
    def setButtonText(value: (/* options */ HTMLOptionsCollection, /* select */ HTMLSelectElement) => String): Self = this.set("buttonText", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteButtonText: Self = this.set("buttonText", js.undefined)
    
    @scala.inline
    def setButtonTitle(value: (/* options */ js.Array[HTMLOptionElement], /* select */ HTMLSelectElement) => String): Self = this.set("buttonTitle", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteButtonTitle: Self = this.set("buttonTitle", js.undefined)
    
    @scala.inline
    def setButtonWidth(value: String): Self = this.set("buttonWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonWidth: Self = this.set("buttonWidth", js.undefined)
    
    @scala.inline
    def setCheckboxName(value: String): Self = this.set("checkboxName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckboxName: Self = this.set("checkboxName", js.undefined)
    
    @scala.inline
    def setDelimiterText(value: String): Self = this.set("delimiterText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiterText: Self = this.set("delimiterText", js.undefined)
    
    @scala.inline
    def setDisableIfEmpty(value: Boolean): Self = this.set("disableIfEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableIfEmpty: Self = this.set("disableIfEmpty", js.undefined)
    
    @scala.inline
    def setDisabledText(value: String): Self = this.set("disabledText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledText: Self = this.set("disabledText", js.undefined)
    
    @scala.inline
    def setDropRight(value: Boolean): Self = this.set("dropRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropRight: Self = this.set("dropRight", js.undefined)
    
    @scala.inline
    def setDropUp(value: Boolean): Self = this.set("dropUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropUp: Self = this.set("dropUp", js.undefined)
    
    @scala.inline
    def setEnableCaseInsensitiveFiltering(value: Boolean): Self = this.set("enableCaseInsensitiveFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCaseInsensitiveFiltering: Self = this.set("enableCaseInsensitiveFiltering", js.undefined)
    
    @scala.inline
    def setEnableClickableOptGroups(value: Boolean): Self = this.set("enableClickableOptGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableClickableOptGroups: Self = this.set("enableClickableOptGroups", js.undefined)
    
    @scala.inline
    def setEnableCollapsibleOptGroups(value: Boolean): Self = this.set("enableCollapsibleOptGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCollapsibleOptGroups: Self = this.set("enableCollapsibleOptGroups", js.undefined)
    
    @scala.inline
    def setEnableFiltering(value: Boolean): Self = this.set("enableFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableFiltering: Self = this.set("enableFiltering", js.undefined)
    
    @scala.inline
    def setEnableFullValueFiltering(value: Boolean): Self = this.set("enableFullValueFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableFullValueFiltering: Self = this.set("enableFullValueFiltering", js.undefined)
    
    @scala.inline
    def setEnableHTML(value: Boolean): Self = this.set("enableHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableHTML: Self = this.set("enableHTML", js.undefined)
    
    @scala.inline
    def setFilterBehavior(value: text | value | both): Self = this.set("filterBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterBehavior: Self = this.set("filterBehavior", js.undefined)
    
    @scala.inline
    def setFilterPlaceholder(value: String): Self = this.set("filterPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterPlaceholder: Self = this.set("filterPlaceholder", js.undefined)
    
    @scala.inline
    def setIncludeSelectAllOption(value: Boolean): Self = this.set("includeSelectAllOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeSelectAllOption: Self = this.set("includeSelectAllOption", js.undefined)
    
    @scala.inline
    def setInheritClass(value: Boolean): Self = this.set("inheritClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInheritClass: Self = this.set("inheritClass", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setNSelectedText(value: String): Self = this.set("nSelectedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNSelectedText: Self = this.set("nSelectedText", js.undefined)
    
    @scala.inline
    def setNonSelectedText(value: String): Self = this.set("nonSelectedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonSelectedText: Self = this.set("nonSelectedText", js.undefined)
    
    @scala.inline
    def setNumberDisplayed(value: Double): Self = this.set("numberDisplayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberDisplayed: Self = this.set("numberDisplayed", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* option */ JQuery, /* checked */ Boolean) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnDeselectAll(value: () => Unit): Self = this.set("onDeselectAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDeselectAll: Self = this.set("onDeselectAll", js.undefined)
    
    @scala.inline
    def setOnDropdownHidden(value: /* event */ Event => Unit): Self = this.set("onDropdownHidden", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDropdownHidden: Self = this.set("onDropdownHidden", js.undefined)
    
    @scala.inline
    def setOnDropdownHide(value: /* event */ Event => Unit): Self = this.set("onDropdownHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDropdownHide: Self = this.set("onDropdownHide", js.undefined)
    
    @scala.inline
    def setOnDropdownShow(value: /* event */ Event => Unit): Self = this.set("onDropdownShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDropdownShow: Self = this.set("onDropdownShow", js.undefined)
    
    @scala.inline
    def setOnDropdownShown(value: /* event */ Event => Unit): Self = this.set("onDropdownShown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDropdownShown: Self = this.set("onDropdownShown", js.undefined)
    
    @scala.inline
    def setOnInitialized(value: (/* select */ HTMLSelectElement, /* container */ HTMLElement) => Unit): Self = this.set("onInitialized", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnInitialized: Self = this.set("onInitialized", js.undefined)
    
    @scala.inline
    def setOnSelectAll(value: () => Unit): Self = this.set("onSelectAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSelectAll: Self = this.set("onSelectAll", js.undefined)
    
    @scala.inline
    def setOptionClass(value: /* element */ HTMLElement => String): Self = this.set("optionClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOptionClass: Self = this.set("optionClass", js.undefined)
    
    @scala.inline
    def setOptionLabel(value: /* element */ HTMLElement => String): Self = this.set("optionLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOptionLabel: Self = this.set("optionLabel", js.undefined)
    
    @scala.inline
    def setSelectAllJustVisible(value: Boolean): Self = this.set("selectAllJustVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectAllJustVisible: Self = this.set("selectAllJustVisible", js.undefined)
    
    @scala.inline
    def setSelectAllName(value: String): Self = this.set("selectAllName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectAllName: Self = this.set("selectAllName", js.undefined)
    
    @scala.inline
    def setSelectAllNumber(value: Boolean): Self = this.set("selectAllNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectAllNumber: Self = this.set("selectAllNumber", js.undefined)
    
    @scala.inline
    def setSelectAllText(value: String): Self = this.set("selectAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectAllText: Self = this.set("selectAllText", js.undefined)
    
    @scala.inline
    def setSelectAllValue(value: String | Double): Self = this.set("selectAllValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectAllValue: Self = this.set("selectAllValue", js.undefined)
    
    @scala.inline
    def setSelectedClass(value: String): Self = this.set("selectedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedClass: Self = this.set("selectedClass", js.undefined)
    
    @scala.inline
    def setTemplates(value: Templates): Self = this.set("templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplates: Self = this.set("templates", js.undefined)
  }
}
