package typings.baseui.menuMod

import typings.react.mod.Ref
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedMenuState extends js.Object {
  var menus: js.Array[Ref[HTMLElement]]
}

object NestedMenuState {
  @scala.inline
  def apply(menus: js.Array[Ref[HTMLElement]]): NestedMenuState = {
    val __obj = js.Dynamic.literal(menus = menus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NestedMenuState]
  }
}

