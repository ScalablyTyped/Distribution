package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetSpotCapacityRebalanceRequest extends StObject {
  
  /**
    * The replacement strategy to use. Only available for fleets of type maintain. To allow EC2 Fleet to launch a replacement Spot Instance when an instance rebalance notification is emitted for an existing Spot Instance in the fleet, specify launch. You must specify a value, otherwise you get an error.  When a replacement instance is launched, the instance marked for rebalance is not automatically terminated. You can terminate it, or you can leave it running. You are charged for all instances while they are running. 
    */
  var ReplacementStrategy: js.UndefOr[FleetReplacementStrategy] = js.undefined
}
object FleetSpotCapacityRebalanceRequest {
  
  inline def apply(): FleetSpotCapacityRebalanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetSpotCapacityRebalanceRequest]
  }
  
  extension [Self <: FleetSpotCapacityRebalanceRequest](x: Self) {
    
    inline def setReplacementStrategy(value: FleetReplacementStrategy): Self = StObject.set(x, "ReplacementStrategy", value.asInstanceOf[js.Any])
    
    inline def setReplacementStrategyUndefined: Self = StObject.set(x, "ReplacementStrategy", js.undefined)
  }
}
