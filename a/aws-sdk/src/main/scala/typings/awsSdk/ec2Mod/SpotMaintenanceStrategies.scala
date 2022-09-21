package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotMaintenanceStrategies extends StObject {
  
  /**
    * The Spot Instance replacement strategy to use when Amazon EC2 emits a signal that your Spot Instance is at an elevated risk of being interrupted. For more information, see Capacity rebalancing in the Amazon EC2 User Guide for Linux Instances.
    */
  var CapacityRebalance: js.UndefOr[SpotCapacityRebalance] = js.undefined
}
object SpotMaintenanceStrategies {
  
  inline def apply(): SpotMaintenanceStrategies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotMaintenanceStrategies]
  }
  
  extension [Self <: SpotMaintenanceStrategies](x: Self) {
    
    inline def setCapacityRebalance(value: SpotCapacityRebalance): Self = StObject.set(x, "CapacityRebalance", value.asInstanceOf[js.Any])
    
    inline def setCapacityRebalanceUndefined: Self = StObject.set(x, "CapacityRebalance", js.undefined)
  }
}
