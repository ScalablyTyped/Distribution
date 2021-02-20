package typings.baseui.selectMod

import typings.baseui.anon.LabelKey
import typings.baseui.anon.OptionOption
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.baseui.baseuiStrings.search
import typings.baseui.baseuiStrings.select
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectProps extends StObject {
  
  var `aria-describedby`: js.UndefOr[String] = js.native
  
  var `aria-errormessage`: js.UndefOr[String] = js.native
  
  var `aria-label`: js.UndefOr[String] = js.native
  
  var `aria-labelledby`: js.UndefOr[String] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var backspaceClearsInputValue: js.UndefOr[Boolean] = js.native
  
  var backspaceRemoves: js.UndefOr[Boolean] = js.native
  
  var clearable: js.UndefOr[Boolean] = js.native
  
  var closeOnSelect: js.UndefOr[Boolean] = js.native
  
  var controlRef: js.UndefOr[Ref[HTMLInputElement | HTMLDivElement]] = js.native
  
  var creatable: js.UndefOr[Boolean] = js.native
  
  var deleteRemoves: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var error: js.UndefOr[Boolean] = js.native
  
  var escapeClearsValue: js.UndefOr[Boolean] = js.native
  
  var filterOptions: js.UndefOr[
    js.Function4[
      /* options */ Value, 
      /* filterValue */ String, 
      /* excludeOptions */ js.UndefOr[Value], 
      /* newProps */ js.UndefOr[LabelKey], 
      Value
    ]
  ] = js.native
  
  var filterOutSelected: js.UndefOr[Boolean] = js.native
  
  var getOptionLabel: js.UndefOr[js.Function1[/* args */ typings.baseui.anon.Option, ReactNode]] = js.native
  
  var getValueLabel: js.UndefOr[js.Function1[/* args */ OptionOption, ReactNode]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var isLoading: js.UndefOr[Boolean] = js.native
  
  var labelKey: js.UndefOr[String] = js.native
  
  var maxDropdownHeight: js.UndefOr[String] = js.native
  
  var mountNode: js.UndefOr[HTMLElement] = js.native
  
  var multi: js.UndefOr[Boolean] = js.native
  
  var noResultsMsg: js.UndefOr[ReactNode] = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* e */ Event, _]] = js.native
  
  var onBlurResetsInput: js.UndefOr[Boolean] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* params */ OnChangeParams, _]] = js.native
  
  var onClose: js.UndefOr[js.Function0[_]] = js.native
  
  var onCloseResetsInput: js.UndefOr[Boolean] = js.native
  
  var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.native
  
  var onInputChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  
  var onOpen: js.UndefOr[js.Function0[_]] = js.native
  
  var onSelectResetsInput: js.UndefOr[Boolean] = js.native
  
  var openOnClick: js.UndefOr[Boolean] = js.native
  
  var options: js.UndefOr[OptionsT] = js.native
  
  var overrides: js.UndefOr[SelectOverrides] = js.native
  
  var placeholder: js.UndefOr[ReactNode] = js.native
  
  var positive: js.UndefOr[Boolean] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var searchable: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[mini | default_ | compact | large_] = js.native
  
  var startOpen: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[select | search] = js.native
  
  var value: js.UndefOr[Value] = js.native
  
  var valueKey: js.UndefOr[String] = js.native
}
object SelectProps {
  
  @scala.inline
  def apply(): SelectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectProps]
  }
  
  @scala.inline
  implicit class SelectPropsMutableBuilder[Self <: SelectProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    @scala.inline
    def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
    
    @scala.inline
    def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    @scala.inline
    def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setBackspaceClearsInputValue(value: Boolean): Self = StObject.set(x, "backspaceClearsInputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackspaceClearsInputValueUndefined: Self = StObject.set(x, "backspaceClearsInputValue", js.undefined)
    
    @scala.inline
    def setBackspaceRemoves(value: Boolean): Self = StObject.set(x, "backspaceRemoves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackspaceRemovesUndefined: Self = StObject.set(x, "backspaceRemoves", js.undefined)
    
    @scala.inline
    def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
    
    @scala.inline
    def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
    
    @scala.inline
    def setControlRef(value: Ref[HTMLInputElement | HTMLDivElement]): Self = StObject.set(x, "controlRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlRefFunction1(value: /* instance */ (HTMLInputElement | HTMLDivElement) | Null => Unit): Self = StObject.set(x, "controlRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setControlRefNull: Self = StObject.set(x, "controlRef", null)
    
    @scala.inline
    def setControlRefUndefined: Self = StObject.set(x, "controlRef", js.undefined)
    
    @scala.inline
    def setCreatable(value: Boolean): Self = StObject.set(x, "creatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatableUndefined: Self = StObject.set(x, "creatable", js.undefined)
    
    @scala.inline
    def setDeleteRemoves(value: Boolean): Self = StObject.set(x, "deleteRemoves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteRemovesUndefined: Self = StObject.set(x, "deleteRemoves", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setEscapeClearsValue(value: Boolean): Self = StObject.set(x, "escapeClearsValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscapeClearsValueUndefined: Self = StObject.set(x, "escapeClearsValue", js.undefined)
    
    @scala.inline
    def setFilterOptions(
      value: (/* options */ Value, /* filterValue */ String, /* excludeOptions */ js.UndefOr[Value], /* newProps */ js.UndefOr[LabelKey]) => Value
    ): Self = StObject.set(x, "filterOptions", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFilterOptionsUndefined: Self = StObject.set(x, "filterOptions", js.undefined)
    
    @scala.inline
    def setFilterOutSelected(value: Boolean): Self = StObject.set(x, "filterOutSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterOutSelectedUndefined: Self = StObject.set(x, "filterOutSelected", js.undefined)
    
    @scala.inline
    def setGetOptionLabel(value: /* args */ typings.baseui.anon.Option => ReactNode): Self = StObject.set(x, "getOptionLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOptionLabelUndefined: Self = StObject.set(x, "getOptionLabel", js.undefined)
    
    @scala.inline
    def setGetValueLabel(value: /* args */ OptionOption => ReactNode): Self = StObject.set(x, "getValueLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValueLabelUndefined: Self = StObject.set(x, "getValueLabel", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    @scala.inline
    def setLabelKey(value: String): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelKeyUndefined: Self = StObject.set(x, "labelKey", js.undefined)
    
    @scala.inline
    def setMaxDropdownHeight(value: String): Self = StObject.set(x, "maxDropdownHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDropdownHeightUndefined: Self = StObject.set(x, "maxDropdownHeight", js.undefined)
    
    @scala.inline
    def setMountNode(value: HTMLElement): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
    
    @scala.inline
    def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    @scala.inline
    def setNoResultsMsg(value: ReactNode): Self = StObject.set(x, "noResultsMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoResultsMsgUndefined: Self = StObject.set(x, "noResultsMsg", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* e */ Event => _): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurResetsInput(value: Boolean): Self = StObject.set(x, "onBlurResetsInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlurResetsInputUndefined: Self = StObject.set(x, "onBlurResetsInput", js.undefined)
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* params */ OnChangeParams => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => _): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCloseResetsInput(value: Boolean): Self = StObject.set(x, "onCloseResetsInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCloseResetsInputUndefined: Self = StObject.set(x, "onCloseResetsInput", js.undefined)
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnFocus(value: FocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnInputChange(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInputChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInputChangeUndefined: Self = StObject.set(x, "onInputChange", js.undefined)
    
    @scala.inline
    def setOnOpen(value: () => _): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    @scala.inline
    def setOnSelectResetsInput(value: Boolean): Self = StObject.set(x, "onSelectResetsInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelectResetsInputUndefined: Self = StObject.set(x, "onSelectResetsInput", js.undefined)
    
    @scala.inline
    def setOpenOnClick(value: Boolean): Self = StObject.set(x, "openOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenOnClickUndefined: Self = StObject.set(x, "openOnClick", js.undefined)
    
    @scala.inline
    def setOptions(value: OptionsT): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setOverrides(value: SelectOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: ReactNode): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    
    @scala.inline
    def setSize(value: mini | default_ | compact | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStartOpen(value: Boolean): Self = StObject.set(x, "startOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOpenUndefined: Self = StObject.set(x, "startOpen", js.undefined)
    
    @scala.inline
    def setType(value: select | search): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: Option*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
