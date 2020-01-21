package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCampaignResponse extends js.Object {
  /**
    * The properties of the campaign.
    */
  var campaign: js.UndefOr[Campaign] = js.native
}

object DescribeCampaignResponse {
  @scala.inline
  def apply(campaign: Campaign = null): DescribeCampaignResponse = {
    val __obj = js.Dynamic.literal()
    if (campaign != null) __obj.updateDynamic("campaign")(campaign.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCampaignResponse]
  }
}

