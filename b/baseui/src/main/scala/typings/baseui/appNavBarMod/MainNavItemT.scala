package typings.baseui.appNavBarMod

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MainNavItemT extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[ComponentType[_]] = js.undefined
  var item: ItemT
  var mapItemToNode: js.UndefOr[typings.baseui.appNavBarMod.mapItemToNode] = js.undefined
  var mapItemToString: typings.baseui.appNavBarMod.mapItemToString
  var nav: js.UndefOr[js.Array[MainNavItemT]] = js.undefined
  var navExitIcon: js.UndefOr[ComponentType[_]] = js.undefined
}

object MainNavItemT {
  @scala.inline
  def apply(
    item: ItemT,
    mapItemToString: /* item */ ItemT => String,
    active: js.UndefOr[Boolean] = js.undefined,
    icon: ComponentType[_] = null,
    mapItemToNode: /* item */ ItemT => ReactNode = null,
    nav: js.Array[MainNavItemT] = null,
    navExitIcon: ComponentType[_] = null
  ): MainNavItemT = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], mapItemToString = js.Any.fromFunction1(mapItemToString))
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (mapItemToNode != null) __obj.updateDynamic("mapItemToNode")(js.Any.fromFunction1(mapItemToNode))
    if (nav != null) __obj.updateDynamic("nav")(nav.asInstanceOf[js.Any])
    if (navExitIcon != null) __obj.updateDynamic("navExitIcon")(navExitIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[MainNavItemT]
  }
}

