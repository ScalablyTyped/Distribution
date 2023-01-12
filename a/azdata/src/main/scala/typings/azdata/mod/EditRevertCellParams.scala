package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditRevertCellParams
  extends StObject
     with IEditRowOperationParams {
  
  var columnId: Double
}
object EditRevertCellParams {
  
  inline def apply(columnId: Double, ownerUri: String, rowId: Double): EditRevertCellParams = {
    val __obj = js.Dynamic.literal(columnId = columnId.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditRevertCellParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditRevertCellParams] (val x: Self) extends AnyVal {
    
    inline def setColumnId(value: Double): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
  }
}
