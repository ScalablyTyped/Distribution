package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateVehicleResponse extends StObject {
  
  /**
    * A list of information about creation errors, or an empty list if there aren't any errors. 
    */
  var errors: js.UndefOr[createVehicleErrors] = js.undefined
  
  /**
    *  A list of information about a batch of created vehicles. For more information, see the API data type.
    */
  var vehicles: js.UndefOr[createVehicleResponses] = js.undefined
}
object BatchCreateVehicleResponse {
  
  inline def apply(): BatchCreateVehicleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateVehicleResponse]
  }
  
  extension [Self <: BatchCreateVehicleResponse](x: Self) {
    
    inline def setErrors(value: createVehicleErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: CreateVehicleError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setVehicles(value: createVehicleResponses): Self = StObject.set(x, "vehicles", value.asInstanceOf[js.Any])
    
    inline def setVehiclesUndefined: Self = StObject.set(x, "vehicles", js.undefined)
    
    inline def setVehiclesVarargs(value: CreateVehicleResponseItem*): Self = StObject.set(x, "vehicles", js.Array(value*))
  }
}
