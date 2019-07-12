package typings
package baseuiLib.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectProps extends js.Object {
  var `aria-describedby`: js.UndefOr[java.lang.String] = js.undefined
  var `aria-label`: js.UndefOr[java.lang.String] = js.undefined
  var `aria-labelledby`: js.UndefOr[java.lang.String] = js.undefined
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var backspaceRemoves: js.UndefOr[scala.Boolean] = js.undefined
  var clearable: js.UndefOr[scala.Boolean] = js.undefined
  var closeOnSelect: js.UndefOr[scala.Boolean] = js.undefined
  var creatable: js.UndefOr[scala.Boolean] = js.undefined
  var deleteRemoves: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var escapeClearsValue: js.UndefOr[scala.Boolean] = js.undefined
  var filterOptions: js.UndefOr[
    js.Function4[
      /* options */ Value, 
      /* filterValue */ java.lang.String, 
      /* excludeOptions */ js.UndefOr[Value], 
      /* newProps */ js.UndefOr[baseuiLib.Anon_LabelKey], 
      Value
    ]
  ] = js.undefined
  var filterOutSelected: js.UndefOr[scala.Boolean] = js.undefined
  var getOptionLabel: js.UndefOr[js.Function1[/* args */ baseuiLib.Anon_Option, reactLib.reactMod.ReactNode]] = js.undefined
  var getValueLabel: js.UndefOr[
    js.Function1[/* args */ baseuiLib.Anon_Option_7372621, reactLib.reactMod.ReactNode]
  ] = js.undefined
  var isLoading: js.UndefOr[scala.Boolean] = js.undefined
  var labelKey: js.UndefOr[java.lang.String] = js.undefined
  var maxDropdownHeight: js.UndefOr[java.lang.String] = js.undefined
  var mountNode: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var multi: js.UndefOr[scala.Boolean] = js.undefined
  var noResultsMsg: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* e */ stdLib.Event, _]] = js.undefined
  var onBlurResetsInput: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* params */ OnChangeParams, _]] = js.undefined
  var onClose: js.UndefOr[js.Function0[_]] = js.undefined
  var onCloseResetsInput: js.UndefOr[scala.Boolean] = js.undefined
  var onFocus: js.UndefOr[reactLib.reactMod.FocusEventHandler[stdLib.HTMLElement]] = js.undefined
  var onInputChange: js.UndefOr[reactLib.reactMod.FormEventHandler[stdLib.HTMLInputElement]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[_]] = js.undefined
  var onSelectResetsInput: js.UndefOr[scala.Boolean] = js.undefined
  var openOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var options: js.UndefOr[Value] = js.undefined
  var overrides: js.UndefOr[SelectOverrides] = js.undefined
  var placeholder: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var positive: js.UndefOr[scala.Boolean] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var searchable: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[
    baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.compact | baseuiLib.baseuiLibStrings.large
  ] = js.undefined
  var `type`: js.UndefOr[baseuiLib.baseuiLibStrings.select | baseuiLib.baseuiLibStrings.search] = js.undefined
  var value: js.UndefOr[Value] = js.undefined
  var valueKey: js.UndefOr[java.lang.String] = js.undefined
}

object SelectProps {
  @scala.inline
  def apply(
    `aria-describedby`: java.lang.String = null,
    `aria-label`: java.lang.String = null,
    `aria-labelledby`: java.lang.String = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    backspaceRemoves: js.UndefOr[scala.Boolean] = js.undefined,
    clearable: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnSelect: js.UndefOr[scala.Boolean] = js.undefined,
    creatable: js.UndefOr[scala.Boolean] = js.undefined,
    deleteRemoves: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    escapeClearsValue: js.UndefOr[scala.Boolean] = js.undefined,
    filterOptions: (/* options */ Value, /* filterValue */ java.lang.String, /* excludeOptions */ js.UndefOr[Value], /* newProps */ js.UndefOr[baseuiLib.Anon_LabelKey]) => Value = null,
    filterOutSelected: js.UndefOr[scala.Boolean] = js.undefined,
    getOptionLabel: /* args */ baseuiLib.Anon_Option => reactLib.reactMod.ReactNode = null,
    getValueLabel: /* args */ baseuiLib.Anon_Option_7372621 => reactLib.reactMod.ReactNode = null,
    isLoading: js.UndefOr[scala.Boolean] = js.undefined,
    labelKey: java.lang.String = null,
    maxDropdownHeight: java.lang.String = null,
    mountNode: stdLib.HTMLElement = null,
    multi: js.UndefOr[scala.Boolean] = js.undefined,
    noResultsMsg: reactLib.reactMod.ReactNode = null,
    onBlur: /* e */ stdLib.Event => _ = null,
    onBlurResetsInput: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* params */ OnChangeParams => _ = null,
    onClose: () => _ = null,
    onCloseResetsInput: js.UndefOr[scala.Boolean] = js.undefined,
    onFocus: reactLib.reactMod.FocusEventHandler[stdLib.HTMLElement] = null,
    onInputChange: reactLib.reactMod.FormEventHandler[stdLib.HTMLInputElement] = null,
    onOpen: () => _ = null,
    onSelectResetsInput: js.UndefOr[scala.Boolean] = js.undefined,
    openOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    options: Value = null,
    overrides: SelectOverrides = null,
    placeholder: reactLib.reactMod.ReactNode = null,
    positive: js.UndefOr[scala.Boolean] = js.undefined,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    searchable: js.UndefOr[scala.Boolean] = js.undefined,
    size: baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.compact | baseuiLib.baseuiLibStrings.large = null,
    `type`: baseuiLib.baseuiLibStrings.select | baseuiLib.baseuiLibStrings.search = null,
    value: Value = null,
    valueKey: java.lang.String = null
  ): SelectProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(backspaceRemoves)) __obj.updateDynamic("backspaceRemoves")(backspaceRemoves)
    if (!js.isUndefined(clearable)) __obj.updateDynamic("clearable")(clearable)
    if (!js.isUndefined(closeOnSelect)) __obj.updateDynamic("closeOnSelect")(closeOnSelect)
    if (!js.isUndefined(creatable)) __obj.updateDynamic("creatable")(creatable)
    if (!js.isUndefined(deleteRemoves)) __obj.updateDynamic("deleteRemoves")(deleteRemoves)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(escapeClearsValue)) __obj.updateDynamic("escapeClearsValue")(escapeClearsValue)
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(js.Any.fromFunction4(filterOptions))
    if (!js.isUndefined(filterOutSelected)) __obj.updateDynamic("filterOutSelected")(filterOutSelected)
    if (getOptionLabel != null) __obj.updateDynamic("getOptionLabel")(js.Any.fromFunction1(getOptionLabel))
    if (getValueLabel != null) __obj.updateDynamic("getValueLabel")(js.Any.fromFunction1(getValueLabel))
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading)
    if (labelKey != null) __obj.updateDynamic("labelKey")(labelKey)
    if (maxDropdownHeight != null) __obj.updateDynamic("maxDropdownHeight")(maxDropdownHeight)
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode)
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    if (noResultsMsg != null) __obj.updateDynamic("noResultsMsg")(noResultsMsg.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (!js.isUndefined(onBlurResetsInput)) __obj.updateDynamic("onBlurResetsInput")(onBlurResetsInput)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (!js.isUndefined(onCloseResetsInput)) __obj.updateDynamic("onCloseResetsInput")(onCloseResetsInput)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(onInputChange)
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (!js.isUndefined(onSelectResetsInput)) __obj.updateDynamic("onSelectResetsInput")(onSelectResetsInput)
    if (!js.isUndefined(openOnClick)) __obj.updateDynamic("openOnClick")(openOnClick)
    if (options != null) __obj.updateDynamic("options")(options)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey)
    __obj.asInstanceOf[SelectProps]
  }
}

