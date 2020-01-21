package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCampaignResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the campaign.
    */
  var campaignArn: js.UndefOr[Arn] = js.native
}

object CreateCampaignResponse {
  @scala.inline
  def apply(campaignArn: Arn = null): CreateCampaignResponse = {
    val __obj = js.Dynamic.literal()
    if (campaignArn != null) __obj.updateDynamic("campaignArn")(campaignArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCampaignResponse]
  }
}

