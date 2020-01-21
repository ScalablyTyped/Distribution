package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkProfile extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the network profile.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The description of the network profile.
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
    * The name of the network profile.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The type of network profile. Valid values are listed here.
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

object NetworkProfile {
  @scala.inline
  def apply(
    arn: AmazonResourceName = null,
    description: Message = null,
    downlinkBandwidthBits: Int | scala.Double = null,
    downlinkDelayMs: Int | scala.Double = null,
    downlinkJitterMs: Int | scala.Double = null,
    downlinkLossPercent: Int | scala.Double = null,
    name: Name = null,
    `type`: NetworkProfileType = null,
    uplinkBandwidthBits: Int | scala.Double = null,
    uplinkDelayMs: Int | scala.Double = null,
    uplinkJitterMs: Int | scala.Double = null,
    uplinkLossPercent: Int | scala.Double = null
  ): NetworkProfile = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (downlinkBandwidthBits != null) __obj.updateDynamic("downlinkBandwidthBits")(downlinkBandwidthBits.asInstanceOf[js.Any])
    if (downlinkDelayMs != null) __obj.updateDynamic("downlinkDelayMs")(downlinkDelayMs.asInstanceOf[js.Any])
    if (downlinkJitterMs != null) __obj.updateDynamic("downlinkJitterMs")(downlinkJitterMs.asInstanceOf[js.Any])
    if (downlinkLossPercent != null) __obj.updateDynamic("downlinkLossPercent")(downlinkLossPercent.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uplinkBandwidthBits != null) __obj.updateDynamic("uplinkBandwidthBits")(uplinkBandwidthBits.asInstanceOf[js.Any])
    if (uplinkDelayMs != null) __obj.updateDynamic("uplinkDelayMs")(uplinkDelayMs.asInstanceOf[js.Any])
    if (uplinkJitterMs != null) __obj.updateDynamic("uplinkJitterMs")(uplinkJitterMs.asInstanceOf[js.Any])
    if (uplinkLossPercent != null) __obj.updateDynamic("uplinkLossPercent")(uplinkLossPercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkProfile]
  }
}

