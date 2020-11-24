package typings.baseui.sideNavigationMod

import typings.baseui.anon.ItemAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavItemProps extends js.Object {
  
  @JSName("$active")
  var $active: js.UndefOr[Boolean] = js.native
  
  @JSName("$level")
  var $level: js.UndefOr[Double] = js.native
  
  @JSName("$selectable")
  var $selectable: js.UndefOr[Boolean] = js.native
  
  var item: Item = js.native
  
  var onSelect: js.UndefOr[js.Function1[/* args */ ItemAny, _]] = js.native
  
  var overrides: js.UndefOr[NavItemOverrides] = js.native
}
object NavItemProps {
  
  @scala.inline
  def apply(item: Item): NavItemProps = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavItemProps]
  }
  
  @scala.inline
  implicit class NavItemPropsOps[Self <: NavItemProps] (val x: Self) extends AnyVal {
    
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
    def setItem(value: Item): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$active(value: Boolean): Self = this.set("$active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$active: Self = this.set("$active", js.undefined)
    
    @scala.inline
    def set$level(value: Double): Self = this.set("$level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$level: Self = this.set("$level", js.undefined)
    
    @scala.inline
    def set$selectable(value: Boolean): Self = this.set("$selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$selectable: Self = this.set("$selectable", js.undefined)
    
    @scala.inline
    def setOnSelect(value: /* args */ ItemAny => _): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOverrides(value: NavItemOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
}
