package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetSpotCapacityRebalanceRequest extends StObject {
  
  /**
    * The replacement strategy to use. Only available for fleets of type maintain.  launch - EC2 Fleet launches a replacement Spot Instance when a rebalance notification is emitted for an existing Spot Instance in the fleet. EC2 Fleet does not terminate the instances that receive a rebalance notification. You can terminate the old instances, or you can leave them running. You are charged for all instances while they are running.   launch-before-terminate - EC2 Fleet launches a replacement Spot Instance when a rebalance notification is emitted for an existing Spot Instance in the fleet, and then, after a delay that you specify (in TerminationDelay), terminates the instances that received a rebalance notification.
    */
  var ReplacementStrategy: js.UndefOr[FleetReplacementStrategy] = js.undefined
  
  /**
    * The amount of time (in seconds) that Amazon EC2 waits before terminating the old Spot Instance after launching a new replacement Spot Instance. Required when ReplacementStrategy is set to launch-before-terminate. Not valid when ReplacementStrategy is set to launch. Valid values: Minimum value of 120 seconds. Maximum value of 7200 seconds.
    */
  var TerminationDelay: js.UndefOr[Integer] = js.undefined
}
object FleetSpotCapacityRebalanceRequest {
  
  inline def apply(): FleetSpotCapacityRebalanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetSpotCapacityRebalanceRequest]
  }
  
  extension [Self <: FleetSpotCapacityRebalanceRequest](x: Self) {
    
    inline def setReplacementStrategy(value: FleetReplacementStrategy): Self = StObject.set(x, "ReplacementStrategy", value.asInstanceOf[js.Any])
    
    inline def setReplacementStrategyUndefined: Self = StObject.set(x, "ReplacementStrategy", js.undefined)
    
    inline def setTerminationDelay(value: Integer): Self = StObject.set(x, "TerminationDelay", value.asInstanceOf[js.Any])
    
    inline def setTerminationDelayUndefined: Self = StObject.set(x, "TerminationDelay", js.undefined)
  }
}
