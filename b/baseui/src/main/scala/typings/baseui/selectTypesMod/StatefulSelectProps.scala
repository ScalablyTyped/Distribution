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

/* Inlined std.Omit<baseui.baseui/select/types.SelectProps, 'onChange' | 'overrides' | 'initialState' | 'stateReducer'> & {  overrides :baseui.baseui/select/types.SelectOverrides | undefined,   initialState :baseui.baseui/select/types.State | undefined,   stateReducer :baseui.baseui/select/types.StateReducer | undefined,   onChange :(params : baseui.baseui/select/types.OnChangeParams): unknown | undefined} */
trait StatefulSelectProps extends StObject {
  
  var `aria-describedby`: js.UndefOr[String | Null] = js.undefined
  
  var `aria-errormessage`: js.UndefOr[String | Null] = js.undefined
  
  var `aria-label`: js.UndefOr[String | Null] = js.undefined
  
  var `aria-labelledby`: js.UndefOr[String | Null] = js.undefined
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var backspaceClearsInputValue: js.UndefOr[Boolean] = js.undefined
  
  var backspaceRemoves: js.UndefOr[Boolean] = js.undefined
  
  var clearable: js.UndefOr[Boolean] = js.undefined
  
  var closeOnSelect: js.UndefOr[Boolean] = js.undefined
  
  var controlRef: js.UndefOr[ControlRef] = js.undefined
  
  var creatable: js.UndefOr[Boolean] = js.undefined
  
  var deleteRemoves: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var error: js.UndefOr[Boolean] = js.undefined
  
  var escapeClearsValue: js.UndefOr[Boolean] = js.undefined
  
  var filterOptions: js.UndefOr[
    (js.Function4[
      /* options */ Value, 
      /* filterValue */ String, 
      /* excludeOptions */ js.UndefOr[Value | Null], 
      /* a */ LabelKey, 
      Value
    ]) | Null
  ] = js.undefined
  
  var filterOutSelected: js.UndefOr[Boolean] = js.undefined
  
  var getOptionLabel: js.UndefOr[(js.Function1[/* a */ typings.baseui.anon.Option, ReactNode]) | Null] = js.undefined
  
  var getValueLabel: js.UndefOr[(js.Function1[/* a */ Index, ReactNode]) | Null] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  
  var initialState: js.UndefOr[State] = js.undefined
  
  var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
  
  var isLoading: js.UndefOr[Boolean] = js.undefined
  
  var labelKey: js.UndefOr[String] = js.undefined
  
  var maxDropdownHeight: js.UndefOr[String] = js.undefined
  
  var mountNode: js.UndefOr[HTMLElement] = js.undefined
  
  var multi: js.UndefOr[Boolean] = js.undefined
  
  var noResultsMsg: js.UndefOr[ReactNode] = js.undefined
  
  var onBlur: js.UndefOr[js.Function1[/* e */ (FocusEvent[Element, Element]) | MouseEvent, Any]] = js.undefined
  
  var onBlurResetsInput: js.UndefOr[Boolean] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* params */ OnChangeParams, Any]] = js.undefined
  
  var onClose: js.UndefOr[js.Function0[Any] | Null] = js.undefined
  
  var onCloseResetsInput: js.UndefOr[Boolean] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* e */ SyntheticEvent[HTMLElement, Event], Any]] = js.undefined
  
  var onInputChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
  
  var onOpen: js.UndefOr[js.Function0[Any] | Null] = js.undefined
  
  var onSelectResetsInput: js.UndefOr[Boolean] = js.undefined
  
  var openOnClick: js.UndefOr[Boolean] = js.undefined
  
  var options: js.UndefOr[Options] = js.undefined
  
  var overrides: js.UndefOr[SelectOverrides] = js.undefined
  
  var placeholder: js.UndefOr[ReactNode] = js.undefined
  
  var positive: js.UndefOr[Boolean] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var searchable: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Size] = js.undefined
  
  var startOpen: js.UndefOr[Boolean] = js.undefined
  
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
  
  var `type`: js.UndefOr[Type] = js.undefined
  
  var value: js.UndefOr[Value] = js.undefined
  
  var valueComponent: js.UndefOr[ComponentType[Any]] = js.undefined
  
  var valueKey: js.UndefOr[String] = js.undefined
}
object StatefulSelectProps {
  
  inline def apply(): StatefulSelectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulSelectProps]
  }
  
  extension [Self <: StatefulSelectProps](x: Self) {
    
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
    
    inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
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
    
    inline def setStateReducer(value: (/* stateType */ String, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    
    inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    
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
