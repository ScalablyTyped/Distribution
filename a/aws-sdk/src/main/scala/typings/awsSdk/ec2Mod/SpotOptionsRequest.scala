package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotOptionsRequest extends StObject {
  
  /**
    * Indicates how to allocate the target Spot Instance capacity across the Spot Instance pools specified by the EC2 Fleet. If the allocation strategy is lowest-price, EC2 Fleet launches instances from the Spot Instance pools with the lowest price. This is the default allocation strategy. If the allocation strategy is diversified, EC2 Fleet launches instances from all of the Spot Instance pools that you specify. If the allocation strategy is capacity-optimized, EC2 Fleet launches instances from Spot Instance pools with optimal capacity for the number of instances that are launching.
    */
  var AllocationStrategy: js.UndefOr[SpotAllocationStrategy] = js.native
  
  /**
    * The behavior when a Spot Instance is interrupted. The default is terminate.
    */
  var InstanceInterruptionBehavior: js.UndefOr[SpotInstanceInterruptionBehavior] = js.native
  
  /**
    * The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot AllocationStrategy is set to lowest-price. EC2 Fleet selects the cheapest Spot pools and evenly allocates your target Spot capacity across the number of Spot pools that you specify.
    */
  var InstancePoolsToUseCount: js.UndefOr[Integer] = js.native
  
  /**
    * The strategies for managing your Spot Instances that are at an elevated risk of being interrupted.
    */
  var MaintenanceStrategies: js.UndefOr[FleetSpotMaintenanceStrategiesRequest] = js.native
  
  /**
    * The maximum amount per hour for Spot Instances that you're willing to pay.
    */
  var MaxTotalPrice: js.UndefOr[String] = js.native
  
  /**
    * The minimum target capacity for Spot Instances in the fleet. If the minimum target capacity is not reached, the fleet launches no instances.
    */
  var MinTargetCapacity: js.UndefOr[Integer] = js.native
  
  /**
    * Indicates that the fleet launches all Spot Instances into a single Availability Zone. Supported only for fleets of type instant.
    */
  var SingleAvailabilityZone: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates that the fleet uses a single instance type to launch all Spot Instances in the fleet. Supported only for fleets of type instant.
    */
  var SingleInstanceType: js.UndefOr[Boolean] = js.native
}
object SpotOptionsRequest {
  
  @scala.inline
  def apply(): SpotOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotOptionsRequest]
  }
  
  @scala.inline
  implicit class SpotOptionsRequestMutableBuilder[Self <: SpotOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocationStrategy(value: SpotAllocationStrategy): Self = StObject.set(x, "AllocationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocationStrategyUndefined: Self = StObject.set(x, "AllocationStrategy", js.undefined)
    
    @scala.inline
    def setInstanceInterruptionBehavior(value: SpotInstanceInterruptionBehavior): Self = StObject.set(x, "InstanceInterruptionBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceInterruptionBehaviorUndefined: Self = StObject.set(x, "InstanceInterruptionBehavior", js.undefined)
    
    @scala.inline
    def setInstancePoolsToUseCount(value: Integer): Self = StObject.set(x, "InstancePoolsToUseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancePoolsToUseCountUndefined: Self = StObject.set(x, "InstancePoolsToUseCount", js.undefined)
    
    @scala.inline
    def setMaintenanceStrategies(value: FleetSpotMaintenanceStrategiesRequest): Self = StObject.set(x, "MaintenanceStrategies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenanceStrategiesUndefined: Self = StObject.set(x, "MaintenanceStrategies", js.undefined)
    
    @scala.inline
    def setMaxTotalPrice(value: String): Self = StObject.set(x, "MaxTotalPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTotalPriceUndefined: Self = StObject.set(x, "MaxTotalPrice", js.undefined)
    
    @scala.inline
    def setMinTargetCapacity(value: Integer): Self = StObject.set(x, "MinTargetCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinTargetCapacityUndefined: Self = StObject.set(x, "MinTargetCapacity", js.undefined)
    
    @scala.inline
    def setSingleAvailabilityZone(value: Boolean): Self = StObject.set(x, "SingleAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleAvailabilityZoneUndefined: Self = StObject.set(x, "SingleAvailabilityZone", js.undefined)
    
    @scala.inline
    def setSingleInstanceType(value: Boolean): Self = StObject.set(x, "SingleInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleInstanceTypeUndefined: Self = StObject.set(x, "SingleInstanceType", js.undefined)
  }
}
