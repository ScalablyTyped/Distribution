package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignLimitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CampaignLimits extends js.Object {
  /**
    * The maximum number of messages that each campaign can send to a single endpoint in a 24-hour period.
    */
  var Daily: js.UndefOr[Double] = js.undefined
  /**
    * The length of time (in seconds) that the campaign can run before it ends and message deliveries stop. This duration begins at the scheduled start time for the campaign. The minimum value is 60.
    */
  var MaximumDuration: js.UndefOr[Double] = js.undefined
  /**
    * The number of messages that the campaign can send per second. The minimum value is 50, and the maximum is 20000.
    */
  var MessagesPerSecond: js.UndefOr[Double] = js.undefined
  /**
    * The maximum number of messages that an individual campaign can send to a single endpoint over the course of the campaign.
    */
  var Total: js.UndefOr[Double] = js.undefined
}

object _CampaignLimits {
  @scala.inline
  def apply(
    Daily: Int | Double = null,
    MaximumDuration: Int | Double = null,
    MessagesPerSecond: Int | Double = null,
    Total: Int | Double = null
  ): _CampaignLimits = {
    val __obj = js.Dynamic.literal()
    if (Daily != null) __obj.updateDynamic("Daily")(Daily.asInstanceOf[js.Any])
    if (MaximumDuration != null) __obj.updateDynamic("MaximumDuration")(MaximumDuration.asInstanceOf[js.Any])
    if (MessagesPerSecond != null) __obj.updateDynamic("MessagesPerSecond")(MessagesPerSecond.asInstanceOf[js.Any])
    if (Total != null) __obj.updateDynamic("Total")(Total.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CampaignLimits]
  }
}

