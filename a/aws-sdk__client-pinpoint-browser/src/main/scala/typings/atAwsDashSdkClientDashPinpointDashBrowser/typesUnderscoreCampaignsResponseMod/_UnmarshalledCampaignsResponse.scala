package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignsResponseMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignResponseMod._UnmarshalledCampaignResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledCampaignsResponse extends _CampaignsResponse {
  /**
    * A list of campaigns.
    */
  @JSName("Item")
  var Item__UnmarshalledCampaignsResponse: js.UndefOr[js.Array[_UnmarshalledCampaignResponse]] = js.undefined
}

object _UnmarshalledCampaignsResponse {
  @scala.inline
  def apply(Item: js.Array[_UnmarshalledCampaignResponse] = null, NextToken: String = null): _UnmarshalledCampaignsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledCampaignsResponse]
  }
}

