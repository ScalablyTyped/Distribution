package typings.baseui.selectMod

import typings.baseui.AnonEventItem
import typings.baseui.AnonOptionState
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.baseui.baseuiStrings.search
import typings.baseui.baseuiStrings.select
import typings.baseui.menuMod.OnItemSelect
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownProps extends js.Object {
  var error: js.UndefOr[Boolean] = js.undefined
  var getOptionLabel: js.UndefOr[js.Function1[/* args */ AnonOptionState, ReactNode]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var innerRef: js.UndefOr[Ref[_]] = js.undefined
  var isLoading: js.UndefOr[Boolean] = js.undefined
  var labelKey: js.UndefOr[String] = js.undefined
  var maxDropdownHeight: js.UndefOr[String] = js.undefined
  var multi: js.UndefOr[Boolean] = js.undefined
  var noResultsMsg: js.UndefOr[ReactNode] = js.undefined
  var onActiveDescendantChange: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.undefined
  var onItemSelect: js.UndefOr[OnItemSelect] = js.undefined
  var options: js.UndefOr[Value] = js.undefined
  var overrides: js.UndefOr[DropdownOverrides] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var searchable: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[mini | default_ | compact | large_] = js.undefined
  var `type`: js.UndefOr[select | search] = js.undefined
  var value: js.UndefOr[Value] = js.undefined
  var valueKey: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object DropdownProps {
  @scala.inline
  def apply(
    error: js.UndefOr[Boolean] = js.undefined,
    getOptionLabel: /* args */ AnonOptionState => ReactNode = null,
    id: String = null,
    innerRef: Ref[_] = null,
    isLoading: js.UndefOr[Boolean] = js.undefined,
    labelKey: String = null,
    maxDropdownHeight: String = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    noResultsMsg: ReactNode = null,
    onActiveDescendantChange: /* id */ js.UndefOr[String] => Unit = null,
    onItemSelect: /* args */ AnonEventItem => js.Any = null,
    options: Value = null,
    overrides: DropdownOverrides = null,
    required: js.UndefOr[Boolean] = js.undefined,
    searchable: js.UndefOr[Boolean] = js.undefined,
    size: mini | default_ | compact | large_ = null,
    `type`: select | search = null,
    value: Value = null,
    valueKey: String = null,
    width: Int | Double = null
  ): DropdownProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (getOptionLabel != null) __obj.updateDynamic("getOptionLabel")(js.Any.fromFunction1(getOptionLabel))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading.asInstanceOf[js.Any])
    if (labelKey != null) __obj.updateDynamic("labelKey")(labelKey.asInstanceOf[js.Any])
    if (maxDropdownHeight != null) __obj.updateDynamic("maxDropdownHeight")(maxDropdownHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    if (noResultsMsg != null) __obj.updateDynamic("noResultsMsg")(noResultsMsg.asInstanceOf[js.Any])
    if (onActiveDescendantChange != null) __obj.updateDynamic("onActiveDescendantChange")(js.Any.fromFunction1(onActiveDescendantChange))
    if (onItemSelect != null) __obj.updateDynamic("onItemSelect")(js.Any.fromFunction1(onItemSelect))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownProps]
  }
}

