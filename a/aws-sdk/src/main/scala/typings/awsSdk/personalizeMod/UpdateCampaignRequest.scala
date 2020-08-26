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
  def apply(campaignArn: Arn): UpdateCampaignRequest = {
    val __obj = js.Dynamic.literal(campaignArn = campaignArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCampaignRequest]
  }
  @scala.inline
  implicit class UpdateCampaignRequestOps[Self <: UpdateCampaignRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCampaignArn(value: Arn): Self = this.set("campaignArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinProvisionedTPS(value: TransactionsPerSecond): Self = this.set("minProvisionedTPS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinProvisionedTPS: Self = this.set("minProvisionedTPS", js.undefined)
    @scala.inline
    def setSolutionVersionArn(value: Arn): Self = this.set("solutionVersionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSolutionVersionArn: Self = this.set("solutionVersionArn", js.undefined)
  }
  
}

