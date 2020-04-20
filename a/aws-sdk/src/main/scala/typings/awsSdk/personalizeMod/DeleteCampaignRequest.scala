package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCampaignRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the campaign to delete.
    */
  var campaignArn: Arn = js.native
}

object DeleteCampaignRequest {
  @scala.inline
  def apply(campaignArn: Arn): DeleteCampaignRequest = {
    val __obj = js.Dynamic.literal(campaignArn = campaignArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCampaignRequest]
  }
}

