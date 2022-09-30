package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVehicleError extends StObject {
  
  /**
    * An HTTP error code.
    */
  var code: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * A description of the HTTP error.
    */
  var message: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * The ID of the vehicle with the error.
    */
  var vehicleName: js.UndefOr[typings.awsSdk.iotfleetwiseMod.vehicleName] = js.undefined
}
object CreateVehicleError {
  
  inline def apply(): CreateVehicleError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVehicleError]
  }
  
  extension [Self <: CreateVehicleError](x: Self) {
    
    inline def setCode(value: java.lang.String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: java.lang.String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setVehicleName(value: vehicleName): Self = StObject.set(x, "vehicleName", value.asInstanceOf[js.Any])
    
    inline def setVehicleNameUndefined: Self = StObject.set(x, "vehicleName", js.undefined)
  }
}
