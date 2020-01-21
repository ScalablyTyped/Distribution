package typings.awsSdkClientPinpointBrowser.typesCampaignsResponseMod

import typings.awsSdkClientPinpointBrowser.typesCampaignResponseMod.UnmarshalledCampaignResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledCampaignsResponse extends CampaignsResponse {
  /**
    * A list of campaigns.
    */
  @JSName("Item")
  var Item_UnmarshalledCampaignsResponse: js.UndefOr[js.Array[UnmarshalledCampaignResponse]] = js.undefined
}

object UnmarshalledCampaignsResponse {
  @scala.inline
  def apply(Item: js.Array[UnmarshalledCampaignResponse] = null, NextToken: String = null): UnmarshalledCampaignsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledCampaignsResponse]
  }
}

