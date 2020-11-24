package typings.baseui.menuMod

import typings.react.mod.Ref
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NestedMenuState extends js.Object {
  
  var menus: js.Array[Ref[HTMLElement]] = js.native
}
object NestedMenuState {
  
  @scala.inline
  def apply(menus: js.Array[Ref[HTMLElement]]): NestedMenuState = {
    val __obj = js.Dynamic.literal(menus = menus.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedMenuState]
  }
  
  @scala.inline
  implicit class NestedMenuStateOps[Self <: NestedMenuState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMenusVarargs(value: Ref[HTMLElement]*): Self = this.set("menus", js.Array(value :_*))
    
    @scala.inline
    def setMenus(value: js.Array[Ref[HTMLElement]]): Self = this.set("menus", value.asInstanceOf[js.Any])
  }
}
