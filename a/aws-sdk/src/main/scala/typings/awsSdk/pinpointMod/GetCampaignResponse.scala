package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCampaignResponse extends js.Object {
  var CampaignResponse: typings.awsSdk.pinpointMod.CampaignResponse = js.native
}

object GetCampaignResponse {
  @scala.inline
  def apply(CampaignResponse: CampaignResponse): GetCampaignResponse = {
    val __obj = js.Dynamic.literal(CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignResponse]
  }
}

