package typings.awsSdkClientPinpointBrowser.typesCampaignStateMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.COMPLETED
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DELETED
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.EXECUTING
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PAUSED
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PENDING_NEXT_RUN
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.SCHEDULED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignState extends js.Object {
  /**
    * The status of the campaign, or the status of a treatment that belongs to an A/B test campaign.
    *
    * Valid values: SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED, PAUSED
    */
  var CampaignStatus: js.UndefOr[SCHEDULED | EXECUTING | PENDING_NEXT_RUN | COMPLETED | PAUSED | DELETED | String] = js.native
}

object CampaignState {
  @scala.inline
  def apply(): CampaignState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignState]
  }
  @scala.inline
  implicit class CampaignStateOps[Self <: CampaignState] (val x: Self) extends AnyVal {
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
    def setCampaignStatus(value: SCHEDULED | EXECUTING | PENDING_NEXT_RUN | COMPLETED | PAUSED | DELETED | String): Self = this.set("CampaignStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCampaignStatus: Self = this.set("CampaignStatus", js.undefined)
  }
  
}

