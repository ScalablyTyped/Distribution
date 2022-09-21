package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchEvaluateGeofencesError extends StObject {
  
  /**
    * The device associated with the position evaluation error.
    */
  var DeviceId: Id
  
  /**
    * Contains details associated to the batch error.
    */
  var Error: BatchItemError
  
  /**
    * Specifies a timestamp for when the error occurred in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ 
    */
  var SampleTime: js.Date
}
object BatchEvaluateGeofencesError {
  
  inline def apply(DeviceId: Id, Error: BatchItemError, SampleTime: js.Date): BatchEvaluateGeofencesError = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], SampleTime = SampleTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchEvaluateGeofencesError]
  }
  
  extension [Self <: BatchEvaluateGeofencesError](x: Self) {
    
    inline def setDeviceId(value: Id): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setError(value: BatchItemError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setSampleTime(value: js.Date): Self = StObject.set(x, "SampleTime", value.asInstanceOf[js.Any])
  }
}
