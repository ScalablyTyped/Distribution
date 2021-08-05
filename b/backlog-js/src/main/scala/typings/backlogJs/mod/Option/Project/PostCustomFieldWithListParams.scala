package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostCustomFieldWithListParams
  extends StObject
     with PostCustomFieldParams {
  
  var allowAddItem: js.UndefOr[Boolean] = js.undefined
  
  var allowInput: js.UndefOr[Boolean] = js.undefined
  
  var items: js.UndefOr[js.Array[String]] = js.undefined
}
object PostCustomFieldWithListParams {
  
  inline def apply(name: String, typeId: FieldType): PostCustomFieldWithListParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], typeId = typeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCustomFieldWithListParams]
  }
  
  extension [Self <: PostCustomFieldWithListParams](x: Self) {
    
    inline def setAllowAddItem(value: Boolean): Self = StObject.set(x, "allowAddItem", value.asInstanceOf[js.Any])
    
    inline def setAllowAddItemUndefined: Self = StObject.set(x, "allowAddItem", js.undefined)
    
    inline def setAllowInput(value: Boolean): Self = StObject.set(x, "allowInput", value.asInstanceOf[js.Any])
    
    inline def setAllowInputUndefined: Self = StObject.set(x, "allowInput", js.undefined)
    
    inline def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
