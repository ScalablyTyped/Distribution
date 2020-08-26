package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFleetRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2 Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[FleetExcessCapacityTerminationPolicy] = js.native
  /**
    * The configuration for the EC2 Fleet.
    */
  var LaunchTemplateConfigs: FleetLaunchTemplateConfigListRequest = js.native
  /**
    * Describes the configuration of On-Demand Instances in an EC2 Fleet.
    */
  var OnDemandOptions: js.UndefOr[OnDemandOptionsRequest] = js.native
  /**
    * Indicates whether EC2 Fleet should replace unhealthy instances.
    */
  var ReplaceUnhealthyInstances: js.UndefOr[Boolean] = js.native
  /**
    * Describes the configuration of Spot Instances in an EC2 Fleet.
    */
  var SpotOptions: js.UndefOr[SpotOptionsRequest] = js.native
  /**
    * The key-value pair for tagging the EC2 Fleet request on creation. The value for ResourceType must be fleet, otherwise the fleet request fails. To tag instances at launch, specify the tags in the launch template. For information about tagging after launch, see Tagging Your Resources. 
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  /**
    * The number of units to request.
    */
  var TargetCapacitySpecification: TargetCapacitySpecificationRequest = js.native
  /**
    * Indicates whether running instances should be terminated when the EC2 Fleet expires.
    */
  var TerminateInstancesWithExpiration: js.UndefOr[Boolean] = js.native
  /**
    * The type of the request. By default, the EC2 Fleet places an asynchronous request for your desired capacity, and maintains it by replenishing interrupted Spot Instances (maintain). A value of instant places a synchronous one-time request, and returns errors for any instances that could not be launched. A value of request places an asynchronous one-time request without maintaining capacity or submitting requests in alternative capacity pools if capacity is unavailable. For more information, see EC2 Fleet Request Types in the Amazon Elastic Compute Cloud User Guide.
    */
  var Type: js.UndefOr[FleetType] = js.native
  /**
    * The start date and time of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
    */
  var ValidFrom: js.UndefOr[DateTime] = js.native
  /**
    * The end date and time of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new EC2 Fleet requests are placed or able to fulfill the request. If no value is specified, the request remains until you cancel it.
    */
  var ValidUntil: js.UndefOr[DateTime] = js.native
}

object CreateFleetRequest {
  @scala.inline
  def apply(
    LaunchTemplateConfigs: FleetLaunchTemplateConfigListRequest,
    TargetCapacitySpecification: TargetCapacitySpecificationRequest
  ): CreateFleetRequest = {
    val __obj = js.Dynamic.literal(LaunchTemplateConfigs = LaunchTemplateConfigs.asInstanceOf[js.Any], TargetCapacitySpecification = TargetCapacitySpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFleetRequest]
  }
  @scala.inline
  implicit class CreateFleetRequestOps[Self <: CreateFleetRequest] (val x: Self) extends AnyVal {
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
    def setLaunchTemplateConfigsVarargs(value: FleetLaunchTemplateConfigRequest*): Self = this.set("LaunchTemplateConfigs", js.Array(value :_*))
    @scala.inline
    def setLaunchTemplateConfigs(value: FleetLaunchTemplateConfigListRequest): Self = this.set("LaunchTemplateConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetCapacitySpecification(value: TargetCapacitySpecificationRequest): Self = this.set("TargetCapacitySpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setExcessCapacityTerminationPolicy(value: FleetExcessCapacityTerminationPolicy): Self = this.set("ExcessCapacityTerminationPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcessCapacityTerminationPolicy: Self = this.set("ExcessCapacityTerminationPolicy", js.undefined)
    @scala.inline
    def setOnDemandOptions(value: OnDemandOptionsRequest): Self = this.set("OnDemandOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDemandOptions: Self = this.set("OnDemandOptions", js.undefined)
    @scala.inline
    def setReplaceUnhealthyInstances(value: Boolean): Self = this.set("ReplaceUnhealthyInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceUnhealthyInstances: Self = this.set("ReplaceUnhealthyInstances", js.undefined)
    @scala.inline
    def setSpotOptions(value: SpotOptionsRequest): Self = this.set("SpotOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotOptions: Self = this.set("SpotOptions", js.undefined)
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

