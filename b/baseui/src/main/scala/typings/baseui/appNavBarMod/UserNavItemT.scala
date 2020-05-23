package typings.baseui.appNavBarMod

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserNavItemT extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[ComponentType[_]] = js.undefined
  var item: ItemT
  var mapItemToNode: js.UndefOr[typings.baseui.appNavBarMod.mapItemToNode] = js.undefined
  var mapItemToString: typings.baseui.appNavBarMod.mapItemToString
}

object UserNavItemT {
  @scala.inline
  def apply(
    item: ItemT,
    mapItemToString: /* item */ ItemT => String,
    active: js.UndefOr[Boolean] = js.undefined,
    icon: ComponentType[_] = null,
    mapItemToNode: /* item */ ItemT => ReactNode = null
  ): UserNavItemT = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], mapItemToString = js.Any.fromFunction1(mapItemToString))
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (mapItemToNode != null) __obj.updateDynamic("mapItemToNode")(js.Any.fromFunction1(mapItemToNode))
    __obj.asInstanceOf[UserNavItemT]
  }
}

