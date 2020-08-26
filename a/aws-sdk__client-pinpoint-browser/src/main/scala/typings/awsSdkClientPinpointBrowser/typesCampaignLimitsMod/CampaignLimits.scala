package typings.awsSdkClientPinpointBrowser.typesCampaignLimitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignLimits extends js.Object {
  /**
    * The maximum number of messages that each campaign can send to a single endpoint in a 24-hour period.
    */
  var Daily: js.UndefOr[Double] = js.native
  /**
    * The length of time (in seconds) that the campaign can run before it ends and message deliveries stop. This duration begins at the scheduled start time for the campaign. The minimum value is 60.
    */
  var MaximumDuration: js.UndefOr[Double] = js.native
  /**
    * The number of messages that the campaign can send per second. The minimum value is 50, and the maximum is 20000.
    */
  var MessagesPerSecond: js.UndefOr[Double] = js.native
  /**
    * The maximum number of messages that an individual campaign can send to a single endpoint over the course of the campaign.
    */
  var Total: js.UndefOr[Double] = js.native
}

object CampaignLimits {
  @scala.inline
  def apply(): CampaignLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignLimits]
  }
  @scala.inline
  implicit class CampaignLimitsOps[Self <: CampaignLimits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDaily(value: Double): Self = this.set("Daily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDaily: Self = this.set("Daily", js.undefined)
    @scala.inline
    def setMaximumDuration(value: Double): Self = this.set("MaximumDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumDuration: Self = this.set("MaximumDuration", js.undefined)
    @scala.inline
    def setMessagesPerSecond(value: Double): Self = this.set("MessagesPerSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessagesPerSecond: Self = this.set("MessagesPerSecond", js.undefined)
    @scala.inline
    def setTotal(value: Double): Self = this.set("Total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("Total", js.undefined)
  }
  
}

