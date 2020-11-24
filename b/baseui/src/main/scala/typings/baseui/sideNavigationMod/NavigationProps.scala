package typings.baseui.sideNavigationMod

import typings.baseui.anon.EventItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationProps extends js.Object {
  
  var activeItemId: String = js.native
  
  var activePredicate: js.UndefOr[js.Function2[/* item */ js.Any, /* activeItemId */ String, Boolean]] = js.native
  
  var items: js.UndefOr[js.Array[Item]] = js.native
  
  var mapItem: js.UndefOr[js.Function1[/* item */ Item, Item]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* args */ EventItem, _]] = js.native
  
  var overrides: js.UndefOr[NavigationOverrides] = js.native
}
object NavigationProps {
  
  @scala.inline
  def apply(activeItemId: String): NavigationProps = {
    val __obj = js.Dynamic.literal(activeItemId = activeItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationProps]
  }
  
  @scala.inline
  implicit class NavigationPropsOps[Self <: NavigationProps] (val x: Self) extends AnyVal {
    
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
    def setActiveItemId(value: String): Self = this.set("activeItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivePredicate(value: (/* item */ js.Any, /* activeItemId */ String) => Boolean): Self = this.set("activePredicate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteActivePredicate: Self = this.set("activePredicate", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Item*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Item]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setMapItem(value: /* item */ Item => Item): Self = this.set("mapItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMapItem: Self = this.set("mapItem", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* args */ EventItem => _): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOverrides(value: NavigationOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
}
