package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroup extends js.Object {
  /**
    * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric. See PutAutoScalingPolicy.
    */
  var AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription] = js.native
  /**
    * The bid price for each EC2 Spot instance type as defined by InstanceType. Expressed in USD. If neither BidPrice nor BidPriceAsPercentageOfOnDemandPrice is provided, BidPriceAsPercentageOfOnDemandPrice defaults to 100%.
    */
  var BidPrice: js.UndefOr[String] = js.native
  /**
    *  Amazon EMR releases 4.x or later.  The list of configurations supplied for an EMR cluster instance group. You can specify a separate configuration for each instance group (master, core, and task).
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.native
  /**
    * The version number of the requested configuration specification for this instance group.
    */
  var ConfigurationsVersion: js.UndefOr[Long] = js.native
  /**
    * The EBS block devices that are mapped to this instance group.
    */
  var EbsBlockDevices: js.UndefOr[EbsBlockDeviceList] = js.native
  /**
    * If the instance group is EBS-optimized. An Amazon EBS-optimized instance uses an optimized configuration stack and provides additional, dedicated capacity for Amazon EBS I/O.
    */
  var EbsOptimized: js.UndefOr[BooleanObject] = js.native
  /**
    * The identifier of the instance group.
    */
  var Id: js.UndefOr[InstanceGroupId] = js.native
  /**
    * The type of the instance group. Valid values are MASTER, CORE or TASK.
    */
  var InstanceGroupType: js.UndefOr[typings.awsSdk.emrMod.InstanceGroupType] = js.native
  /**
    * The EC2 instance type for all instances in the instance group.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.emrMod.InstanceType] = js.native
  /**
    * A list of configurations that were successfully applied for an instance group last time.
    */
  var LastSuccessfullyAppliedConfigurations: js.UndefOr[ConfigurationList] = js.native
  /**
    * The version number of a configuration specification that was successfully applied for an instance group last time. 
    */
  var LastSuccessfullyAppliedConfigurationsVersion: js.UndefOr[Long] = js.native
  /**
    * The marketplace to provision instances for this group. Valid values are ON_DEMAND or SPOT.
    */
  var Market: js.UndefOr[MarketType] = js.native
  /**
    * The name of the instance group.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The target number of instances for the instance group.
    */
  var RequestedInstanceCount: js.UndefOr[Integer] = js.native
  /**
    * The number of instances currently running in this instance group.
    */
  var RunningInstanceCount: js.UndefOr[Integer] = js.native
  /**
    * Policy for customizing shrink operations.
    */
  var ShrinkPolicy: js.UndefOr[typings.awsSdk.emrMod.ShrinkPolicy] = js.native
  /**
    * The current status of the instance group.
    */
  var Status: js.UndefOr[InstanceGroupStatus] = js.native
}

object InstanceGroup {
  @scala.inline
  def apply(
    AutoScalingPolicy: AutoScalingPolicyDescription = null,
    BidPrice: String = null,
    Configurations: ConfigurationList = null,
    ConfigurationsVersion: js.UndefOr[Long] = js.undefined,
    EbsBlockDevices: EbsBlockDeviceList = null,
    EbsOptimized: js.UndefOr[BooleanObject] = js.undefined,
    Id: InstanceGroupId = null,
    InstanceGroupType: InstanceGroupType = null,
    InstanceType: InstanceType = null,
    LastSuccessfullyAppliedConfigurations: ConfigurationList = null,
    LastSuccessfullyAppliedConfigurationsVersion: js.UndefOr[Long] = js.undefined,
    Market: MarketType = null,
    Name: String = null,
    RequestedInstanceCount: js.UndefOr[Integer] = js.undefined,
    RunningInstanceCount: js.UndefOr[Integer] = js.undefined,
    ShrinkPolicy: ShrinkPolicy = null,
    Status: InstanceGroupStatus = null
  ): InstanceGroup = {
    val __obj = js.Dynamic.literal()
    if (AutoScalingPolicy != null) __obj.updateDynamic("AutoScalingPolicy")(AutoScalingPolicy.asInstanceOf[js.Any])
    if (BidPrice != null) __obj.updateDynamic("BidPrice")(BidPrice.asInstanceOf[js.Any])
    if (Configurations != null) __obj.updateDynamic("Configurations")(Configurations.asInstanceOf[js.Any])
    if (!js.isUndefined(ConfigurationsVersion)) __obj.updateDynamic("ConfigurationsVersion")(ConfigurationsVersion.get.asInstanceOf[js.Any])
    if (EbsBlockDevices != null) __obj.updateDynamic("EbsBlockDevices")(EbsBlockDevices.asInstanceOf[js.Any])
    if (!js.isUndefined(EbsOptimized)) __obj.updateDynamic("EbsOptimized")(EbsOptimized.get.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (InstanceGroupType != null) __obj.updateDynamic("InstanceGroupType")(InstanceGroupType.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (LastSuccessfullyAppliedConfigurations != null) __obj.updateDynamic("LastSuccessfullyAppliedConfigurations")(LastSuccessfullyAppliedConfigurations.asInstanceOf[js.Any])
    if (!js.isUndefined(LastSuccessfullyAppliedConfigurationsVersion)) __obj.updateDynamic("LastSuccessfullyAppliedConfigurationsVersion")(LastSuccessfullyAppliedConfigurationsVersion.get.asInstanceOf[js.Any])
    if (Market != null) __obj.updateDynamic("Market")(Market.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (!js.isUndefined(RequestedInstanceCount)) __obj.updateDynamic("RequestedInstanceCount")(RequestedInstanceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RunningInstanceCount)) __obj.updateDynamic("RunningInstanceCount")(RunningInstanceCount.get.asInstanceOf[js.Any])
    if (ShrinkPolicy != null) __obj.updateDynamic("ShrinkPolicy")(ShrinkPolicy.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroup]
  }
}

