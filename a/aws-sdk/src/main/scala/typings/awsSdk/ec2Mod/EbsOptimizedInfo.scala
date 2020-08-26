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
  def apply(): EbsOptimizedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsOptimizedInfo]
  }
  @scala.inline
  implicit class EbsOptimizedInfoOps[Self <: EbsOptimizedInfo] (val x: Self) extends AnyVal {
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
    def setBaselineBandwidthInMbps(value: BaselineBandwidthInMbps): Self = this.set("BaselineBandwidthInMbps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaselineBandwidthInMbps: Self = this.set("BaselineBandwidthInMbps", js.undefined)
    @scala.inline
    def setBaselineIops(value: BaselineIops): Self = this.set("BaselineIops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaselineIops: Self = this.set("BaselineIops", js.undefined)
    @scala.inline
    def setBaselineThroughputInMBps(value: BaselineThroughputInMBps): Self = this.set("BaselineThroughputInMBps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaselineThroughputInMBps: Self = this.set("BaselineThroughputInMBps", js.undefined)
    @scala.inline
    def setMaximumBandwidthInMbps(value: MaximumBandwidthInMbps): Self = this.set("MaximumBandwidthInMbps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumBandwidthInMbps: Self = this.set("MaximumBandwidthInMbps", js.undefined)
    @scala.inline
    def setMaximumIops(value: MaximumIops): Self = this.set("MaximumIops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumIops: Self = this.set("MaximumIops", js.undefined)
    @scala.inline
    def setMaximumThroughputInMBps(value: MaximumThroughputInMBps): Self = this.set("MaximumThroughputInMBps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumThroughputInMBps: Self = this.set("MaximumThroughputInMBps", js.undefined)
  }
  
}

