package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditCreateRowResult extends StObject {
  
  var defaultValues: js.Array[String]
  
  var newRowId: Double
}
object EditCreateRowResult {
  
  @scala.inline
  def apply(defaultValues: js.Array[String], newRowId: Double): EditCreateRowResult = {
    val __obj = js.Dynamic.literal(defaultValues = defaultValues.asInstanceOf[js.Any], newRowId = newRowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditCreateRowResult]
  }
  
  @scala.inline
  implicit class EditCreateRowResultMutableBuilder[Self <: EditCreateRowResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValues(value: js.Array[String]): Self = StObject.set(x, "defaultValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValuesVarargs(value: String*): Self = StObject.set(x, "defaultValues", js.Array(value :_*))
    
    @scala.inline
    def setNewRowId(value: Double): Self = StObject.set(x, "newRowId", value.asInstanceOf[js.Any])
  }
}
