package typings.carbonComponentsReact.libComponentsDataTableDataTableMod

import typings.carbonComponentsReact.anon.Header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableCell[V, H /* <: DataTableHeader[String] */] extends StObject {
  
  var errors: js.UndefOr[js.Array[Any] | Null] = js.undefined
  
  var id: String
  
  var info: Header[H]
  
  var isEditable: Boolean
  
  var isEditing: Boolean
  
  var isValid: Boolean
  
  var value: js.UndefOr[V] = js.undefined
}
object DataTableCell {
  
  inline def apply[V, H /* <: DataTableHeader[String] */](id: String, info: Header[H], isEditable: Boolean, isEditing: Boolean, isValid: Boolean): DataTableCell[V, H] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], isEditable = isEditable.asInstanceOf[js.Any], isEditing = isEditing.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableCell[V, H]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableCell[?, ?], V, H /* <: DataTableHeader[String] */] (val x: Self & (DataTableCell[V, H])) extends AnyVal {
    
    inline def setErrors(value: js.Array[Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsNull: Self = StObject.set(x, "errors", null)
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: Any*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: Header[H]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setIsEditable(value: Boolean): Self = StObject.set(x, "isEditable", value.asInstanceOf[js.Any])
    
    inline def setIsEditing(value: Boolean): Self = StObject.set(x, "isEditing", value.asInstanceOf[js.Any])
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
