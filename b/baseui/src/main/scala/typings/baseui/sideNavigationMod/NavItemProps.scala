package typings.baseui.sideNavigationMod

import typings.baseui.anon.ItemAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavItemProps extends js.Object {
  @JSName("$active")
  var $active: js.UndefOr[Boolean] = js.undefined
  @JSName("$level")
  var $level: js.UndefOr[Double] = js.undefined
  @JSName("$selectable")
  var $selectable: js.UndefOr[Boolean] = js.undefined
  var item: Item
  var onSelect: js.UndefOr[js.Function1[/* args */ ItemAny, _]] = js.undefined
  var overrides: js.UndefOr[NavItemOverrides] = js.undefined
}

object NavItemProps {
  @scala.inline
  def apply(
    item: Item,
    $active: js.UndefOr[Boolean] = js.undefined,
    $level: js.UndefOr[Double] = js.undefined,
    $selectable: js.UndefOr[Boolean] = js.undefined,
    onSelect: /* args */ ItemAny => _ = null,
    overrides: NavItemOverrides = null
  ): NavItemProps = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (!js.isUndefined($active)) __obj.updateDynamic("$active")($active.get.asInstanceOf[js.Any])
    if (!js.isUndefined($level)) __obj.updateDynamic("$level")($level.get.asInstanceOf[js.Any])
    if (!js.isUndefined($selectable)) __obj.updateDynamic("$selectable")($selectable.get.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavItemProps]
  }
}

