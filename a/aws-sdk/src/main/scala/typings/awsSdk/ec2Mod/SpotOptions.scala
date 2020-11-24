package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotOptions extends js.Object {
  
  /**
    * Indicates how to allocate the target Spot Instance capacity across the Spot Instance pools specified by the EC2 Fleet. If the allocation strategy is lowest-price, EC2 Fleet launches instances from the Spot Instance pools with the lowest price. This is the default allocation strategy. If the allocation strategy is diversified, EC2 Fleet launches instances from all of the Spot Instance pools that you specify. If the allocation strategy is capacity-optimized, EC2 Fleet launches instances from Spot Instance pools with optimal capacity for the number of instances that are launching.
    */
  var AllocationStrategy: js.UndefOr[SpotAllocationStrategy] = js.native
  
  /**
    * The behavior when a Spot Instance is interrupted. The default is terminate.
    */
  var InstanceInterruptionBehavior: js.UndefOr[SpotInstanceInterruptionBehavior] = js.native
  
  /**
    * The number of Spot pools across which to allocate your target Spot capacity. Valid only when AllocationStrategy is set to lowest-price. EC2 Fleet selects the cheapest Spot pools and evenly allocates your target Spot capacity across the number of Spot pools that you specify.
    */
  var InstancePoolsToUseCount: js.UndefOr[Integer] = js.native
  
  /**
    * The strategies for managing your workloads on your Spot Instances that will be interrupted. Currently only the capacity rebalance strategy is available.
    */
  var MaintenanceStrategies: js.UndefOr[FleetSpotMaintenanceStrategies] = js.native
  
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
object SpotOptions {
  
  @scala.inline
  def apply(): SpotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotOptions]
  }
  
  @scala.inline
  implicit class SpotOptionsOps[Self <: SpotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllocationStrategy(value: SpotAllocationStrategy): Self = this.set("AllocationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocationStrategy: Self = this.set("AllocationStrategy", js.undefined)
    
    @scala.inline
    def setInstanceInterruptionBehavior(value: SpotInstanceInterruptionBehavior): Self = this.set("InstanceInterruptionBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceInterruptionBehavior: Self = this.set("InstanceInterruptionBehavior", js.undefined)
    
    @scala.inline
    def setInstancePoolsToUseCount(value: Integer): Self = this.set("InstancePoolsToUseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstancePoolsToUseCount: Self = this.set("InstancePoolsToUseCount", js.undefined)
    
    @scala.inline
    def setMaintenanceStrategies(value: FleetSpotMaintenanceStrategies): Self = this.set("MaintenanceStrategies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintenanceStrategies: Self = this.set("MaintenanceStrategies", js.undefined)
    
    @scala.inline
    def setMaxTotalPrice(value: String): Self = this.set("MaxTotalPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTotalPrice: Self = this.set("MaxTotalPrice", js.undefined)
    
    @scala.inline
    def setMinTargetCapacity(value: Integer): Self = this.set("MinTargetCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinTargetCapacity: Self = this.set("MinTargetCapacity", js.undefined)
    
    @scala.inline
    def setSingleAvailabilityZone(value: Boolean): Self = this.set("SingleAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleAvailabilityZone: Self = this.set("SingleAvailabilityZone", js.undefined)
    
    @scala.inline
    def setSingleInstanceType(value: Boolean): Self = this.set("SingleInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleInstanceType: Self = this.set("SingleInstanceType", js.undefined)
  }
}
