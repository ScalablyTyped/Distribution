package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EbsOptimizedInfo extends js.Object {
  /**
    * The baseline bandwidth performance for an EBS-optimized instance type, in Mbps.
    */
  var BaselineBandwidthInMbps: js.UndefOr[typings.awsSdk.ec2Mod.BaselineBandwidthInMbps] = js.native
  /**
    * The baseline input/output storage operations per seconds for an EBS-optimized instance type.
    */
  var BaselineIops: js.UndefOr[typings.awsSdk.ec2Mod.BaselineIops] = js.native
  /**
    * The baseline throughput performance for an EBS-optimized instance type, in MBps.
    */
  var BaselineThroughputInMBps: js.UndefOr[typings.awsSdk.ec2Mod.BaselineThroughputInMBps] = js.native
  /**
    * The maximum bandwidth performance for an EBS-optimized instance type, in Mbps.
    */
  var MaximumBandwidthInMbps: js.UndefOr[typings.awsSdk.ec2Mod.MaximumBandwidthInMbps] = js.native
  /**
    * The maximum input/output storage operations per second for an EBS-optimized instance type.
    */
  var MaximumIops: js.UndefOr[typings.awsSdk.ec2Mod.MaximumIops] = js.native
  /**
    * The maximum throughput performance for an EBS-optimized instance type, in MBps.
    */
  var MaximumThroughputInMBps: js.UndefOr[typings.awsSdk.ec2Mod.MaximumThroughputInMBps] = js.native
}

object EbsOptimizedInfo {
  @scala.inline
  def apply(
    BaselineBandwidthInMbps: js.UndefOr[BaselineBandwidthInMbps] = js.undefined,
    BaselineIops: js.UndefOr[BaselineIops] = js.undefined,
    BaselineThroughputInMBps: js.UndefOr[BaselineThroughputInMBps] = js.undefined,
    MaximumBandwidthInMbps: js.UndefOr[MaximumBandwidthInMbps] = js.undefined,
    MaximumIops: js.UndefOr[MaximumIops] = js.undefined,
    MaximumThroughputInMBps: js.UndefOr[MaximumThroughputInMBps] = js.undefined
  ): EbsOptimizedInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BaselineBandwidthInMbps)) __obj.updateDynamic("BaselineBandwidthInMbps")(BaselineBandwidthInMbps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(BaselineIops)) __obj.updateDynamic("BaselineIops")(BaselineIops.get.asInstanceOf[js.Any])
    if (!js.isUndefined(BaselineThroughputInMBps)) __obj.updateDynamic("BaselineThroughputInMBps")(BaselineThroughputInMBps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaximumBandwidthInMbps)) __obj.updateDynamic("MaximumBandwidthInMbps")(MaximumBandwidthInMbps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaximumIops)) __obj.updateDynamic("MaximumIops")(MaximumIops.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaximumThroughputInMBps)) __obj.updateDynamic("MaximumThroughputInMBps")(MaximumThroughputInMBps.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EbsOptimizedInfo]
  }
}

