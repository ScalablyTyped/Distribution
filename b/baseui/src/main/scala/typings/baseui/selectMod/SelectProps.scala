package typings.baseui.selectMod

import typings.baseui.Anon_LabelKey
import typings.baseui.Anon_Option
import typings.baseui.Anon_Option_666053661
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.search
import typings.baseui.baseuiStrings.select
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.FormEvent
import typings.react.reactMod.FormEventHandler
import typings.react.reactMod.ReactNode
import typings.std.Event
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectProps extends js.Object {
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  var `aria-label`: js.UndefOr[String] = js.undefined
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var backspaceRemoves: js.UndefOr[Boolean] = js.undefined
  var clearable: js.UndefOr[Boolean] = js.undefined
  var closeOnSelect: js.UndefOr[Boolean] = js.undefined
  var creatable: js.UndefOr[Boolean] = js.undefined
  var deleteRemoves: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var escapeClearsValue: js.UndefOr[Boolean] = js.undefined
  var filterOptions: js.UndefOr[
    js.Function4[
      /* options */ Value, 
      /* filterValue */ String, 
      /* excludeOptions */ js.UndefOr[Value], 
      /* newProps */ js.UndefOr[Anon_LabelKey], 
      Value
    ]
  ] = js.undefined
  var filterOutSelected: js.UndefOr[Boolean] = js.undefined
  var getOptionLabel: js.UndefOr[js.Function1[/* args */ Anon_Option, ReactNode]] = js.undefined
  var getValueLabel: js.UndefOr[js.Function1[/* args */ Anon_Option_666053661, ReactNode]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isLoading: js.UndefOr[Boolean] = js.undefined
  var labelKey: js.UndefOr[String] = js.undefined
  var maxDropdownHeight: js.UndefOr[String] = js.undefined
  var mountNode: js.UndefOr[HTMLElement] = js.undefined
  var multi: js.UndefOr[Boolean] = js.undefined
  var noResultsMsg: js.UndefOr[ReactNode] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* e */ Event, _]] = js.undefined
  var onBlurResetsInput: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* params */ OnChangeParams, _]] = js.undefined
  var onClose: js.UndefOr[js.Function0[_]] = js.undefined
  var onCloseResetsInput: js.UndefOr[Boolean] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
  var onInputChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[_]] = js.undefined
  var onSelectResetsInput: js.UndefOr[Boolean] = js.undefined
  var openOnClick: js.UndefOr[Boolean] = js.undefined
  var options: js.UndefOr[OptionsT] = js.undefined
  var overrides: js.UndefOr[SelectOverrides] = js.undefined
  var placeholder: js.UndefOr[ReactNode] = js.undefined
  var positive: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var searchable: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[default_ | compact | large_] = js.undefined
  var startOpen: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[select | search] = js.undefined
  var value: js.UndefOr[Value] = js.undefined
  var valueKey: js.UndefOr[String] = js.undefined
}

object SelectProps {
  @scala.inline
  def apply(
    `aria-describedby`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    backspaceRemoves: js.UndefOr[Boolean] = js.undefined,
    clearable: js.UndefOr[Boolean] = js.undefined,
    closeOnSelect: js.UndefOr[Boolean] = js.undefined,
    creatable: js.UndefOr[Boolean] = js.undefined,
    deleteRemoves: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    escapeClearsValue: js.UndefOr[Boolean] = js.undefined,
    filterOptions: (/* options */ Value, /* filterValue */ String, /* excludeOptions */ js.UndefOr[Value], /* newProps */ js.UndefOr[Anon_LabelKey]) => Value = null,
    filterOutSelected: js.UndefOr[Boolean] = js.undefined,
    getOptionLabel: /* args */ Anon_Option => ReactNode = null,
    getValueLabel: /* args */ Anon_Option_666053661 => ReactNode = null,
    id: String = null,
    isLoading: js.UndefOr[Boolean] = js.undefined,
    labelKey: String = null,
    maxDropdownHeight: String = null,
    mountNode: HTMLElement = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    noResultsMsg: ReactNode = null,
    onBlur: /* e */ Event => _ = null,
    onBlurResetsInput: js.UndefOr[Boolean] = js.undefined,
    onChange: /* params */ OnChangeParams => _ = null,
    onClose: () => _ = null,
    onCloseResetsInput: js.UndefOr[Boolean] = js.undefined,
    onFocus: FocusEvent[HTMLElement] => Unit = null,
    onInputChange: FormEvent[HTMLInputElement] => Unit = null,
    onOpen: () => _ = null,
    onSelectResetsInput: js.UndefOr[Boolean] = js.undefined,
    openOnClick: js.UndefOr[Boolean] = js.undefined,
    options: OptionsT = null,
    overrides: SelectOverrides = null,
    placeholder: ReactNode = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    searchable: js.UndefOr[Boolean] = js.undefined,
    size: default_ | compact | large_ = null,
    startOpen: js.UndefOr[Boolean] = js.undefined,
    `type`: select | search = null,
    value: Value = null,
    valueKey: String = null
  ): SelectProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(backspaceRemoves)) __obj.updateDynamic("backspaceRemoves")(backspaceRemoves.asInstanceOf[js.Any])
    if (!js.isUndefined(clearable)) __obj.updateDynamic("clearable")(clearable.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSelect)) __obj.updateDynamic("closeOnSelect")(closeOnSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(creatable)) __obj.updateDynamic("creatable")(creatable.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteRemoves)) __obj.updateDynamic("deleteRemoves")(deleteRemoves.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeClearsValue)) __obj.updateDynamic("escapeClearsValue")(escapeClearsValue.asInstanceOf[js.Any])
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(js.Any.fromFunction4(filterOptions))
    if (!js.isUndefined(filterOutSelected)) __obj.updateDynamic("filterOutSelected")(filterOutSelected.asInstanceOf[js.Any])
    if (getOptionLabel != null) __obj.updateDynamic("getOptionLabel")(js.Any.fromFunction1(getOptionLabel))
    if (getValueLabel != null) __obj.updateDynamic("getValueLabel")(js.Any.fromFunction1(getValueLabel))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading.asInstanceOf[js.Any])
    if (labelKey != null) __obj.updateDynamic("labelKey")(labelKey.asInstanceOf[js.Any])
    if (maxDropdownHeight != null) __obj.updateDynamic("maxDropdownHeight")(maxDropdownHeight.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    if (noResultsMsg != null) __obj.updateDynamic("noResultsMsg")(noResultsMsg.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (!js.isUndefined(onBlurResetsInput)) __obj.updateDynamic("onBlurResetsInput")(onBlurResetsInput.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (!js.isUndefined(onCloseResetsInput)) __obj.updateDynamic("onCloseResetsInput")(onCloseResetsInput.asInstanceOf[js.Any])
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(js.Any.fromFunction1(onInputChange))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (!js.isUndefined(onSelectResetsInput)) __obj.updateDynamic("onSelectResetsInput")(onSelectResetsInput.asInstanceOf[js.Any])
    if (!js.isUndefined(openOnClick)) __obj.updateDynamic("openOnClick")(openOnClick.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(startOpen)) __obj.updateDynamic("startOpen")(startOpen.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectProps]
  }
}

