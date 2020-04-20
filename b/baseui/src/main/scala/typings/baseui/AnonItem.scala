package typings.baseui

import typings.baseui.appNavBarMod.MainNavItemT
import typings.baseui.appNavBarMod.UserNavItemT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem extends js.Object {
  var item: MainNavItemT | UserNavItemT
}

object AnonItem {
  @scala.inline
  def apply(item: MainNavItemT | UserNavItemT): AnonItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItem]
  }
}

