package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetSpotMaintenanceStrategiesRequest extends StObject {
  
  /**
    * The strategy to use when Amazon EC2 emits a signal that your Spot Instance is at an elevated risk of being interrupted.
    */
  var CapacityRebalance: js.UndefOr[FleetSpotCapacityRebalanceRequest] = js.undefined
}
object FleetSpotMaintenanceStrategiesRequest {
  
  inline def apply(): FleetSpotMaintenanceStrategiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetSpotMaintenanceStrategiesRequest]
  }
  
  extension [Self <: FleetSpotMaintenanceStrategiesRequest](x: Self) {
    
    inline def setCapacityRebalance(value: FleetSpotCapacityRebalanceRequest): Self = StObject.set(x, "CapacityRebalance", value.asInstanceOf[js.Any])
    
    inline def setCapacityRebalanceUndefined: Self = StObject.set(x, "CapacityRebalance", js.undefined)
  }
}
