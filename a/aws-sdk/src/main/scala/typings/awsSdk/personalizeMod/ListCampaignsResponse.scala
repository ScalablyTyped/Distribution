package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCampaignsResponse extends js.Object {
  /**
    * A list of the campaigns.
    */
  var campaigns: js.UndefOr[Campaigns] = js.native
  /**
    * A token for getting the next set of campaigns (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListCampaignsResponse {
  @scala.inline
  def apply(campaigns: Campaigns = null, nextToken: NextToken = null): ListCampaignsResponse = {
    val __obj = js.Dynamic.literal()
    if (campaigns != null) __obj.updateDynamic("campaigns")(campaigns.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCampaignsResponse]
  }
}

