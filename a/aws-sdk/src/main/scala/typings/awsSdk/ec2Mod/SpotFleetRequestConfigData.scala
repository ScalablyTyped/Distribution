package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotFleetRequestConfigData extends StObject {
  
  /**
    * Indicates how to allocate the target Spot Instance capacity across the Spot Instance pools specified by the Spot Fleet request. If the allocation strategy is lowestPrice, Spot Fleet launches instances from the Spot Instance pools with the lowest price. This is the default allocation strategy. If the allocation strategy is diversified, Spot Fleet launches instances from all the Spot Instance pools that you specify. If the allocation strategy is capacityOptimized, Spot Fleet launches instances from Spot Instance pools with optimal capacity for the number of instances that are launching.
    */
  var AllocationStrategy: js.UndefOr[typings.awsSdk.ec2Mod.AllocationStrategy] = js.undefined
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of your listings. This helps to avoid duplicate listings. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether running Spot Instances should be terminated if you decrease the target capacity of the Spot Fleet request below the current size of the Spot Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[typings.awsSdk.ec2Mod.ExcessCapacityTerminationPolicy] = js.undefined
  
  /**
    * The number of units fulfilled by this request compared to the set target capacity. You cannot set this value.
    */
  var FulfilledCapacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that grants the Spot Fleet the permission to request, launch, terminate, and tag instances on your behalf. For more information, see Spot Fleet prerequisites in the Amazon EC2 User Guide for Linux Instances. Spot Fleet can terminate Spot Instances on your behalf when you cancel its Spot Fleet request using CancelSpotFleetRequests or when the Spot Fleet request expires, if you set TerminateInstancesWithExpiration.
    */
  var IamFleetRole: String
  
  /**
    * The behavior when a Spot Instance is interrupted. The default is terminate.
    */
  var InstanceInterruptionBehavior: js.UndefOr[typings.awsSdk.ec2Mod.InstanceInterruptionBehavior] = js.undefined
  
  /**
    * The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot AllocationStrategy is set to lowest-price. Spot Fleet selects the cheapest Spot pools and evenly allocates your target Spot capacity across the number of Spot pools that you specify.
    */
  var InstancePoolsToUseCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The launch specifications for the Spot Fleet request. If you specify LaunchSpecifications, you can't specify LaunchTemplateConfigs. If you include On-Demand capacity in your request, you must use LaunchTemplateConfigs.
    */
  var LaunchSpecifications: js.UndefOr[LaunchSpecsList] = js.undefined
  
  /**
    * The launch template and overrides. If you specify LaunchTemplateConfigs, you can't specify LaunchSpecifications. If you include On-Demand capacity in your request, you must use LaunchTemplateConfigs.
    */
  var LaunchTemplateConfigs: js.UndefOr[LaunchTemplateConfigList] = js.undefined
  
  /**
    * One or more Classic Load Balancers and target groups to attach to the Spot Fleet request. Spot Fleet registers the running Spot Instances with the specified Classic Load Balancers and target groups. With Network Load Balancers, Spot Fleet cannot register instances that have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
    */
  var LoadBalancersConfig: js.UndefOr[typings.awsSdk.ec2Mod.LoadBalancersConfig] = js.undefined
  
  /**
    * The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify lowestPrice, Spot Fleet uses price to determine the order, launching the lowest price first. If you specify prioritized, Spot Fleet uses the priority that you assign to each Spot Fleet launch template override, launching the highest priority first. If you do not specify a value, Spot Fleet defaults to lowestPrice.
    */
  var OnDemandAllocationStrategy: js.UndefOr[typings.awsSdk.ec2Mod.OnDemandAllocationStrategy] = js.undefined
  
  /**
    * The number of On-Demand units fulfilled by this request compared to the set target On-Demand capacity.
    */
  var OnDemandFulfilledCapacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum amount per hour for On-Demand Instances that you're willing to pay. You can use the onDemandMaxTotalPrice parameter, the spotMaxTotalPrice parameter, or both parameters to ensure that your fleet cost does not exceed your budget. If you set a maximum price per hour for the On-Demand Instances and Spot Instances in your request, Spot Fleet will launch instances until it reaches the maximum amount you're willing to pay. When the maximum amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity.
    */
  var OnDemandMaxTotalPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The number of On-Demand units to request. You can choose to set the target capacity in terms of instances or a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is maintain, you can specify a target capacity of 0 and add capacity later.
    */
  var OnDemandTargetCapacity: js.UndefOr[Integer] = js.undefined
  
  /**
    * Indicates whether Spot Fleet should replace unhealthy instances.
    */
  var ReplaceUnhealthyInstances: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The strategies for managing your Spot Instances that are at an elevated risk of being interrupted.
    */
  var SpotMaintenanceStrategies: js.UndefOr[typings.awsSdk.ec2Mod.SpotMaintenanceStrategies] = js.undefined
  
  /**
    * The maximum amount per hour for Spot Instances that you're willing to pay. You can use the spotdMaxTotalPrice parameter, the onDemandMaxTotalPrice parameter, or both parameters to ensure that your fleet cost does not exceed your budget. If you set a maximum price per hour for the On-Demand Instances and Spot Instances in your request, Spot Fleet will launch instances until it reaches the maximum amount you're willing to pay. When the maximum amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity.
    */
  var SpotMaxTotalPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum price per unit hour that you are willing to pay for a Spot Instance. The default is the On-Demand price.
    */
  var SpotPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The key-value pair for tagging the Spot Fleet request on creation. The value for ResourceType must be spot-fleet-request, otherwise the Spot Fleet request fails. To tag instances at launch, specify the tags in the launch template (valid only if you use LaunchTemplateConfigs) or in the  SpotFleetTagSpecification  (valid only if you use LaunchSpecifications). For information about tagging after launch, see Tagging Your Resources.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  
  /**
    * The number of units to request for the Spot Fleet. You can choose to set the target capacity in terms of instances or a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is maintain, you can specify a target capacity of 0 and add capacity later.
    */
  var TargetCapacity: Integer
  
  /**
    * Indicates whether running Spot Instances are terminated when the Spot Fleet request expires.
    */
  var TerminateInstancesWithExpiration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of request. Indicates whether the Spot Fleet only requests the target capacity or also attempts to maintain it. When this value is request, the Spot Fleet only places the required requests. It does not attempt to replenish Spot Instances if capacity is diminished, nor does it submit requests in alternative Spot pools if capacity is not available. When this value is maintain, the Spot Fleet maintains the target capacity. The Spot Fleet places the required requests to meet capacity and automatically replenishes any interrupted instances. Default: maintain. instant is listed but is not used by Spot Fleet.
    */
  var Type: js.UndefOr[FleetType] = js.undefined
  
  /**
    * The start date and time of the request, in UTC format (YYYY-MM-DDTHH:MM:SSZ). By default, Amazon EC2 starts fulfilling the request immediately.
    */
  var ValidFrom: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The end date and time of the request, in UTC format (YYYY-MM-DDTHH:MM:SSZ). After the end date and time, no new Spot Instance requests are placed or able to fulfill the request. If no value is specified, the Spot Fleet request remains until you cancel it.
    */
  var ValidUntil: js.UndefOr[DateTime] = js.undefined
}
object SpotFleetRequestConfigData {
  
  @scala.inline
  def apply(IamFleetRole: String, TargetCapacity: Integer): SpotFleetRequestConfigData = {
    val __obj = js.Dynamic.literal(IamFleetRole = IamFleetRole.asInstanceOf[js.Any], TargetCapacity = TargetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestConfigData]
  }
  
  @scala.inline
  implicit class SpotFleetRequestConfigDataMutableBuilder[Self <: SpotFleetRequestConfigData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocationStrategy(value: AllocationStrategy): Self = StObject.set(x, "AllocationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocationStrategyUndefined: Self = StObject.set(x, "AllocationStrategy", js.undefined)
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setExcessCapacityTerminationPolicy(value: ExcessCapacityTerminationPolicy): Self = StObject.set(x, "ExcessCapacityTerminationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcessCapacityTerminationPolicyUndefined: Self = StObject.set(x, "ExcessCapacityTerminationPolicy", js.undefined)
    
    @scala.inline
    def setFulfilledCapacity(value: Double): Self = StObject.set(x, "FulfilledCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfilledCapacityUndefined: Self = StObject.set(x, "FulfilledCapacity", js.undefined)
    
    @scala.inline
    def setIamFleetRole(value: String): Self = StObject.set(x, "IamFleetRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceInterruptionBehavior(value: InstanceInterruptionBehavior): Self = StObject.set(x, "InstanceInterruptionBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceInterruptionBehaviorUndefined: Self = StObject.set(x, "InstanceInterruptionBehavior", js.undefined)
    
    @scala.inline
    def setInstancePoolsToUseCount(value: Integer): Self = StObject.set(x, "InstancePoolsToUseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancePoolsToUseCountUndefined: Self = StObject.set(x, "InstancePoolsToUseCount", js.undefined)
    
    @scala.inline
    def setLaunchSpecifications(value: LaunchSpecsList): Self = StObject.set(x, "LaunchSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchSpecificationsUndefined: Self = StObject.set(x, "LaunchSpecifications", js.undefined)
    
    @scala.inline
    def setLaunchSpecificationsVarargs(value: SpotFleetLaunchSpecification*): Self = StObject.set(x, "LaunchSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setLaunchTemplateConfigs(value: LaunchTemplateConfigList): Self = StObject.set(x, "LaunchTemplateConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateConfigsUndefined: Self = StObject.set(x, "LaunchTemplateConfigs", js.undefined)
    
    @scala.inline
    def setLaunchTemplateConfigsVarargs(value: LaunchTemplateConfig*): Self = StObject.set(x, "LaunchTemplateConfigs", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancersConfig(value: LoadBalancersConfig): Self = StObject.set(x, "LoadBalancersConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancersConfigUndefined: Self = StObject.set(x, "LoadBalancersConfig", js.undefined)
    
    @scala.inline
    def setOnDemandAllocationStrategy(value: OnDemandAllocationStrategy): Self = StObject.set(x, "OnDemandAllocationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandAllocationStrategyUndefined: Self = StObject.set(x, "OnDemandAllocationStrategy", js.undefined)
    
    @scala.inline
    def setOnDemandFulfilledCapacity(value: Double): Self = StObject.set(x, "OnDemandFulfilledCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandFulfilledCapacityUndefined: Self = StObject.set(x, "OnDemandFulfilledCapacity", js.undefined)
    
    @scala.inline
    def setOnDemandMaxTotalPrice(value: String): Self = StObject.set(x, "OnDemandMaxTotalPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandMaxTotalPriceUndefined: Self = StObject.set(x, "OnDemandMaxTotalPrice", js.undefined)
    
    @scala.inline
    def setOnDemandTargetCapacity(value: Integer): Self = StObject.set(x, "OnDemandTargetCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandTargetCapacityUndefined: Self = StObject.set(x, "OnDemandTargetCapacity", js.undefined)
    
    @scala.inline
    def setReplaceUnhealthyInstances(value: Boolean): Self = StObject.set(x, "ReplaceUnhealthyInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUnhealthyInstancesUndefined: Self = StObject.set(x, "ReplaceUnhealthyInstances", js.undefined)
    
    @scala.inline
    def setSpotMaintenanceStrategies(value: SpotMaintenanceStrategies): Self = StObject.set(x, "SpotMaintenanceStrategies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotMaintenanceStrategiesUndefined: Self = StObject.set(x, "SpotMaintenanceStrategies", js.undefined)
    
    @scala.inline
    def setSpotMaxTotalPrice(value: String): Self = StObject.set(x, "SpotMaxTotalPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotMaxTotalPriceUndefined: Self = StObject.set(x, "SpotMaxTotalPrice", js.undefined)
    
    @scala.inline
    def setSpotPrice(value: String): Self = StObject.set(x, "SpotPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotPriceUndefined: Self = StObject.set(x, "SpotPrice", js.undefined)
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTargetCapacity(value: Integer): Self = StObject.set(x, "TargetCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminateInstancesWithExpiration(value: Boolean): Self = StObject.set(x, "TerminateInstancesWithExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminateInstancesWithExpirationUndefined: Self = StObject.set(x, "TerminateInstancesWithExpiration", js.undefined)
    
    @scala.inline
    def setType(value: FleetType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setValidFrom(value: DateTime): Self = StObject.set(x, "ValidFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidFromUndefined: Self = StObject.set(x, "ValidFrom", js.undefined)
    
    @scala.inline
    def setValidUntil(value: DateTime): Self = StObject.set(x, "ValidUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUntilUndefined: Self = StObject.set(x, "ValidUntil", js.undefined)
  }
}
