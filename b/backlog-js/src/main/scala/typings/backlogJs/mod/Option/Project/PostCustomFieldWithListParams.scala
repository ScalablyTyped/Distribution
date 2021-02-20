package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostCustomFieldWithListParams extends PostCustomFieldParams {
  
  var allowAddItem: js.UndefOr[Boolean] = js.native
  
  var allowInput: js.UndefOr[Boolean] = js.native
  
  var items: js.UndefOr[js.Array[String]] = js.native
}
object PostCustomFieldWithListParams {
  
  @scala.inline
  def apply(name: String, typeId: FieldType): PostCustomFieldWithListParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], typeId = typeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCustomFieldWithListParams]
  }
  
  @scala.inline
  implicit class PostCustomFieldWithListParamsMutableBuilder[Self <: PostCustomFieldWithListParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowAddItem(value: Boolean): Self = StObject.set(x, "allowAddItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAddItemUndefined: Self = StObject.set(x, "allowAddItem", js.undefined)
    
    @scala.inline
    def setAllowInput(value: Boolean): Self = StObject.set(x, "allowInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowInputUndefined: Self = StObject.set(x, "allowInput", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
