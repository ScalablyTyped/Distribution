package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VehicleStatus extends StObject {
  
  /**
    * The name of a campaign.
    */
  var campaignName: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * The state of a vehicle, which can be one of the following:    CREATED - Amazon Web Services IoT FleetWise sucessfully created the vehicle.     READY - The vehicle is ready to receive a campaign deployment.     HEALTHY - A campaign deployment was delivered to the vehicle.     SUSPENDED - A campaign associated with the vehicle was suspended and data collection was paused.     DELETING - Amazon Web Services IoT FleetWise is removing a campaign from the vehicle.   
    */
  var status: js.UndefOr[VehicleState] = js.undefined
  
  /**
    * The unique ID of the vehicle.
    */
  var vehicleName: js.UndefOr[typings.awsSdk.iotfleetwiseMod.vehicleName] = js.undefined
}
object VehicleStatus {
  
  inline def apply(): VehicleStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VehicleStatus]
  }
  
  extension [Self <: VehicleStatus](x: Self) {
    
    inline def setCampaignName(value: java.lang.String): Self = StObject.set(x, "campaignName", value.asInstanceOf[js.Any])
    
    inline def setCampaignNameUndefined: Self = StObject.set(x, "campaignName", js.undefined)
    
    inline def setStatus(value: VehicleState): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setVehicleName(value: vehicleName): Self = StObject.set(x, "vehicleName", value.asInstanceOf[js.Any])
    
    inline def setVehicleNameUndefined: Self = StObject.set(x, "vehicleName", js.undefined)
  }
}
