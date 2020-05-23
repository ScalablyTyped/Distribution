package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignLimits extends js.Object {
  /**
    * The maximum number of messages that a campaign can send to a single endpoint during a 24-hour period. For an application, this value specifies the default limit for the number of messages that campaigns and journeys can send to a single endpoint during a 24-hour period. The maximum value is 100.
    */
  var Daily: js.UndefOr[integer] = js.native
  /**
    * The maximum amount of time, in seconds, that a campaign can attempt to deliver a message after the scheduled start time for the campaign. The minimum value is 60 seconds.
    */
  var MaximumDuration: js.UndefOr[integer] = js.native
  /**
    * The maximum number of messages that a campaign can send each second. For an application, this value specifies the default limit for the number of messages that campaigns and journeys can send each second. The minimum value is 50. The maximum value is 20,000.
    */
  var MessagesPerSecond: js.UndefOr[integer] = js.native
  /**
    * The maximum number of messages that a campaign can send to a single endpoint during the course of the campaign. If a campaign recurs, this setting applies to all runs of the campaign. The maximum value is 100.
    */
  var Total: js.UndefOr[integer] = js.native
}

object CampaignLimits {
  @scala.inline
  def apply(
    Daily: js.UndefOr[integer] = js.undefined,
    MaximumDuration: js.UndefOr[integer] = js.undefined,
    MessagesPerSecond: js.UndefOr[integer] = js.undefined,
    Total: js.UndefOr[integer] = js.undefined
  ): CampaignLimits = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Daily)) __obj.updateDynamic("Daily")(Daily.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaximumDuration)) __obj.updateDynamic("MaximumDuration")(MaximumDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MessagesPerSecond)) __obj.updateDynamic("MessagesPerSecond")(MessagesPerSecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Total)) __obj.updateDynamic("Total")(Total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignLimits]
  }
}

