package typings.baseui.selectTypesMod

import typings.baseui.anon.Index
import typings.baseui.anon.LabelKey
import typings.react.mod.ChangeEvent
import typings.react.mod.ComponentType
import typings.react.mod.FocusEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectProps extends StObject {
  
  var `aria-describedby`: js.UndefOr[String | Null] = js.undefined
  
  var `aria-errormessage`: js.UndefOr[String | Null] = js.undefined
  
  var `aria-label`: js.UndefOr[String | Null] = js.undefined
  
  var `aria-labelledby`: js.UndefOr[String | Null] = js.undefined
  
  /** Defines if select element is focused on the first mount. */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  /** By default, backspace will only remove the last character of the input value. If true, the input value will be cleared. */
  var backspaceClearsInputValue: js.UndefOr[Boolean] = js.undefined
  
  /** Defines if options can be removed by pressing backspace. If you have customized labels, it will remove the option entirely, otherwise, it starts removing characters from the end of the string. */
  var backspaceRemoves: js.UndefOr[Boolean] = js.undefined
  
  /** Defines if the select value can be cleared. If true a clear icon is rendered when a value is set. */
  var clearable: js.UndefOr[Boolean] = js.undefined
  
  /** Defines if the menu closes after a selection if made. */
  var closeOnSelect: js.UndefOr[Boolean] = js.undefined
  
  /** An imperative handle exposing internal methods. */
  var controlRef: js.UndefOr[ControlRef] = js.undefined
  
  /** Defines if new options can be created along with choosing existing options. */
  var creatable: js.UndefOr[Boolean] = js.undefined
  
  /** Defines if options can be removed by pressing backspace. */
  var deleteRemoves: js.UndefOr[Boolean] = js.undefined
  
  /** Defines if the control is disabled. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /** Defines if the control is in error state. */
  var error: js.UndefOr[Boolean] = js.undefined
  
  /** Defines if the value is cleared when escape is pressed and the dropdown is closed. */
  var escapeClearsValue: js.UndefOr[Boolean] = js.undefined
  
  /** Defaults to filterOptions that excludes selected options for
    * multi select. A custom method to filter options to be displayed in the dropdown. */
  var filterOptions: js.UndefOr[
    (js.Function4[
      /* options */ Value, 
      /* filterValue */ String, 
      /* excludeOptions */ js.UndefOr[Value | Null], 
      /* a */ LabelKey, 
      Value
    ]) | Null
  ] = js.undefined
  
  /** Defines if currently selected options are filtered out in the dropdown options. */
  var filterOutSelected: js.UndefOr[Boolean] = js.undefined
  
  /** A custom method to get a display value for a dropdown option. */
  var getOptionLabel: js.UndefOr[(js.Function1[/* a */ typings.baseui.anon.Option, ReactNode]) | Null] = js.undefined
  
  /** A custom method to get a display value for a selected option. */
  var getValueLabel: js.UndefOr[(js.Function1[/* a */ Index, ReactNode]) | Null] = js.undefined
  
  /** Sets the id attribute of the internal input element. Allows for usage with labels. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Defines if the comparison for a new creatable value should be case-insensitive. */
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  
  var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
  
  /** Defines if the select is in a loading (async) state. */
  var isLoading: js.UndefOr[Boolean] = js.undefined
  
  /** Defines an option key for a default label value. */
  var labelKey: js.UndefOr[String] = js.undefined
  
  /** Sets max height of the dropdown list. */
  var maxDropdownHeight: js.UndefOr[String] = js.undefined
  
  /** Where to mount the popover */
  var mountNode: js.UndefOr[HTMLElement] = js.undefined
  
  /** Defines if multiple options can be selected. */
  var multi: js.UndefOr[Boolean] = js.undefined
  
  /** Message to be displayed if no options is found for a search query. */
  var noResultsMsg: js.UndefOr[ReactNode] = js.undefined
  
  var onBlur: js.UndefOr[js.Function1[/* e */ (FocusEvent[Element, Element]) | MouseEvent, Any]] = js.undefined
  
  /** Defines if the input value is reset to an empty string when a blur event happens on the select. */
  var onBlurResetsInput: js.UndefOr[Boolean] = js.undefined
  
  /** change handler of the select to be called when a value is changed. */
  var onChange: js.UndefOr[js.Function1[/* params */ OnChangeParams, Any]] = js.undefined
  
  /** A function that is called when the dropdown closes. */
  var onClose: js.UndefOr[js.Function0[Any] | Null] = js.undefined
  
  /** Defines if the input value is reset to an empty string when dropdown is closed. */
  var onCloseResetsInput: js.UndefOr[Boolean] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* e */ SyntheticEvent[HTMLElement, Event], Any]] = js.undefined
  
  var onInputChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
  
  /** A function that is called when the dropdown opens. */
  var onOpen: js.UndefOr[js.Function0[Any] | Null] = js.undefined
  
  /** Defines if the input value is reset to an empty string when a selection is made. */
  var onSelectResetsInput: js.UndefOr[Boolean] = js.undefined
  
  /** Defines if the dropdown opens on a click event on the select. */
  var openOnClick: js.UndefOr[Boolean] = js.undefined
  
  /** Options to be displayed in the dropdown. If an option has a
    * disabled prop value set to true it will be rendered as a disabled option in the dropdown. */
  var options: js.UndefOr[Options] = js.undefined
  
  var overrides: js.UndefOr[SelectOverrides] = js.undefined
  
  /** Sets the placeholder. */
  var placeholder: js.UndefOr[ReactNode] = js.undefined
  
  /** Defines if the control is in positive state. */
  var positive: js.UndefOr[Boolean] = js.undefined
  
  /** Defines if the select field is required to have a selection. */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /** Defines if the search functionality is enabled. */
  var searchable: js.UndefOr[Boolean] = js.undefined
  
  /** Defines the size (scale) of dropdown menu items. See the Menu component API. */
  var size: js.UndefOr[Size] = js.undefined
  
  /** If true, opens the dropdown when the select mounts. */
  var startOpen: js.UndefOr[Boolean] = js.undefined
  
  /** Defines type of the component to be in select or search mode.
    * When set to TYPE.search the search icon is rendered on the
    * left and the select arrow icon is not rendered. */
  var `type`: js.UndefOr[Type] = js.undefined
  
  /** A current selected value(s). If a selected value has a clearableValue
    * prop set to true it will be rendered as a disabled selected option that can't be cleared. */
  var value: js.UndefOr[Value] = js.undefined
  
  var valueComponent: js.UndefOr[ComponentType[Any]] = js.undefined
  
  /** Defines a key name for an option's unique identifier value.
    * The value of the `valueKey` prop is used to identify what options are selected
    * or removed from the selection, it also used for default filtering out the
    * selected options from the dropdown list. */
  var valueKey: js.UndefOr[String] = js.undefined
}
object SelectProps {
  
  inline def apply(): SelectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectProps] (val x: Self) extends AnyVal {
    
    inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `setAria-describedbyNull`: Self = StObject.set(x, "aria-describedby", null)
    
    inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `setAria-errormessageNull`: Self = StObject.set(x, "aria-errormessage", null)
    
    inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelNull`: Self = StObject.set(x, "aria-label", null)
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyNull`: Self = StObject.set(x, "aria-labelledby", null)
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setBackspaceClearsInputValue(value: Boolean): Self = StObject.set(x, "backspaceClearsInputValue", value.asInstanceOf[js.Any])
    
    inline def setBackspaceClearsInputValueUndefined: Self = StObject.set(x, "backspaceClearsInputValue", js.undefined)
    
    inline def setBackspaceRemoves(value: Boolean): Self = StObject.set(x, "backspaceRemoves", value.asInstanceOf[js.Any])
    
    inline def setBackspaceRemovesUndefined: Self = StObject.set(x, "backspaceRemoves", js.undefined)
    
    inline def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
    
    inline def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
    
    inline def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
    
    inline def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
    
    inline def setControlRef(value: ControlRef): Self = StObject.set(x, "controlRef", value.asInstanceOf[js.Any])
    
    inline def setControlRefUndefined: Self = StObject.set(x, "controlRef", js.undefined)
    
    inline def setCreatable(value: Boolean): Self = StObject.set(x, "creatable", value.asInstanceOf[js.Any])
    
    inline def setCreatableUndefined: Self = StObject.set(x, "creatable", js.undefined)
    
    inline def setDeleteRemoves(value: Boolean): Self = StObject.set(x, "deleteRemoves", value.asInstanceOf[js.Any])
    
    inline def setDeleteRemovesUndefined: Self = StObject.set(x, "deleteRemoves", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setEscapeClearsValue(value: Boolean): Self = StObject.set(x, "escapeClearsValue", value.asInstanceOf[js.Any])
    
    inline def setEscapeClearsValueUndefined: Self = StObject.set(x, "escapeClearsValue", js.undefined)
    
    inline def setFilterOptions(
      value: (/* options */ Value, /* filterValue */ String, /* excludeOptions */ js.UndefOr[Value | Null], /* a */ LabelKey) => Value
    ): Self = StObject.set(x, "filterOptions", js.Any.fromFunction4(value))
    
    inline def setFilterOptionsNull: Self = StObject.set(x, "filterOptions", null)
    
    inline def setFilterOptionsUndefined: Self = StObject.set(x, "filterOptions", js.undefined)
    
    inline def setFilterOutSelected(value: Boolean): Self = StObject.set(x, "filterOutSelected", value.asInstanceOf[js.Any])
    
    inline def setFilterOutSelectedUndefined: Self = StObject.set(x, "filterOutSelected", js.undefined)
    
    inline def setGetOptionLabel(value: /* a */ typings.baseui.anon.Option => ReactNode): Self = StObject.set(x, "getOptionLabel", js.Any.fromFunction1(value))
    
    inline def setGetOptionLabelNull: Self = StObject.set(x, "getOptionLabel", null)
    
    inline def setGetOptionLabelUndefined: Self = StObject.set(x, "getOptionLabel", js.undefined)
    
    inline def setGetValueLabel(value: /* a */ Index => ReactNode): Self = StObject.set(x, "getValueLabel", js.Any.fromFunction1(value))
    
    inline def setGetValueLabelNull: Self = StObject.set(x, "getValueLabel", null)
    
    inline def setGetValueLabelUndefined: Self = StObject.set(x, "getValueLabel", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    inline def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
    
    inline def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
    
    inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
    
    inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
    
    inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    inline def setLabelKey(value: String): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
    
    inline def setLabelKeyUndefined: Self = StObject.set(x, "labelKey", js.undefined)
    
    inline def setMaxDropdownHeight(value: String): Self = StObject.set(x, "maxDropdownHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxDropdownHeightUndefined: Self = StObject.set(x, "maxDropdownHeight", js.undefined)
    
    inline def setMountNode(value: HTMLElement): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
    
    inline def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
    
    inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    inline def setNoResultsMsg(value: ReactNode): Self = StObject.set(x, "noResultsMsg", value.asInstanceOf[js.Any])
    
    inline def setNoResultsMsgUndefined: Self = StObject.set(x, "noResultsMsg", js.undefined)
    
    inline def setOnBlur(value: /* e */ (FocusEvent[Element, Element]) | MouseEvent => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurResetsInput(value: Boolean): Self = StObject.set(x, "onBlurResetsInput", value.asInstanceOf[js.Any])
    
    inline def setOnBlurResetsInputUndefined: Self = StObject.set(x, "onBlurResetsInput", js.undefined)
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: /* params */ OnChangeParams => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClose(value: () => Any): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnCloseNull: Self = StObject.set(x, "onClose", null)
    
    inline def setOnCloseResetsInput(value: Boolean): Self = StObject.set(x, "onCloseResetsInput", value.asInstanceOf[js.Any])
    
    inline def setOnCloseResetsInputUndefined: Self = StObject.set(x, "onCloseResetsInput", js.undefined)
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnFocus(value: /* e */ SyntheticEvent[HTMLElement, Event] => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnInputChange(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onInputChange", js.Any.fromFunction1(value))
    
    inline def setOnInputChangeUndefined: Self = StObject.set(x, "onInputChange", js.undefined)
    
    inline def setOnOpen(value: () => Any): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
    
    inline def setOnOpenNull: Self = StObject.set(x, "onOpen", null)
    
    inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    inline def setOnSelectResetsInput(value: Boolean): Self = StObject.set(x, "onSelectResetsInput", value.asInstanceOf[js.Any])
    
    inline def setOnSelectResetsInputUndefined: Self = StObject.set(x, "onSelectResetsInput", js.undefined)
    
    inline def setOpenOnClick(value: Boolean): Self = StObject.set(x, "openOnClick", value.asInstanceOf[js.Any])
    
    inline def setOpenOnClickUndefined: Self = StObject.set(x, "openOnClick", js.undefined)
    
    inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setOverrides(value: SelectOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setPlaceholder(value: ReactNode): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
    
    inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    inline def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStartOpen(value: Boolean): Self = StObject.set(x, "startOpen", value.asInstanceOf[js.Any])
    
    inline def setStartOpenUndefined: Self = StObject.set(x, "startOpen", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueComponent(value: ComponentType[Any]): Self = StObject.set(x, "valueComponent", value.asInstanceOf[js.Any])
    
    inline def setValueComponentUndefined: Self = StObject.set(x, "valueComponent", js.undefined)
    
    inline def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
    
    inline def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: Option*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
