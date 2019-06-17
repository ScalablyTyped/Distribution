package typings
package baseuiLib.sideDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavItemProps extends js.Object {
  @JSName("$active")
  var $active: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$level")
  var $level: js.UndefOr[scala.Double] = js.undefined
  @JSName("$selectable")
  var $selectable: js.UndefOr[scala.Boolean] = js.undefined
  var item: Item
  var onSelect: js.UndefOr[js.Function1[/* args */ baseuiLib.Anon_EventItemAny, _]] = js.undefined
  var overrides: js.UndefOr[NavItemOverrides] = js.undefined
}

object NavItemProps {
  @scala.inline
  def apply(
    item: Item,
    $active: js.UndefOr[scala.Boolean] = js.undefined,
    $level: scala.Int | scala.Double = null,
    $selectable: js.UndefOr[scala.Boolean] = js.undefined,
    onSelect: /* args */ baseuiLib.Anon_EventItemAny => _ = null,
    overrides: NavItemOverrides = null
  ): NavItemProps = {
    val __obj = js.Dynamic.literal(item = item)
    if (!js.isUndefined($active)) __obj.updateDynamic("$active")($active)
    if ($level != null) __obj.updateDynamic("$level")($level.asInstanceOf[js.Any])
    if (!js.isUndefined($selectable)) __obj.updateDynamic("$selectable")($selectable)
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[NavItemProps]
  }
}

