package typings
package baseuiLib.tableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterProps extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var children: reactLib.reactMod.ReactNode
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var onReset: js.UndefOr[js.Function0[_]] = js.undefined
  var onSelectAll: js.UndefOr[js.Function0[_]] = js.undefined
  var overrides: js.UndefOr[baseuiLib.Anon_Content] = js.undefined
}

object FilterProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onReset: () => _ = null,
    onSelectAll: () => _ = null,
    overrides: baseuiLib.Anon_Content = null
  ): FilterProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction0(onReset))
    if (onSelectAll != null) __obj.updateDynamic("onSelectAll")(js.Any.fromFunction0(onSelectAll))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[FilterProps]
  }
}

