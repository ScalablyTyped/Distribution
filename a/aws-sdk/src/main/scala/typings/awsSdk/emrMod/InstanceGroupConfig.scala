package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupConfig extends js.Object {
  /**
    * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric. See PutAutoScalingPolicy.
    */
  var AutoScalingPolicy: js.UndefOr[typings.awsSdk.emrMod.AutoScalingPolicy] = js.native
  /**
    * The bid price for each EC2 Spot instance type as defined by InstanceType. Expressed in USD. If neither BidPrice nor BidPriceAsPercentageOfOnDemandPrice is provided, BidPriceAsPercentageOfOnDemandPrice defaults to 100%.
    */
  var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    *  Amazon EMR releases 4.x or later.  The list of configurations supplied for an EMR cluster instance group. You can specify a separate configuration for each instance group (master, core, and task).
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.native
  /**
    * EBS configurations that will be attached to each EC2 instance in the instance group.
    */
  var EbsConfiguration: js.UndefOr[typings.awsSdk.emrMod.EbsConfiguration] = js.native
  /**
    * Target number of instances for the instance group.
    */
  var InstanceCount: Integer = js.native
  /**
    * The role of the instance group in the cluster.
    */
  var InstanceRole: InstanceRoleType = js.native
  /**
    * The EC2 instance type for all instances in the instance group.
    */
  var InstanceType: typings.awsSdk.emrMod.InstanceType = js.native
  /**
    * Market type of the EC2 instances used to create a cluster node.
    */
  var Market: js.UndefOr[MarketType] = js.native
  /**
    * Friendly name given to the instance group.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.native
}

object InstanceGroupConfig {
  @scala.inline
  def apply(
    InstanceCount: Integer,
    InstanceRole: InstanceRoleType,
    InstanceType: InstanceType,
    AutoScalingPolicy: AutoScalingPolicy = null,
    BidPrice: XmlStringMaxLen256 = null,
    Configurations: ConfigurationList = null,
    EbsConfiguration: EbsConfiguration = null,
    Market: MarketType = null,
    Name: XmlStringMaxLen256 = null
  ): InstanceGroupConfig = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], InstanceRole = InstanceRole.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any])
    if (AutoScalingPolicy != null) __obj.updateDynamic("AutoScalingPolicy")(AutoScalingPolicy.asInstanceOf[js.Any])
    if (BidPrice != null) __obj.updateDynamic("BidPrice")(BidPrice.asInstanceOf[js.Any])
    if (Configurations != null) __obj.updateDynamic("Configurations")(Configurations.asInstanceOf[js.Any])
    if (EbsConfiguration != null) __obj.updateDynamic("EbsConfiguration")(EbsConfiguration.asInstanceOf[js.Any])
    if (Market != null) __obj.updateDynamic("Market")(Market.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupConfig]
  }
}

