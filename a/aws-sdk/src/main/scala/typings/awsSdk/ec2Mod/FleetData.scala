package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var FleetId: js.UndefOr[FleetIdentifier] = js.native
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
  def apply(
    ActivityStatus: FleetActivityStatus = null,
    ClientToken: String = null,
    CreateTime: DateTime = null,
    Errors: DescribeFleetsErrorSet = null,
    ExcessCapacityTerminationPolicy: FleetExcessCapacityTerminationPolicy = null,
    FleetId: FleetIdentifier = null,
    FleetState: FleetStateCode = null,
    FulfilledCapacity: Int | scala.Double = null,
    FulfilledOnDemandCapacity: Int | scala.Double = null,
    Instances: DescribeFleetsInstancesSet = null,
    LaunchTemplateConfigs: FleetLaunchTemplateConfigList = null,
    OnDemandOptions: OnDemandOptions = null,
    ReplaceUnhealthyInstances: js.UndefOr[scala.Boolean] = js.undefined,
    SpotOptions: SpotOptions = null,
    Tags: TagList = null,
    TargetCapacitySpecification: TargetCapacitySpecification = null,
    TerminateInstancesWithExpiration: js.UndefOr[scala.Boolean] = js.undefined,
    Type: FleetType = null,
    ValidFrom: DateTime = null,
    ValidUntil: DateTime = null
  ): FleetData = {
    val __obj = js.Dynamic.literal()
    if (ActivityStatus != null) __obj.updateDynamic("ActivityStatus")(ActivityStatus.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (CreateTime != null) __obj.updateDynamic("CreateTime")(CreateTime.asInstanceOf[js.Any])
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    if (ExcessCapacityTerminationPolicy != null) __obj.updateDynamic("ExcessCapacityTerminationPolicy")(ExcessCapacityTerminationPolicy.asInstanceOf[js.Any])
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId.asInstanceOf[js.Any])
    if (FleetState != null) __obj.updateDynamic("FleetState")(FleetState.asInstanceOf[js.Any])
    if (FulfilledCapacity != null) __obj.updateDynamic("FulfilledCapacity")(FulfilledCapacity.asInstanceOf[js.Any])
    if (FulfilledOnDemandCapacity != null) __obj.updateDynamic("FulfilledOnDemandCapacity")(FulfilledOnDemandCapacity.asInstanceOf[js.Any])
    if (Instances != null) __obj.updateDynamic("Instances")(Instances.asInstanceOf[js.Any])
    if (LaunchTemplateConfigs != null) __obj.updateDynamic("LaunchTemplateConfigs")(LaunchTemplateConfigs.asInstanceOf[js.Any])
    if (OnDemandOptions != null) __obj.updateDynamic("OnDemandOptions")(OnDemandOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(ReplaceUnhealthyInstances)) __obj.updateDynamic("ReplaceUnhealthyInstances")(ReplaceUnhealthyInstances.asInstanceOf[js.Any])
    if (SpotOptions != null) __obj.updateDynamic("SpotOptions")(SpotOptions.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TargetCapacitySpecification != null) __obj.updateDynamic("TargetCapacitySpecification")(TargetCapacitySpecification.asInstanceOf[js.Any])
    if (!js.isUndefined(TerminateInstancesWithExpiration)) __obj.updateDynamic("TerminateInstancesWithExpiration")(TerminateInstancesWithExpiration.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (ValidFrom != null) __obj.updateDynamic("ValidFrom")(ValidFrom.asInstanceOf[js.Any])
    if (ValidUntil != null) __obj.updateDynamic("ValidUntil")(ValidUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetData]
  }
}

