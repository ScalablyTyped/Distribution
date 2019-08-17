package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignsResponseMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignResponseMod._CampaignResponse
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CampaignsResponse extends js.Object {
  /**
    * A list of campaigns.
    */
  var Item: js.UndefOr[js.Array[_CampaignResponse] | Iterable[_CampaignResponse]] = js.undefined
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object _CampaignsResponse {
  @scala.inline
  def apply(Item: js.Array[_CampaignResponse] | Iterable[_CampaignResponse] = null, NextToken: String = null): _CampaignsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[_CampaignsResponse]
  }
}

