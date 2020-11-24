package typings.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchCustomFieldWithListParams extends PatchCustomFieldParams {
  
  var allowAddItem: js.UndefOr[Boolean] = js.native
  
  var allowInput: js.UndefOr[Boolean] = js.native
  
  var items: js.UndefOr[js.Array[String]] = js.native
}
object PatchCustomFieldWithListParams {
  
  @scala.inline
  def apply(): PatchCustomFieldWithListParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchCustomFieldWithListParams]
  }
  
  @scala.inline
  implicit class PatchCustomFieldWithListParamsOps[Self <: PatchCustomFieldWithListParams] (val x: Self) extends AnyVal {
    
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
    def setAllowAddItem(value: Boolean): Self = this.set("allowAddItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAddItem: Self = this.set("allowAddItem", js.undefined)
    
    @scala.inline
    def setAllowInput(value: Boolean): Self = this.set("allowInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowInput: Self = this.set("allowInput", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: String*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[String]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
