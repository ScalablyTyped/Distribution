package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNetworkProfileRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the project for which you want to update network profile settings.
    */
  var arn: AmazonResourceName = js.native
  /**
    * The description of the network profile about which you are returning information.
    */
  var description: js.UndefOr[Message] = js.native
  /**
    * The data throughput rate in bits per second, as an integer from 0 to 104857600.
    */
  var downlinkBandwidthBits: js.UndefOr[Long] = js.native
  /**
    * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
    */
  var downlinkDelayMs: js.UndefOr[Long] = js.native
  /**
    * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
    */
  var downlinkJitterMs: js.UndefOr[Long] = js.native
  /**
    * Proportion of received packets that fail to arrive from 0 to 100 percent.
    */
  var downlinkLossPercent: js.UndefOr[PercentInteger] = js.native
  /**
    * The name of the network profile about which you are returning information.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The type of network profile to return information about. Valid values are listed here.
    */
  var `type`: js.UndefOr[NetworkProfileType] = js.native
  /**
    * The data throughput rate in bits per second, as an integer from 0 to 104857600.
    */
  var uplinkBandwidthBits: js.UndefOr[Long] = js.native
  /**
    * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
    */
  var uplinkDelayMs: js.UndefOr[Long] = js.native
  /**
    * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
    */
  var uplinkJitterMs: js.UndefOr[Long] = js.native
  /**
    * Proportion of transmitted packets that fail to arrive from 0 to 100 percent.
    */
  var uplinkLossPercent: js.UndefOr[PercentInteger] = js.native
}

object UpdateNetworkProfileRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): UpdateNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNetworkProfileRequest]
  }
  @scala.inline
  implicit class UpdateNetworkProfileRequestOps[Self <: UpdateNetworkProfileRequest] (val x: Self) extends AnyVal {
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
    def setArn(value: AmazonResourceName): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Message): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDownlinkBandwidthBits(value: Long): Self = this.set("downlinkBandwidthBits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownlinkBandwidthBits: Self = this.set("downlinkBandwidthBits", js.undefined)
    @scala.inline
    def setDownlinkDelayMs(value: Long): Self = this.set("downlinkDelayMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownlinkDelayMs: Self = this.set("downlinkDelayMs", js.undefined)
    @scala.inline
    def setDownlinkJitterMs(value: Long): Self = this.set("downlinkJitterMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownlinkJitterMs: Self = this.set("downlinkJitterMs", js.undefined)
    @scala.inline
    def setDownlinkLossPercent(value: PercentInteger): Self = this.set("downlinkLossPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownlinkLossPercent: Self = this.set("downlinkLossPercent", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setType(value: NetworkProfileType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUplinkBandwidthBits(value: Long): Self = this.set("uplinkBandwidthBits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUplinkBandwidthBits: Self = this.set("uplinkBandwidthBits", js.undefined)
    @scala.inline
    def setUplinkDelayMs(value: Long): Self = this.set("uplinkDelayMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUplinkDelayMs: Self = this.set("uplinkDelayMs", js.undefined)
    @scala.inline
    def setUplinkJitterMs(value: Long): Self = this.set("uplinkJitterMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUplinkJitterMs: Self = this.set("uplinkJitterMs", js.undefined)
    @scala.inline
    def setUplinkLossPercent(value: PercentInteger): Self = this.set("uplinkLossPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUplinkLossPercent: Self = this.set("uplinkLossPercent", js.undefined)
  }
  
}

