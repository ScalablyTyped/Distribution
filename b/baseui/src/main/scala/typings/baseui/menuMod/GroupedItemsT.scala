package typings.baseui.menuMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupedItemsT extends /* key */ StringDictionary[ArrayItemsT] {
  
  var __ungrouped: ArrayItemsT = js.native
}
object GroupedItemsT {
  
  @scala.inline
  def apply(__ungrouped: ArrayItemsT): GroupedItemsT = {
    val __obj = js.Dynamic.literal(__ungrouped = __ungrouped.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupedItemsT]
  }
  
  @scala.inline
  implicit class GroupedItemsTOps[Self <: GroupedItemsT] (val x: Self) extends AnyVal {
    
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
    def set__ungroupedVarargs(value: ItemT*): Self = this.set("__ungrouped", js.Array(value :_*))
    
    @scala.inline
    def set__ungrouped(value: ArrayItemsT): Self = this.set("__ungrouped", value.asInstanceOf[js.Any])
  }
}
