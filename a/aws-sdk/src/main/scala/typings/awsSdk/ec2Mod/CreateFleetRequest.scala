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
    TargetCapacitySpecification: TargetCapacitySpecificationRequest,
    ClientToken: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    ExcessCapacityTerminationPolicy: FleetExcessCapacityTerminationPolicy = null,
    OnDemandOptions: OnDemandOptionsRequest = null,
    ReplaceUnhealthyInstances: js.UndefOr[Boolean] = js.undefined,
    SpotOptions: SpotOptionsRequest = null,
    TagSpecifications: TagSpecificationList = null,
    TerminateInstancesWithExpiration: js.UndefOr[Boolean] = js.undefined,
    Type: FleetType = null,
    ValidFrom: DateTime = null,
    ValidUntil: DateTime = null
  ): CreateFleetRequest = {
    val __obj = js.Dynamic.literal(LaunchTemplateConfigs = LaunchTemplateConfigs.asInstanceOf[js.Any], TargetCapacitySpecification = TargetCapacitySpecification.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (ExcessCapacityTerminationPolicy != null) __obj.updateDynamic("ExcessCapacityTerminationPolicy")(ExcessCapacityTerminationPolicy.asInstanceOf[js.Any])
    if (OnDemandOptions != null) __obj.updateDynamic("OnDemandOptions")(OnDemandOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(ReplaceUnhealthyInstances)) __obj.updateDynamic("ReplaceUnhealthyInstances")(ReplaceUnhealthyInstances.get.asInstanceOf[js.Any])
    if (SpotOptions != null) __obj.updateDynamic("SpotOptions")(SpotOptions.asInstanceOf[js.Any])
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications.asInstanceOf[js.Any])
    if (!js.isUndefined(TerminateInstancesWithExpiration)) __obj.updateDynamic("TerminateInstancesWithExpiration")(TerminateInstancesWithExpiration.get.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (ValidFrom != null) __obj.updateDynamic("ValidFrom")(ValidFrom.asInstanceOf[js.Any])
    if (ValidUntil != null) __obj.updateDynamic("ValidUntil")(ValidUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFleetRequest]
  }
}

