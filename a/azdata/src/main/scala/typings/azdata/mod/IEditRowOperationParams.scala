package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditRowOperationParams
  extends StObject
     with IEditSessionOperationParams {
  
  var rowId: Double
}
object IEditRowOperationParams {
  
  inline def apply(ownerUri: String, rowId: Double): IEditRowOperationParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditRowOperationParams]
  }
  
  extension [Self <: IEditRowOperationParams](x: Self) {
    
    inline def setRowId(value: Double): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
  }
}
