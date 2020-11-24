package typings.baseui.appNavBarMod

import typings.baseui.anon.Desktop
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavItemT extends js.Object {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[js.Array[NavItemT]] = js.native
  
  var icon: js.UndefOr[ComponentType[_]] = js.native
  
  var info: js.UndefOr[js.Any] = js.native
  
  var label: String = js.native
  
  var navExitIcon: js.UndefOr[ComponentType[_]] = js.native
  
  var navPosition: js.UndefOr[Desktop] = js.native
}
object NavItemT {
  
  @scala.inline
  def apply(label: String): NavItemT = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavItemT]
  }
  
  @scala.inline
  implicit class NavItemTOps[Self <: NavItemT] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: NavItemT*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[NavItemT]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setIcon(value: ComponentType[_]): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setInfo(value: js.Any): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    
    @scala.inline
    def setNavExitIcon(value: ComponentType[_]): Self = this.set("navExitIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavExitIcon: Self = this.set("navExitIcon", js.undefined)
    
    @scala.inline
    def setNavPosition(value: Desktop): Self = this.set("navPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavPosition: Self = this.set("navPosition", js.undefined)
  }
}
