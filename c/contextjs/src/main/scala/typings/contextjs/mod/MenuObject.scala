package typings.contextjs.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuObject extends js.Object {
  
  var action: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  
  var divider: js.UndefOr[Boolean] = js.native
  
  var header: js.UndefOr[String] = js.native
  
  var href: js.UndefOr[String] = js.native
  
  var subMenu: js.UndefOr[js.Array[MenuObject]] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object MenuObject {
  
  @scala.inline
  def apply(): MenuObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuObject]
  }
  
  @scala.inline
  implicit class MenuObjectOps[Self <: MenuObject] (val x: Self) extends AnyVal {
    
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
    def setAction(value: /* e */ Event => Unit): Self = this.set("action", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setDivider(value: Boolean): Self = this.set("divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDivider: Self = this.set("divider", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    
    @scala.inline
    def setSubMenuVarargs(value: MenuObject*): Self = this.set("subMenu", js.Array(value :_*))
    
    @scala.inline
    def setSubMenu(value: js.Array[MenuObject]): Self = this.set("subMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubMenu: Self = this.set("subMenu", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
