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
  
  @scala.inline
  def apply(ownerUri: String, rowId: Double): IEditRowOperationParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditRowOperationParams]
  }
  
  @scala.inline
  implicit class IEditRowOperationParamsMutableBuilder[Self <: IEditRowOperationParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRowId(value: Double): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
  }
}
