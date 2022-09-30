package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVehicleError extends StObject {
  
  /**
    * The relevant HTTP error code (400+).
    */
  var code: js.UndefOr[Double] = js.undefined
  
  /**
    * A message associated with the error.
    */
  var message: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * The ID of the vehicle with the error.
    */
  var vehicleName: js.UndefOr[typings.awsSdk.iotfleetwiseMod.vehicleName] = js.undefined
}
object UpdateVehicleError {
  
  inline def apply(): UpdateVehicleError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVehicleError]
  }
  
  extension [Self <: UpdateVehicleError](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: java.lang.String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setVehicleName(value: vehicleName): Self = StObject.set(x, "vehicleName", value.asInstanceOf[js.Any])
    
    inline def setVehicleNameUndefined: Self = StObject.set(x, "vehicleName", js.undefined)
  }
}
