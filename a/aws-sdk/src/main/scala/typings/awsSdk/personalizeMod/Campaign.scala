package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Campaign extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the campaign. 
    */
  var campaignArn: js.UndefOr[Arn] = js.native
  /**
    * The date and time (in Unix format) that the campaign was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.native
  /**
    * If a campaign fails, the reason behind the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.native
  /**
    * The date and time (in Unix format) that the campaign was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.native
  var latestCampaignUpdate: js.UndefOr[CampaignUpdateSummary] = js.native
  /**
    * Specifies the requested minimum provisioned transactions (recommendations) per second.
    */
  var minProvisionedTPS: js.UndefOr[TransactionsPerSecond] = js.native
  /**
    * The name of the campaign.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The Amazon Resource Name (ARN) of a specific version of the solution.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.native
  /**
    * The status of the campaign. A campaign can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.native
}

object Campaign {
  @scala.inline
  def apply(): Campaign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Campaign]
  }
  @scala.inline
  implicit class CampaignOps[Self <: Campaign] (val x: Self) extends AnyVal {
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
    def deleteCampaignArn: Self = this.set("campaignArn", js.undefined)
    @scala.inline
    def setCreationDateTime(value: Date): Self = this.set("creationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDateTime: Self = this.set("creationDateTime", js.undefined)
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    @scala.inline
    def setLastUpdatedDateTime(value: Date): Self = this.set("lastUpdatedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedDateTime: Self = this.set("lastUpdatedDateTime", js.undefined)
    @scala.inline
    def setLatestCampaignUpdate(value: CampaignUpdateSummary): Self = this.set("latestCampaignUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestCampaignUpdate: Self = this.set("latestCampaignUpdate", js.undefined)
    @scala.inline
    def setMinProvisionedTPS(value: TransactionsPerSecond): Self = this.set("minProvisionedTPS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinProvisionedTPS: Self = this.set("minProvisionedTPS", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSolutionVersionArn(value: Arn): Self = this.set("solutionVersionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSolutionVersionArn: Self = this.set("solutionVersionArn", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

