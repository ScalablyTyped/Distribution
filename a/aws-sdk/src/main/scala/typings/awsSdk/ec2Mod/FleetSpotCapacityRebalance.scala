package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetSpotCapacityRebalance extends StObject {
  
  /**
    * To allow EC2 Fleet to launch a replacement Spot Instance when an instance rebalance notification is emitted for an existing Spot Instance in the fleet, specify launch. Only available for fleets of type maintain.  When a replacement instance is launched, the instance marked for rebalance is not automatically terminated. You can terminate it, or you can leave it running. You are charged for both instances while they are running. 
    */
  var ReplacementStrategy: js.UndefOr[FleetReplacementStrategy] = js.undefined
}
object FleetSpotCapacityRebalance {
  
  inline def apply(): FleetSpotCapacityRebalance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetSpotCapacityRebalance]
  }
  
  extension [Self <: FleetSpotCapacityRebalance](x: Self) {
    
    inline def setReplacementStrategy(value: FleetReplacementStrategy): Self = StObject.set(x, "ReplacementStrategy", value.asInstanceOf[js.Any])
    
    inline def setReplacementStrategyUndefined: Self = StObject.set(x, "ReplacementStrategy", js.undefined)
  }
}
