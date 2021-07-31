package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetLaunchTemplateOverridesRequest extends StObject {
  
  /**
    * The Availability Zone in which to launch the instances.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.undefined
  
  /**
    * The maximum price per unit hour that you are willing to pay for a Spot Instance.
    */
  var MaxPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The location where the instance launched, if applicable.
    */
  var Placement: js.UndefOr[typings.awsSdk.ec2Mod.Placement] = js.undefined
  
  /**
    * The priority for the launch template override. If AllocationStrategy is set to prioritized, EC2 Fleet uses priority to determine which launch template override to use first in fulfilling On-Demand capacity. The highest priority is launched first. Valid values are whole numbers starting at 0. The lower the number, the higher the priority. If no number is set, the launch template override has the lowest priority.
    */
  var Priority: js.UndefOr[Double] = js.undefined
  
  /**
    * The IDs of the subnets in which to launch the instances. Separate multiple subnet IDs using commas (for example, subnet-1234abcdeexample1, subnet-0987cdef6example2). A request of type instant can have only one subnet ID.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.ec2Mod.SubnetId] = js.undefined
  
  /**
    * The number of units provided by the specified instance type.
    */
  var WeightedCapacity: js.UndefOr[Double] = js.undefined
}
object FleetLaunchTemplateOverridesRequest {
  
  @scala.inline
  def apply(): FleetLaunchTemplateOverridesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetLaunchTemplateOverridesRequest]
  }
  
  @scala.inline
  implicit class FleetLaunchTemplateOverridesRequestMutableBuilder[Self <: FleetLaunchTemplateOverridesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setMaxPrice(value: String): Self = StObject.set(x, "MaxPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPriceUndefined: Self = StObject.set(x, "MaxPrice", js.undefined)
    
    @scala.inline
    def setPlacement(value: Placement): Self = StObject.set(x, "Placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "Placement", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    @scala.inline
    def setWeightedCapacity(value: Double): Self = StObject.set(x, "WeightedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedCapacityUndefined: Self = StObject.set(x, "WeightedCapacity", js.undefined)
  }
}
