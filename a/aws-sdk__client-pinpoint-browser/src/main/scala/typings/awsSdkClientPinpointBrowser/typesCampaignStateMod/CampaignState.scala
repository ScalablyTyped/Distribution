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

trait CampaignState extends js.Object {
  /**
    * The status of the campaign, or the status of a treatment that belongs to an A/B test campaign.
    *
    * Valid values: SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED, PAUSED
    */
  var CampaignStatus: js.UndefOr[SCHEDULED | EXECUTING | PENDING_NEXT_RUN | COMPLETED | PAUSED | DELETED | String] = js.undefined
}

object CampaignState {
  @scala.inline
  def apply(
    CampaignStatus: SCHEDULED | EXECUTING | PENDING_NEXT_RUN | COMPLETED | PAUSED | DELETED | String = null
  ): CampaignState = {
    val __obj = js.Dynamic.literal()
    if (CampaignStatus != null) __obj.updateDynamic("CampaignStatus")(CampaignStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignState]
  }
}

