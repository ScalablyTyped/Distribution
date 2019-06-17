package typings
package baseuiLib.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownProps extends js.Object {
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var getOptionLabel: js.UndefOr[
    js.Function1[/* args */ baseuiLib.Anon_OptionOptionState, reactLib.reactMod.ReactNode]
  ] = js.undefined
  var innerRef: js.UndefOr[reactLib.reactMod.Ref[_]] = js.undefined
  var isLoading: js.UndefOr[scala.Boolean] = js.undefined
  var labelKey: js.UndefOr[java.lang.String] = js.undefined
  var maxDropdownHeight: js.UndefOr[java.lang.String] = js.undefined
  var multi: js.UndefOr[scala.Boolean] = js.undefined
  var noResultsMsg: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var onItemSelect: js.UndefOr[baseuiLib.menuMod.OnItemSelect] = js.undefined
  var options: js.UndefOr[Value] = js.undefined
  var overrides: js.UndefOr[DropdownOverrides] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var searchable: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[
    baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.compact | baseuiLib.baseuiLibStrings.large
  ] = js.undefined
  var `type`: js.UndefOr[baseuiLib.baseuiLibStrings.select | baseuiLib.baseuiLibStrings.search] = js.undefined
  var value: js.UndefOr[Value] = js.undefined
  var valueKey: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object DropdownProps {
  @scala.inline
  def apply(
    error: js.UndefOr[scala.Boolean] = js.undefined,
    getOptionLabel: /* args */ baseuiLib.Anon_OptionOptionState => reactLib.reactMod.ReactNode = null,
    innerRef: reactLib.reactMod.Ref[_] = null,
    isLoading: js.UndefOr[scala.Boolean] = js.undefined,
    labelKey: java.lang.String = null,
    maxDropdownHeight: java.lang.String = null,
    multi: js.UndefOr[scala.Boolean] = js.undefined,
    noResultsMsg: reactLib.reactMod.ReactNode = null,
    onItemSelect: baseuiLib.menuMod.OnItemSelect = null,
    options: Value = null,
    overrides: DropdownOverrides = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    searchable: js.UndefOr[scala.Boolean] = js.undefined,
    size: baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.compact | baseuiLib.baseuiLibStrings.large = null,
    `type`: baseuiLib.baseuiLibStrings.select | baseuiLib.baseuiLibStrings.search = null,
    value: Value = null,
    valueKey: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): DropdownProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (getOptionLabel != null) __obj.updateDynamic("getOptionLabel")(js.Any.fromFunction1(getOptionLabel))
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading)
    if (labelKey != null) __obj.updateDynamic("labelKey")(labelKey)
    if (maxDropdownHeight != null) __obj.updateDynamic("maxDropdownHeight")(maxDropdownHeight)
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    if (noResultsMsg != null) __obj.updateDynamic("noResultsMsg")(noResultsMsg.asInstanceOf[js.Any])
    if (onItemSelect != null) __obj.updateDynamic("onItemSelect")(onItemSelect)
    if (options != null) __obj.updateDynamic("options")(options)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownProps]
  }
}

