package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FleetData extends StObject {
  
  /**
    * The progress of the EC2 Fleet. If there is an error, the status is error. After all requests are placed, the status is pending_fulfillment. If the size of the EC2 Fleet is equal to or greater than its target capacity, the status is fulfilled. If the size of the EC2 Fleet is decreased, the status is pending_termination while instances are terminating.
    */
  var ActivityStatus: js.UndefOr[FleetActivityStatus] = js.native
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency. Constraints: Maximum 64 ASCII characters
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * The creation date and time of the EC2 Fleet.
    */
  var CreateTime: js.UndefOr[DateTime] = js.native
  
  /**
    * Information about the instances that could not be launched by the fleet. Valid only when Type is set to instant.
    */
  var Errors: js.UndefOr[DescribeFleetsErrorSet] = js.native
  
  /**
    * Indicates whether running instances should be terminated if the target capacity of the EC2 Fleet is decreased below the current size of the EC2 Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[FleetExcessCapacityTerminationPolicy] = js.native
  
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: js.UndefOr[typings.awsSdk.ec2Mod.FleetId] = js.native
  
  /**
    * The state of the EC2 Fleet.
    */
  var FleetState: js.UndefOr[FleetStateCode] = js.native
  
  /**
    * The number of units fulfilled by this request compared to the set target capacity.
    */
  var FulfilledCapacity: js.UndefOr[Double] = js.native
  
  /**
    * The number of units fulfilled by this request compared to the set target On-Demand capacity.
    */
  var FulfilledOnDemandCapacity: js.UndefOr[Double] = js.native
  
  /**
    * Information about the instances that were launched by the fleet. Valid only when Type is set to instant.
    */
  var Instances: js.UndefOr[DescribeFleetsInstancesSet] = js.native
  
  /**
    * The launch template and overrides.
    */
  var LaunchTemplateConfigs: js.UndefOr[FleetLaunchTemplateConfigList] = js.native
  
  /**
    * The allocation strategy of On-Demand Instances in an EC2 Fleet.
    */
  var OnDemandOptions: js.UndefOr[typings.awsSdk.ec2Mod.OnDemandOptions] = js.native
  
  /**
    * Indicates whether EC2 Fleet should replace unhealthy instances.
    */
  var ReplaceUnhealthyInstances: js.UndefOr[Boolean] = js.native
  
  /**
    * The configuration of Spot Instances in an EC2 Fleet.
    */
  var SpotOptions: js.UndefOr[typings.awsSdk.ec2Mod.SpotOptions] = js.native
  
  /**
    * The tags for an EC2 Fleet resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The number of units to request. You can choose to set the target capacity in terms of instances or a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is maintain, you can specify a target capacity of 0 and add capacity later.
    */
  var TargetCapacitySpecification: js.UndefOr[typings.awsSdk.ec2Mod.TargetCapacitySpecification] = js.native
  
  /**
    * Indicates whether running instances should be terminated when the EC2 Fleet expires. 
    */
  var TerminateInstancesWithExpiration: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. If you request a certain target capacity, EC2 Fleet only places the required requests; it does not attempt to replenish instances if capacity is diminished, and it does not submit requests in alternative capacity pools if capacity is unavailable. To maintain a certain target capacity, EC2 Fleet places the required requests to meet this target capacity. It also automatically replenishes any interrupted Spot Instances. Default: maintain.
    */
  var Type: js.UndefOr[FleetType] = js.native
  
  /**
    * The start date and time of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately. 
    */
  var ValidFrom: js.UndefOr[DateTime] = js.native
  
  /**
    * The end date and time of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new instance requests are placed or able to fulfill the request. The default end date is 7 days from the current date. 
    */
  var ValidUntil: js.UndefOr[DateTime] = js.native
}
object FleetData {
  
  @scala.inline
  def apply(): FleetData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetData]
  }
  
  @scala.inline
  implicit class FleetDataMutableBuilder[Self <: FleetData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityStatus(value: FleetActivityStatus): Self = StObject.set(x, "ActivityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityStatusUndefined: Self = StObject.set(x, "ActivityStatus", js.undefined)
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setCreateTime(value: DateTime): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    @scala.inline
    def setErrors(value: DescribeFleetsErrorSet): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: DescribeFleetError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
    
    @scala.inline
    def setExcessCapacityTerminationPolicy(value: FleetExcessCapacityTerminationPolicy): Self = StObject.set(x, "ExcessCapacityTerminationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcessCapacityTerminationPolicyUndefined: Self = StObject.set(x, "ExcessCapacityTerminationPolicy", js.undefined)
    
    @scala.inline
    def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
    @scala.inline
    def setFleetState(value: FleetStateCode): Self = StObject.set(x, "FleetState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetStateUndefined: Self = StObject.set(x, "FleetState", js.undefined)
    
    @scala.inline
    def setFulfilledCapacity(value: Double): Self = StObject.set(x, "FulfilledCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfilledCapacityUndefined: Self = StObject.set(x, "FulfilledCapacity", js.undefined)
    
    @scala.inline
    def setFulfilledOnDemandCapacity(value: Double): Self = StObject.set(x, "FulfilledOnDemandCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfilledOnDemandCapacityUndefined: Self = StObject.set(x, "FulfilledOnDemandCapacity", js.undefined)
    
    @scala.inline
    def setInstances(value: DescribeFleetsInstancesSet): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: DescribeFleetsInstances*): Self = StObject.set(x, "Instances", js.Array(value :_*))
    
    @scala.inline
    def setLaunchTemplateConfigs(value: FleetLaunchTemplateConfigList): Self = StObject.set(x, "LaunchTemplateConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateConfigsUndefined: Self = StObject.set(x, "LaunchTemplateConfigs", js.undefined)
    
    @scala.inline
    def setLaunchTemplateConfigsVarargs(value: FleetLaunchTemplateConfig*): Self = StObject.set(x, "LaunchTemplateConfigs", js.Array(value :_*))
    
    @scala.inline
    def setOnDemandOptions(value: OnDemandOptions): Self = StObject.set(x, "OnDemandOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandOptionsUndefined: Self = StObject.set(x, "OnDemandOptions", js.undefined)
    
    @scala.inline
    def setReplaceUnhealthyInstances(value: Boolean): Self = StObject.set(x, "ReplaceUnhealthyInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUnhealthyInstancesUndefined: Self = StObject.set(x, "ReplaceUnhealthyInstances", js.undefined)
    
    @scala.inline
    def setSpotOptions(value: SpotOptions): Self = StObject.set(x, "SpotOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotOptionsUndefined: Self = StObject.set(x, "SpotOptions", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTargetCapacitySpecification(value: TargetCapacitySpecification): Self = StObject.set(x, "TargetCapacitySpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCapacitySpecificationUndefined: Self = StObject.set(x, "TargetCapacitySpecification", js.undefined)
    
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
