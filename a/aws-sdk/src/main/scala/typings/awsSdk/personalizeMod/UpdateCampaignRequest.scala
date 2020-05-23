package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCampaignRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the campaign.
    */
  var campaignArn: Arn = js.native
  /**
    * Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon Personalize will support.
    */
  var minProvisionedTPS: js.UndefOr[TransactionsPerSecond] = js.native
  /**
    * The ARN of a new solution version to deploy.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.native
}

object UpdateCampaignRequest {
  @scala.inline
  def apply(
    campaignArn: Arn,
    minProvisionedTPS: js.UndefOr[TransactionsPerSecond] = js.undefined,
    solutionVersionArn: Arn = null
  ): UpdateCampaignRequest = {
    val __obj = js.Dynamic.literal(campaignArn = campaignArn.asInstanceOf[js.Any])
    if (!js.isUndefined(minProvisionedTPS)) __obj.updateDynamic("minProvisionedTPS")(minProvisionedTPS.get.asInstanceOf[js.Any])
    if (solutionVersionArn != null) __obj.updateDynamic("solutionVersionArn")(solutionVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCampaignRequest]
  }
}

