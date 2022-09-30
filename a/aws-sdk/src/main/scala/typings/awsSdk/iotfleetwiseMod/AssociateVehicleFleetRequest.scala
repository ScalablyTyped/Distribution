package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateVehicleFleetRequest extends StObject {
  
  /**
    *  The ID of a fleet. 
    */
  var fleetId: typings.awsSdk.iotfleetwiseMod.fleetId
  
  /**
    *  The unique ID of the vehicle to associate with the fleet. 
    */
  var vehicleName: typings.awsSdk.iotfleetwiseMod.vehicleName
}
object AssociateVehicleFleetRequest {
  
  inline def apply(fleetId: fleetId, vehicleName: vehicleName): AssociateVehicleFleetRequest = {
    val __obj = js.Dynamic.literal(fleetId = fleetId.asInstanceOf[js.Any], vehicleName = vehicleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateVehicleFleetRequest]
  }
  
  extension [Self <: AssociateVehicleFleetRequest](x: Self) {
    
    inline def setFleetId(value: fleetId): Self = StObject.set(x, "fleetId", value.asInstanceOf[js.Any])
    
    inline def setVehicleName(value: vehicleName): Self = StObject.set(x, "vehicleName", value.asInstanceOf[js.Any])
  }
}
