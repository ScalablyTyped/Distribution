package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCampaignVersionResponse extends js.Object {
  var CampaignResponse: typings.awsSdk.pinpointMod.CampaignResponse = js.native
}

object GetCampaignVersionResponse {
  @scala.inline
  def apply(CampaignResponse: CampaignResponse): GetCampaignVersionResponse = {
    val __obj = js.Dynamic.literal(CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignVersionResponse]
  }
}

