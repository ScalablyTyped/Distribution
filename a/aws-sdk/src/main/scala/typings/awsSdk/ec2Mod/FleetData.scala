package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetData extends StObject {
  
  /**
    * The progress of the EC2 Fleet. If there is an error, the status is error. After all requests are placed, the status is pending_fulfillment. If the size of the EC2 Fleet is equal to or greater than its target capacity, the status is fulfilled. If the size of the EC2 Fleet is decreased, the status is pending_termination while instances are terminating.
    */
  var ActivityStatus: js.UndefOr[FleetActivityStatus] = js.undefined
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see Ensuring idempotency. Constraints: Maximum 64 ASCII characters
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved.
    */
  var Context: js.UndefOr[String] = js.undefined
  
  /**
    * The creation date and time of the EC2 Fleet.
    */
  var CreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Information about the instances that could not be launched by the fleet. Valid only when Type is set to instant.
    */
  var Errors: js.UndefOr[DescribeFleetsErrorSet] = js.undefined
  
  /**
    * Indicates whether running instances should be terminated if the target capacity of the EC2 Fleet is decreased below the current size of the EC2 Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[FleetExcessCapacityTerminationPolicy] = js.undefined
  
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: js.UndefOr[typings.awsSdk.ec2Mod.FleetId] = js.undefined
  
  /**
    * The state of the EC2 Fleet.
    */
  var FleetState: js.UndefOr[FleetStateCode] = js.undefined
  
  /**
    * The number of units fulfilled by this request compared to the set target capacity.
    */
  var FulfilledCapacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of units fulfilled by this request compared to the set target On-Demand capacity.
    */
  var FulfilledOnDemandCapacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Information about the instances that were launched by the fleet. Valid only when Type is set to instant.
    */
  var Instances: js.UndefOr[DescribeFleetsInstancesSet] = js.undefined
  
  /**
    * The launch template and overrides.
    */
  var LaunchTemplateConfigs: js.UndefOr[FleetLaunchTemplateConfigList] = js.undefined
  
  /**
    * The allocation strategy of On-Demand Instances in an EC2 Fleet.
    */
  var OnDemandOptions: js.UndefOr[typings.awsSdk.ec2Mod.OnDemandOptions] = js.undefined
  
  /**
    * Indicates whether EC2 Fleet should replace unhealthy Spot Instances. Supported only for fleets of type maintain. For more information, see EC2 Fleet health checks in the Amazon EC2 User Guide.
    */
  var ReplaceUnhealthyInstances: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The configuration of Spot Instances in an EC2 Fleet.
    */
  var SpotOptions: js.UndefOr[typings.awsSdk.ec2Mod.SpotOptions] = js.undefined
  
  /**
    * The tags for an EC2 Fleet resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The number of units to request. You can choose to set the target capacity in terms of instances or a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is maintain, you can specify a target capacity of 0 and add capacity later.
    */
  var TargetCapacitySpecification: js.UndefOr[typings.awsSdk.ec2Mod.TargetCapacitySpecification] = js.undefined
  
  /**
    * Indicates whether running instances should be terminated when the EC2 Fleet expires. 
    */
  var TerminateInstancesWithExpiration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. If you request a certain target capacity, EC2 Fleet only places the required requests; it does not attempt to replenish instances if capacity is diminished, and it does not submit requests in alternative capacity pools if capacity is unavailable. To maintain a certain target capacity, EC2 Fleet places the required requests to meet this target capacity. It also automatically replenishes any interrupted Spot Instances. Default: maintain.
    */
  var Type: js.UndefOr[FleetType] = js.undefined
  
  /**
    * The start date and time of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately. 
    */
  var ValidFrom: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The end date and time of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new instance requests are placed or able to fulfill the request. The default end date is 7 days from the current date. 
    */
  var ValidUntil: js.UndefOr[js.Date] = js.undefined
}
object FleetData {
  
  inline def apply(): FleetData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetData]
  }
  
  extension [Self <: FleetData](x: Self) {
    
    inline def setActivityStatus(value: FleetActivityStatus): Self = StObject.set(x, "ActivityStatus", value.asInstanceOf[js.Any])
    
    inline def setActivityStatusUndefined: Self = StObject.set(x, "ActivityStatus", js.undefined)
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setContext(value: String): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "Context", js.undefined)
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setErrors(value: DescribeFleetsErrorSet): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: DescribeFleetError*): Self = StObject.set(x, "Errors", js.Array(value*))
    
    inline def setExcessCapacityTerminationPolicy(value: FleetExcessCapacityTerminationPolicy): Self = StObject.set(x, "ExcessCapacityTerminationPolicy", value.asInstanceOf[js.Any])
    
    inline def setExcessCapacityTerminationPolicyUndefined: Self = StObject.set(x, "ExcessCapacityTerminationPolicy", js.undefined)
    
    inline def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
    inline def setFleetState(value: FleetStateCode): Self = StObject.set(x, "FleetState", value.asInstanceOf[js.Any])
    
    inline def setFleetStateUndefined: Self = StObject.set(x, "FleetState", js.undefined)
    
    inline def setFulfilledCapacity(value: Double): Self = StObject.set(x, "FulfilledCapacity", value.asInstanceOf[js.Any])
    
    inline def setFulfilledCapacityUndefined: Self = StObject.set(x, "FulfilledCapacity", js.undefined)
    
    inline def setFulfilledOnDemandCapacity(value: Double): Self = StObject.set(x, "FulfilledOnDemandCapacity", value.asInstanceOf[js.Any])
    
    inline def setFulfilledOnDemandCapacityUndefined: Self = StObject.set(x, "FulfilledOnDemandCapacity", js.undefined)
    
    inline def setInstances(value: DescribeFleetsInstancesSet): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    inline def setInstancesVarargs(value: DescribeFleetsInstances*): Self = StObject.set(x, "Instances", js.Array(value*))
    
    inline def setLaunchTemplateConfigs(value: FleetLaunchTemplateConfigList): Self = StObject.set(x, "LaunchTemplateConfigs", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateConfigsUndefined: Self = StObject.set(x, "LaunchTemplateConfigs", js.undefined)
    
    inline def setLaunchTemplateConfigsVarargs(value: FleetLaunchTemplateConfig*): Self = StObject.set(x, "LaunchTemplateConfigs", js.Array(value*))
    
    inline def setOnDemandOptions(value: OnDemandOptions): Self = StObject.set(x, "OnDemandOptions", value.asInstanceOf[js.Any])
    
    inline def setOnDemandOptionsUndefined: Self = StObject.set(x, "OnDemandOptions", js.undefined)
    
    inline def setReplaceUnhealthyInstances(value: Boolean): Self = StObject.set(x, "ReplaceUnhealthyInstances", value.asInstanceOf[js.Any])
    
    inline def setReplaceUnhealthyInstancesUndefined: Self = StObject.set(x, "ReplaceUnhealthyInstances", js.undefined)
    
    inline def setSpotOptions(value: SpotOptions): Self = StObject.set(x, "SpotOptions", value.asInstanceOf[js.Any])
    
    inline def setSpotOptionsUndefined: Self = StObject.set(x, "SpotOptions", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTargetCapacitySpecification(value: TargetCapacitySpecification): Self = StObject.set(x, "TargetCapacitySpecification", value.asInstanceOf[js.Any])
    
    inline def setTargetCapacitySpecificationUndefined: Self = StObject.set(x, "TargetCapacitySpecification", js.undefined)
    
    inline def setTerminateInstancesWithExpiration(value: Boolean): Self = StObject.set(x, "TerminateInstancesWithExpiration", value.asInstanceOf[js.Any])
    
    inline def setTerminateInstancesWithExpirationUndefined: Self = StObject.set(x, "TerminateInstancesWithExpiration", js.undefined)
    
    inline def setType(value: FleetType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValidFrom(value: js.Date): Self = StObject.set(x, "ValidFrom", value.asInstanceOf[js.Any])
    
    inline def setValidFromUndefined: Self = StObject.set(x, "ValidFrom", js.undefined)
    
    inline def setValidUntil(value: js.Date): Self = StObject.set(x, "ValidUntil", value.asInstanceOf[js.Any])
    
    inline def setValidUntilUndefined: Self = StObject.set(x, "ValidUntil", js.undefined)
  }
}
