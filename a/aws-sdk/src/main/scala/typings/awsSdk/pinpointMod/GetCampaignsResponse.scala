package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCampaignsResponse extends js.Object {
  var CampaignsResponse: typings.awsSdk.pinpointMod.CampaignsResponse = js.native
}

object GetCampaignsResponse {
  @scala.inline
  def apply(CampaignsResponse: CampaignsResponse): GetCampaignsResponse = {
    val __obj = js.Dynamic.literal(CampaignsResponse = CampaignsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignsResponse]
  }
}

