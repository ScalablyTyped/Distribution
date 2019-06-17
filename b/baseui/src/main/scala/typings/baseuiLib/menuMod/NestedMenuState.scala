package typings
package baseuiLib.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedMenuState extends js.Object {
  var menus: js.Array[reactLib.reactMod.Ref[stdLib.HTMLElement]]
}

object NestedMenuState {
  @scala.inline
  def apply(menus: js.Array[reactLib.reactMod.Ref[stdLib.HTMLElement]]): NestedMenuState = {
    val __obj = js.Dynamic.literal(menus = menus)
  
    __obj.asInstanceOf[NestedMenuState]
  }
}

