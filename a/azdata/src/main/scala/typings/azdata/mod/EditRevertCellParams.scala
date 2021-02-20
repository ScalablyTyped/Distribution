package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditRevertCellParams extends IEditRowOperationParams {
  
  var columnId: Double = js.native
}
object EditRevertCellParams {
  
  @scala.inline
  def apply(columnId: Double, ownerUri: String, rowId: Double): EditRevertCellParams = {
    val __obj = js.Dynamic.literal(columnId = columnId.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditRevertCellParams]
  }
  
  @scala.inline
  implicit class EditRevertCellParamsMutableBuilder[Self <: EditRevertCellParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnId(value: Double): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
  }
}
