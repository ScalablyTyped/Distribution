package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceTypeSpecification extends js.Object {
  /**
    * The bid price for each EC2 Spot instance type as defined by InstanceType. Expressed in USD.
    */
  var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by InstanceType. Expressed as a number (for example, 20 specifies 20%).
    */
  var BidPriceAsPercentageOfOnDemandPrice: js.UndefOr[NonNegativeDouble] = js.native
  /**
    * A configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software bundled with Amazon EMR.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.native
  /**
    * The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined by InstanceType.
    */
  var EbsBlockDevices: js.UndefOr[EbsBlockDeviceList] = js.native
  /**
    * Evaluates to TRUE when the specified InstanceType is EBS-optimized.
    */
  var EbsOptimized: js.UndefOr[BooleanObject] = js.native
  /**
    * The EC2 instance type, for example m3.xlarge.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.emrMod.InstanceType] = js.native
  /**
    * The number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in InstanceFleetConfig. Capacity values represent performance characteristics such as vCPUs, memory, or I/O. If not specified, the default value is 1.
    */
  var WeightedCapacity: js.UndefOr[WholeNumber] = js.native
}

object InstanceTypeSpecification {
  @scala.inline
  def apply(
    BidPrice: XmlStringMaxLen256 = null,
    BidPriceAsPercentageOfOnDemandPrice: js.UndefOr[NonNegativeDouble] = js.undefined,
    Configurations: ConfigurationList = null,
    EbsBlockDevices: EbsBlockDeviceList = null,
    EbsOptimized: js.UndefOr[BooleanObject] = js.undefined,
    InstanceType: InstanceType = null,
    WeightedCapacity: js.UndefOr[WholeNumber] = js.undefined
  ): InstanceTypeSpecification = {
    val __obj = js.Dynamic.literal()
    if (BidPrice != null) __obj.updateDynamic("BidPrice")(BidPrice.asInstanceOf[js.Any])
    if (!js.isUndefined(BidPriceAsPercentageOfOnDemandPrice)) __obj.updateDynamic("BidPriceAsPercentageOfOnDemandPrice")(BidPriceAsPercentageOfOnDemandPrice.get.asInstanceOf[js.Any])
    if (Configurations != null) __obj.updateDynamic("Configurations")(Configurations.asInstanceOf[js.Any])
    if (EbsBlockDevices != null) __obj.updateDynamic("EbsBlockDevices")(EbsBlockDevices.asInstanceOf[js.Any])
    if (!js.isUndefined(EbsOptimized)) __obj.updateDynamic("EbsOptimized")(EbsOptimized.get.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (!js.isUndefined(WeightedCapacity)) __obj.updateDynamic("WeightedCapacity")(WeightedCapacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceTypeSpecification]
  }
}

