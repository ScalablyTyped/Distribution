package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDevicePositionError extends StObject {
  
  /**
    * The ID of the device that didn't return a position.
    */
  var DeviceId: Id
  
  /**
    * Contains details related to the error code.
    */
  var Error: BatchItemError
}
object BatchGetDevicePositionError {
  
  inline def apply(DeviceId: Id, Error: BatchItemError): BatchGetDevicePositionError = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDevicePositionError]
  }
  
  extension [Self <: BatchGetDevicePositionError](x: Self) {
    
    inline def setDeviceId(value: Id): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setError(value: BatchItemError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
  }
}
