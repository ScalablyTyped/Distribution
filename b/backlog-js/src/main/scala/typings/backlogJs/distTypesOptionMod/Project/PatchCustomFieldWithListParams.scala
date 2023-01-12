package typings.backlogJs.distTypesOptionMod.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchCustomFieldWithListParams
  extends StObject
     with PatchCustomFieldParams {
  
  var allowAddItem: js.UndefOr[Boolean] = js.undefined
  
  var allowInput: js.UndefOr[Boolean] = js.undefined
  
  var items: js.UndefOr[js.Array[String]] = js.undefined
}
object PatchCustomFieldWithListParams {
  
  inline def apply(): PatchCustomFieldWithListParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchCustomFieldWithListParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatchCustomFieldWithListParams] (val x: Self) extends AnyVal {
    
    inline def setAllowAddItem(value: Boolean): Self = StObject.set(x, "allowAddItem", value.asInstanceOf[js.Any])
    
    inline def setAllowAddItemUndefined: Self = StObject.set(x, "allowAddItem", js.undefined)
    
    inline def setAllowInput(value: Boolean): Self = StObject.set(x, "allowInput", value.asInstanceOf[js.Any])
    
    inline def setAllowInputUndefined: Self = StObject.set(x, "allowInput", js.undefined)
    
    inline def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
