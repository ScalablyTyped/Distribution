package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCampaignResponse extends js.Object {
  var CampaignResponse: typings.awsSdk.pinpointMod.CampaignResponse = js.native
}

object DeleteCampaignResponse {
  @scala.inline
  def apply(CampaignResponse: CampaignResponse): DeleteCampaignResponse = {
    val __obj = js.Dynamic.literal(CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCampaignResponse]
  }
}

