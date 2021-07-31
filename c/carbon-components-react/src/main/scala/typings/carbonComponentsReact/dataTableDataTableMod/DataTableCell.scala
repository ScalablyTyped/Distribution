package typings.carbonComponentsReact.dataTableDataTableMod

import typings.carbonComponentsReact.anon.Header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableCell[V, H /* <: DataTableHeader[String] */] extends StObject {
  
  var errors: js.UndefOr[js.Array[js.Any] | Null] = js.undefined
  
  var id: String
  
  var info: Header[H]
  
  var isEditable: Boolean
  
  var isEditing: Boolean
  
  var isValid: Boolean
  
  var value: js.UndefOr[V] = js.undefined
}
object DataTableCell {
  
  @scala.inline
  def apply[V, H /* <: DataTableHeader[String] */](id: String, info: Header[H], isEditable: Boolean, isEditing: Boolean, isValid: Boolean): DataTableCell[V, H] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], isEditable = isEditable.asInstanceOf[js.Any], isEditing = isEditing.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableCell[V, H]]
  }
  
  @scala.inline
  implicit class DataTableCellMutableBuilder[Self <: DataTableCell[?, ?], V, H /* <: DataTableHeader[String] */] (val x: Self & (DataTableCell[V, H])) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[js.Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsNull: Self = StObject.set(x, "errors", null)
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: js.Any*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: Header[H]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEditable(value: Boolean): Self = StObject.set(x, "isEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEditing(value: Boolean): Self = StObject.set(x, "isEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
