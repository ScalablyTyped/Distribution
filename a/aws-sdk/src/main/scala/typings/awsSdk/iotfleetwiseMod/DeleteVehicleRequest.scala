package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVehicleRequest extends StObject {
  
  /**
    * The ID of the vehicle to delete. 
    */
  var vehicleName: typings.awsSdk.iotfleetwiseMod.vehicleName
}
object DeleteVehicleRequest {
  
  inline def apply(vehicleName: vehicleName): DeleteVehicleRequest = {
    val __obj = js.Dynamic.literal(vehicleName = vehicleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVehicleRequest]
  }
  
  extension [Self <: DeleteVehicleRequest](x: Self) {
    
    inline def setVehicleName(value: vehicleName): Self = StObject.set(x, "vehicleName", value.asInstanceOf[js.Any])
  }
}
