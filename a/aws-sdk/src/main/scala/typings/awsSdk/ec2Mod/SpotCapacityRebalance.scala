package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotCapacityRebalance extends StObject {
  
  /**
    * The replacement strategy to use. Only available for fleets of type maintain. You must specify a value, otherwise you get an error. To allow Spot Fleet to launch a replacement Spot Instance when an instance rebalance notification is emitted for a Spot Instance in the fleet, specify launch.  When a replacement instance is launched, the instance marked for rebalance is not automatically terminated. You can terminate it, or you can leave it running. You are charged for all instances while they are running. 
    */
  var ReplacementStrategy: js.UndefOr[typings.awsSdk.ec2Mod.ReplacementStrategy] = js.undefined
}
object SpotCapacityRebalance {
  
  @scala.inline
  def apply(): SpotCapacityRebalance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotCapacityRebalance]
  }
  
  @scala.inline
  implicit class SpotCapacityRebalanceMutableBuilder[Self <: SpotCapacityRebalance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplacementStrategy(value: ReplacementStrategy): Self = StObject.set(x, "ReplacementStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacementStrategyUndefined: Self = StObject.set(x, "ReplacementStrategy", js.undefined)
  }
}
