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
  def apply(
    arn: AmazonResourceName,
    description: Message = null,
    downlinkBandwidthBits: js.UndefOr[Long] = js.undefined,
    downlinkDelayMs: js.UndefOr[Long] = js.undefined,
    downlinkJitterMs: js.UndefOr[Long] = js.undefined,
    downlinkLossPercent: js.UndefOr[PercentInteger] = js.undefined,
    name: Name = null,
    `type`: NetworkProfileType = null,
    uplinkBandwidthBits: js.UndefOr[Long] = js.undefined,
    uplinkDelayMs: js.UndefOr[Long] = js.undefined,
    uplinkJitterMs: js.UndefOr[Long] = js.undefined,
    uplinkLossPercent: js.UndefOr[PercentInteger] = js.undefined
  ): UpdateNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(downlinkBandwidthBits)) __obj.updateDynamic("downlinkBandwidthBits")(downlinkBandwidthBits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(downlinkDelayMs)) __obj.updateDynamic("downlinkDelayMs")(downlinkDelayMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(downlinkJitterMs)) __obj.updateDynamic("downlinkJitterMs")(downlinkJitterMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(downlinkLossPercent)) __obj.updateDynamic("downlinkLossPercent")(downlinkLossPercent.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uplinkBandwidthBits)) __obj.updateDynamic("uplinkBandwidthBits")(uplinkBandwidthBits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uplinkDelayMs)) __obj.updateDynamic("uplinkDelayMs")(uplinkDelayMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uplinkJitterMs)) __obj.updateDynamic("uplinkJitterMs")(uplinkJitterMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uplinkLossPercent)) __obj.updateDynamic("uplinkLossPercent")(uplinkLossPercent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNetworkProfileRequest]
  }
}

