package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditUpdateCellParams extends IEditRowOperationParams {
  
  var columnId: Double = js.native
  
  var newValue: String = js.native
}
object EditUpdateCellParams {
  
  @scala.inline
  def apply(columnId: Double, newValue: String, ownerUri: String, rowId: Double): EditUpdateCellParams = {
    val __obj = js.Dynamic.literal(columnId = columnId.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditUpdateCellParams]
  }
  
  @scala.inline
  implicit class EditUpdateCellParamsMutableBuilder[Self <: EditUpdateCellParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnId(value: Double): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
  }
}
