package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignLimits extends js.Object {
  /**
    * The maximum number of messages that a campaign can send to a single endpoint during a 24-hour period. The maximum value is 100.
    */
  var Daily: js.UndefOr[integer] = js.native
  /**
    * The maximum amount of time, in seconds, that a campaign can attempt to deliver a message after the scheduled start time for the campaign. The minimum value is 60 seconds.
    */
  var MaximumDuration: js.UndefOr[integer] = js.native
  /**
    * The maximum number of messages that a campaign can send each second. The minimum value is 50. The maximum value is 20,000.
    */
  var MessagesPerSecond: js.UndefOr[integer] = js.native
  /**
    * The maximum number of messages that a campaign can send to a single endpoint during the course of the campaign. The maximum value is 100.
    */
  var Total: js.UndefOr[integer] = js.native
}

object CampaignLimits {
  @scala.inline
  def apply(
    Daily: Int | Double = null,
    MaximumDuration: Int | Double = null,
    MessagesPerSecond: Int | Double = null,
    Total: Int | Double = null
  ): CampaignLimits = {
    val __obj = js.Dynamic.literal()
    if (Daily != null) __obj.updateDynamic("Daily")(Daily.asInstanceOf[js.Any])
    if (MaximumDuration != null) __obj.updateDynamic("MaximumDuration")(MaximumDuration.asInstanceOf[js.Any])
    if (MessagesPerSecond != null) __obj.updateDynamic("MessagesPerSecond")(MessagesPerSecond.asInstanceOf[js.Any])
    if (Total != null) __obj.updateDynamic("Total")(Total.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignLimits]
  }
}

