package typings.baseui.dndListMod

import typings.baseui.anon.OldIndex
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProps extends js.Object {
  
  var items: js.UndefOr[js.Array[ReactNode]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* args */ OldIndex, _]] = js.native
  
  var overrides: js.UndefOr[ListOverrides] = js.native
  
  var removable: js.UndefOr[Boolean] = js.native
  
  var removableByMove: js.UndefOr[Boolean] = js.native
}
object ListProps {
  
  @scala.inline
  def apply(): ListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProps]
  }
  
  @scala.inline
  implicit class ListPropsOps[Self <: ListProps] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: ReactNode*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[ReactNode]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* args */ OldIndex => _): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOverrides(value: ListOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setRemovable(value: Boolean): Self = this.set("removable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemovable: Self = this.set("removable", js.undefined)
    
    @scala.inline
    def setRemovableByMove(value: Boolean): Self = this.set("removableByMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemovableByMove: Self = this.set("removableByMove", js.undefined)
  }
}
