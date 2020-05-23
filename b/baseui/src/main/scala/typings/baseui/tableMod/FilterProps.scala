package typings.baseui.tableMod

import typings.baseui.anon.Content
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var children: ReactNode
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onReset: js.UndefOr[js.Function0[_]] = js.undefined
  var onSelectAll: js.UndefOr[js.Function0[_]] = js.undefined
  var overrides: js.UndefOr[Content] = js.undefined
}

object FilterProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onReset: () => _ = null,
    onSelectAll: () => _ = null,
    overrides: Content = null
  ): FilterProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction0(onReset))
    if (onSelectAll != null) __obj.updateDynamic("onSelectAll")(js.Any.fromFunction0(onSelectAll))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterProps]
  }
}

