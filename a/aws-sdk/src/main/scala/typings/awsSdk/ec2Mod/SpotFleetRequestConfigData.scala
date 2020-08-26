package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotFleetRequestConfigData extends js.Object {
  /**
    * Indicates how to allocate the target Spot Instance capacity across the Spot Instance pools specified by the Spot Fleet request. If the allocation strategy is lowestPrice, Spot Fleet launches instances from the Spot Instance pools with the lowest price. This is the default allocation strategy. If the allocation strategy is diversified, Spot Fleet launches instances from all the Spot Instance pools that you specify. If the allocation strategy is capacityOptimized, Spot Fleet launches instances from Spot Instance pools with optimal capacity for the number of instances that are launching.
    */
  var AllocationStrategy: js.UndefOr[typings.awsSdk.ec2Mod.AllocationStrategy] = js.native
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of your listings. This helps to avoid duplicate listings. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Indicates whether running Spot Instances should be terminated if you decrease the target capacity of the Spot Fleet request below the current size of the Spot Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[typings.awsSdk.ec2Mod.ExcessCapacityTerminationPolicy] = js.native
  /**
    * The number of units fulfilled by this request compared to the set target capacity. You cannot set this value.
    */
  var FulfilledCapacity: js.UndefOr[Double] = js.native
  /**
    * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that grants the Spot Fleet the permission to request, launch, terminate, and tag instances on your behalf. For more information, see Spot Fleet prerequisites in the Amazon EC2 User Guide for Linux Instances. Spot Fleet can terminate Spot Instances on your behalf when you cancel its Spot Fleet request using CancelSpotFleetRequests or when the Spot Fleet request expires, if you set TerminateInstancesWithExpiration.
    */
  var IamFleetRole: String = js.native
  /**
    * The behavior when a Spot Instance is interrupted. The default is terminate.
    */
  var InstanceInterruptionBehavior: js.UndefOr[typings.awsSdk.ec2Mod.InstanceInterruptionBehavior] = js.native
  /**
    * The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot AllocationStrategy is set to lowest-price. Spot Fleet selects the cheapest Spot pools and evenly allocates your target Spot capacity across the number of Spot pools that you specify.
    */
  var InstancePoolsToUseCount: js.UndefOr[Integer] = js.native
  /**
    * The launch specifications for the Spot Fleet request. If you specify LaunchSpecifications, you can't specify LaunchTemplateConfigs. If you include On-Demand capacity in your request, you must use LaunchTemplateConfigs.
    */
  var LaunchSpecifications: js.UndefOr[LaunchSpecsList] = js.native
  /**
    * The launch template and overrides. If you specify LaunchTemplateConfigs, you can't specify LaunchSpecifications. If you include On-Demand capacity in your request, you must use LaunchTemplateConfigs.
    */
  var LaunchTemplateConfigs: js.UndefOr[LaunchTemplateConfigList] = js.native
  /**
    * One or more Classic Load Balancers and target groups to attach to the Spot Fleet request. Spot Fleet registers the running Spot Instances with the specified Classic Load Balancers and target groups. With Network Load Balancers, Spot Fleet cannot register instances that have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
    */
  var LoadBalancersConfig: js.UndefOr[typings.awsSdk.ec2Mod.LoadBalancersConfig] = js.native
  /**
    * The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify lowestPrice, Spot Fleet uses price to determine the order, launching the lowest price first. If you specify prioritized, Spot Fleet uses the priority that you assign to each Spot Fleet launch template override, launching the highest priority first. If you do not specify a value, Spot Fleet defaults to lowestPrice.
    */
  var OnDemandAllocationStrategy: js.UndefOr[typings.awsSdk.ec2Mod.OnDemandAllocationStrategy] = js.native
  /**
    * The number of On-Demand units fulfilled by this request compared to the set target On-Demand capacity.
    */
  var OnDemandFulfilledCapacity: js.UndefOr[Double] = js.native
  /**
    * The maximum amount per hour for On-Demand Instances that you're willing to pay. You can use the onDemandMaxTotalPrice parameter, the spotMaxTotalPrice parameter, or both parameters to ensure that your fleet cost does not exceed your budget. If you set a maximum price per hour for the On-Demand Instances and Spot Instances in your request, Spot Fleet will launch instances until it reaches the maximum amount you're willing to pay. When the maximum amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity.
    */
  var OnDemandMaxTotalPrice: js.UndefOr[String] = js.native
  /**
    * The number of On-Demand units to request. You can choose to set the target capacity in terms of instances or a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is maintain, you can specify a target capacity of 0 and add capacity later.
    */
  var OnDemandTargetCapacity: js.UndefOr[Integer] = js.native
  /**
    * Indicates whether Spot Fleet should replace unhealthy instances.
    */
  var ReplaceUnhealthyInstances: js.UndefOr[Boolean] = js.native
  /**
    * The maximum amount per hour for Spot Instances that you're willing to pay. You can use the spotdMaxTotalPrice parameter, the onDemandMaxTotalPrice parameter, or both parameters to ensure that your fleet cost does not exceed your budget. If you set a maximum price per hour for the On-Demand Instances and Spot Instances in your request, Spot Fleet will launch instances until it reaches the maximum amount you're willing to pay. When the maximum amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity.
    */
  var SpotMaxTotalPrice: js.UndefOr[String] = js.native
  /**
    * The maximum price per unit hour that you are willing to pay for a Spot Instance. The default is the On-Demand price.
    */
  var SpotPrice: js.UndefOr[String] = js.native
  /**
    * The key-value pair for tagging the Spot Fleet request on creation. The value for ResourceType must be spot-fleet-request, otherwise the Spot Fleet request fails. To tag instances at launch, specify the tags in the launch template (valid only if you use LaunchTemplateConfigs) or in the  SpotFleetTagSpecification  (valid only if you use LaunchSpecifications). For information about tagging after launch, see Tagging Your Resources.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  /**
    * The number of units to request for the Spot Fleet. You can choose to set the target capacity in terms of instances or a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is maintain, you can specify a target capacity of 0 and add capacity later.
    */
  var TargetCapacity: Integer = js.native
  /**
    * Indicates whether running Spot Instances are terminated when the Spot Fleet request expires.
    */
  var TerminateInstancesWithExpiration: js.UndefOr[Boolean] = js.native
  /**
    * The type of request. Indicates whether the Spot Fleet only requests the target capacity or also attempts to maintain it. When this value is request, the Spot Fleet only places the required requests. It does not attempt to replenish Spot Instances if capacity is diminished, nor does it submit requests in alternative Spot pools if capacity is not available. When this value is maintain, the Spot Fleet maintains the target capacity. The Spot Fleet places the required requests to meet capacity and automatically replenishes any interrupted instances. Default: maintain. instant is listed but is not used by Spot Fleet.
    */
  var Type: js.UndefOr[FleetType] = js.native
  /**
    * The start date and time of the request, in UTC format (YYYY-MM-DDTHH:MM:SSZ). By default, Amazon EC2 starts fulfilling the request immediately.
    */
  var ValidFrom: js.UndefOr[DateTime] = js.native
  /**
    * The end date and time of the request, in UTC format (YYYY-MM-DDTHH:MM:SSZ). After the end date and time, no new Spot Instance requests are placed or able to fulfill the request. If no value is specified, the Spot Fleet request remains until you cancel it.
    */
  var ValidUntil: js.UndefOr[DateTime] = js.native
}

object SpotFleetRequestConfigData {
  @scala.inline
  def apply(IamFleetRole: String, TargetCapacity: Integer): SpotFleetRequestConfigData = {
    val __obj = js.Dynamic.literal(IamFleetRole = IamFleetRole.asInstanceOf[js.Any], TargetCapacity = TargetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestConfigData]
  }
  @scala.inline
  implicit class SpotFleetRequestConfigDataOps[Self <: SpotFleetRequestConfigData] (val x: Self) extends AnyVal {
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
    def setIamFleetRole(value: String): Self = this.set("IamFleetRole", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetCapacity(value: Integer): Self = this.set("TargetCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllocationStrategy(value: AllocationStrategy): Self = this.set("AllocationStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocationStrategy: Self = this.set("AllocationStrategy", js.undefined)
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    @scala.inline
    def setExcessCapacityTerminationPolicy(value: ExcessCapacityTerminationPolicy): Self = this.set("ExcessCapacityTerminationPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcessCapacityTerminationPolicy: Self = this.set("ExcessCapacityTerminationPolicy", js.undefined)
    @scala.inline
    def setFulfilledCapacity(value: Double): Self = this.set("FulfilledCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFulfilledCapacity: Self = this.set("FulfilledCapacity", js.undefined)
    @scala.inline
    def setInstanceInterruptionBehavior(value: InstanceInterruptionBehavior): Self = this.set("InstanceInterruptionBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceInterruptionBehavior: Self = this.set("InstanceInterruptionBehavior", js.undefined)
    @scala.inline
    def setInstancePoolsToUseCount(value: Integer): Self = this.set("InstancePoolsToUseCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstancePoolsToUseCount: Self = this.set("InstancePoolsToUseCount", js.undefined)
    @scala.inline
    def setLaunchSpecificationsVarargs(value: SpotFleetLaunchSpecification*): Self = this.set("LaunchSpecifications", js.Array(value :_*))
    @scala.inline
    def setLaunchSpecifications(value: LaunchSpecsList): Self = this.set("LaunchSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchSpecifications: Self = this.set("LaunchSpecifications", js.undefined)
    @scala.inline
    def setLaunchTemplateConfigsVarargs(value: LaunchTemplateConfig*): Self = this.set("LaunchTemplateConfigs", js.Array(value :_*))
    @scala.inline
    def setLaunchTemplateConfigs(value: LaunchTemplateConfigList): Self = this.set("LaunchTemplateConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplateConfigs: Self = this.set("LaunchTemplateConfigs", js.undefined)
    @scala.inline
    def setLoadBalancersConfig(value: LoadBalancersConfig): Self = this.set("LoadBalancersConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancersConfig: Self = this.set("LoadBalancersConfig", js.undefined)
    @scala.inline
    def setOnDemandAllocationStrategy(value: OnDemandAllocationStrategy): Self = this.set("OnDemandAllocationStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDemandAllocationStrategy: Self = this.set("OnDemandAllocationStrategy", js.undefined)
    @scala.inline
    def setOnDemandFulfilledCapacity(value: Double): Self = this.set("OnDemandFulfilledCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDemandFulfilledCapacity: Self = this.set("OnDemandFulfilledCapacity", js.undefined)
    @scala.inline
    def setOnDemandMaxTotalPrice(value: String): Self = this.set("OnDemandMaxTotalPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDemandMaxTotalPrice: Self = this.set("OnDemandMaxTotalPrice", js.undefined)
    @scala.inline
    def setOnDemandTargetCapacity(value: Integer): Self = this.set("OnDemandTargetCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDemandTargetCapacity: Self = this.set("OnDemandTargetCapacity", js.undefined)
    @scala.inline
    def setReplaceUnhealthyInstances(value: Boolean): Self = this.set("ReplaceUnhealthyInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceUnhealthyInstances: Self = this.set("ReplaceUnhealthyInstances", js.undefined)
    @scala.inline
    def setSpotMaxTotalPrice(value: String): Self = this.set("SpotMaxTotalPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotMaxTotalPrice: Self = this.set("SpotMaxTotalPrice", js.undefined)
    @scala.inline
    def setSpotPrice(value: String): Self = this.set("SpotPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotPrice: Self = this.set("SpotPrice", js.undefined)
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
    @scala.inline
    def setTerminateInstancesWithExpiration(value: Boolean): Self = this.set("TerminateInstancesWithExpiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminateInstancesWithExpiration: Self = this.set("TerminateInstancesWithExpiration", js.undefined)
    @scala.inline
    def setType(value: FleetType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setValidFrom(value: DateTime): Self = this.set("ValidFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidFrom: Self = this.set("ValidFrom", js.undefined)
    @scala.inline
    def setValidUntil(value: DateTime): Self = this.set("ValidUntil", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidUntil: Self = this.set("ValidUntil", js.undefined)
  }
  
}

