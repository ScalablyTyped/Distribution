package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotProvisioningSpecification extends StObject {
  
  /**
    *  Specifies the strategy to use in launching Spot Instance fleets. Currently, the only option is capacity-optimized (the default), which launches instances from Spot Instance pools with optimal capacity for the number of instances that are launching. 
    */
  var AllocationStrategy: js.UndefOr[SpotProvisioningAllocationStrategy] = js.undefined
  
  /**
    * The defined duration for Spot Instances (also known as Spot blocks) in minutes. When specified, the Spot Instance does not terminate before the defined duration expires, and defined duration pricing for Spot Instances applies. Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as a Spot Instance receives its instance ID. At the end of the duration, Amazon EC2 marks the Spot Instance for termination and provides a Spot Instance termination notice, which gives the instance a two-minute warning before it terminates.   Spot Instances with a defined duration (also known as Spot blocks) are no longer available to new customers from July 1, 2021. For customers who have previously used the feature, we will continue to support Spot Instances with a defined duration until December 31, 2022.  
    */
  var BlockDurationMinutes: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * The action to take when TargetSpotCapacity has not been fulfilled when the TimeoutDurationMinutes has expired; that is, when all Spot Instances could not be provisioned within the Spot provisioning timeout. Valid values are TERMINATE_CLUSTER and SWITCH_TO_ON_DEMAND. SWITCH_TO_ON_DEMAND specifies that if no Spot Instances are available, On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
    */
  var TimeoutAction: SpotProvisioningTimeoutAction
  
  /**
    * The spot provisioning timeout period in minutes. If Spot Instances are not provisioned within this time period, the TimeOutAction is taken. Minimum value is 5 and maximum value is 1440. The timeout applies only during initial provisioning, when the cluster is first created.
    */
  var TimeoutDurationMinutes: WholeNumber
}
object SpotProvisioningSpecification {
  
  inline def apply(TimeoutAction: SpotProvisioningTimeoutAction, TimeoutDurationMinutes: WholeNumber): SpotProvisioningSpecification = {
    val __obj = js.Dynamic.literal(TimeoutAction = TimeoutAction.asInstanceOf[js.Any], TimeoutDurationMinutes = TimeoutDurationMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotProvisioningSpecification]
  }
  
  extension [Self <: SpotProvisioningSpecification](x: Self) {
    
    inline def setAllocationStrategy(value: SpotProvisioningAllocationStrategy): Self = StObject.set(x, "AllocationStrategy", value.asInstanceOf[js.Any])
    
    inline def setAllocationStrategyUndefined: Self = StObject.set(x, "AllocationStrategy", js.undefined)
    
    inline def setBlockDurationMinutes(value: WholeNumber): Self = StObject.set(x, "BlockDurationMinutes", value.asInstanceOf[js.Any])
    
    inline def setBlockDurationMinutesUndefined: Self = StObject.set(x, "BlockDurationMinutes", js.undefined)
    
    inline def setTimeoutAction(value: SpotProvisioningTimeoutAction): Self = StObject.set(x, "TimeoutAction", value.asInstanceOf[js.Any])
    
    inline def setTimeoutDurationMinutes(value: WholeNumber): Self = StObject.set(x, "TimeoutDurationMinutes", value.asInstanceOf[js.Any])
  }
}
