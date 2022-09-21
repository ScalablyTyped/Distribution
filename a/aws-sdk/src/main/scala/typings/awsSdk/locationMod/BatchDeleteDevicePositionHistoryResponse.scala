package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteDevicePositionHistoryResponse extends StObject {
  
  /**
    * Contains error details for each device history that failed to delete.
    */
  var Errors: BatchDeleteDevicePositionHistoryErrorList
}
object BatchDeleteDevicePositionHistoryResponse {
  
  inline def apply(Errors: BatchDeleteDevicePositionHistoryErrorList): BatchDeleteDevicePositionHistoryResponse = {
    val __obj = js.Dynamic.literal(Errors = Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteDevicePositionHistoryResponse]
  }
  
  extension [Self <: BatchDeleteDevicePositionHistoryResponse](x: Self) {
    
    inline def setErrors(value: BatchDeleteDevicePositionHistoryErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: BatchDeleteDevicePositionHistoryError*): Self = StObject.set(x, "Errors", js.Array(value*))
  }
}
