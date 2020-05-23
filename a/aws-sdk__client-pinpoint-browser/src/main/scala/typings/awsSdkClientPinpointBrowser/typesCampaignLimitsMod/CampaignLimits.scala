package typings.awsSdkClientPinpointBrowser.typesCampaignLimitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignLimits extends js.Object {
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

object CampaignLimits {
  @scala.inline
  def apply(
    Daily: js.UndefOr[Double] = js.undefined,
    MaximumDuration: js.UndefOr[Double] = js.undefined,
    MessagesPerSecond: js.UndefOr[Double] = js.undefined,
    Total: js.UndefOr[Double] = js.undefined
  ): CampaignLimits = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Daily)) __obj.updateDynamic("Daily")(Daily.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaximumDuration)) __obj.updateDynamic("MaximumDuration")(MaximumDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MessagesPerSecond)) __obj.updateDynamic("MessagesPerSecond")(MessagesPerSecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Total)) __obj.updateDynamic("Total")(Total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignLimits]
  }
}

