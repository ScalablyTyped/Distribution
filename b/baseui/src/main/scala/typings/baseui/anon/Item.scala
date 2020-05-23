package typings.baseui.anon

import typings.baseui.appNavBarMod.MainNavItemT
import typings.baseui.appNavBarMod.UserNavItemT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var item: MainNavItemT | UserNavItemT
}

object Item {
  @scala.inline
  def apply(item: MainNavItemT | UserNavItemT): Item = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

