package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FleetData extends js.Object {
  
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
  implicit class FleetDataOps[Self <: FleetData] (val x: Self) extends AnyVal {
    
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
    def setActivityStatus(value: FleetActivityStatus): Self = this.set("ActivityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityStatus: Self = this.set("ActivityStatus", js.undefined)
    
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    
    @scala.inline
    def setCreateTime(value: DateTime): Self = this.set("CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("CreateTime", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: DescribeFleetError*): Self = this.set("Errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: DescribeFleetsErrorSet): Self = this.set("Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
    
    @scala.inline
    def setExcessCapacityTerminationPolicy(value: FleetExcessCapacityTerminationPolicy): Self = this.set("ExcessCapacityTerminationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcessCapacityTerminationPolicy: Self = this.set("ExcessCapacityTerminationPolicy", js.undefined)
    
    @scala.inline
    def setFleetId(value: FleetId): Self = this.set("FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetId: Self = this.set("FleetId", js.undefined)
    
    @scala.inline
    def setFleetState(value: FleetStateCode): Self = this.set("FleetState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetState: Self = this.set("FleetState", js.undefined)
    
    @scala.inline
    def setFulfilledCapacity(value: Double): Self = this.set("FulfilledCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFulfilledCapacity: Self = this.set("FulfilledCapacity", js.undefined)
    
    @scala.inline
    def setFulfilledOnDemandCapacity(value: Double): Self = this.set("FulfilledOnDemandCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFulfilledOnDemandCapacity: Self = this.set("FulfilledOnDemandCapacity", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: DescribeFleetsInstances*): Self = this.set("Instances", js.Array(value :_*))
    
    @scala.inline
    def setInstances(value: DescribeFleetsInstancesSet): Self = this.set("Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstances: Self = this.set("Instances", js.undefined)
    
    @scala.inline
    def setLaunchTemplateConfigsVarargs(value: FleetLaunchTemplateConfig*): Self = this.set("LaunchTemplateConfigs", js.Array(value :_*))
    
    @scala.inline
    def setLaunchTemplateConfigs(value: FleetLaunchTemplateConfigList): Self = this.set("LaunchTemplateConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTemplateConfigs: Self = this.set("LaunchTemplateConfigs", js.undefined)
    
    @scala.inline
    def setOnDemandOptions(value: OnDemandOptions): Self = this.set("OnDemandOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDemandOptions: Self = this.set("OnDemandOptions", js.undefined)
    
    @scala.inline
    def setReplaceUnhealthyInstances(value: Boolean): Self = this.set("ReplaceUnhealthyInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceUnhealthyInstances: Self = this.set("ReplaceUnhealthyInstances", js.undefined)
    
    @scala.inline
    def setSpotOptions(value: SpotOptions): Self = this.set("SpotOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotOptions: Self = this.set("SpotOptions", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setTargetCapacitySpecification(value: TargetCapacitySpecification): Self = this.set("TargetCapacitySpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetCapacitySpecification: Self = this.set("TargetCapacitySpecification", js.undefined)
    
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
