package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignUpdateSummary extends js.Object {
  /**
    * The date and time (in Unix time) that the campaign update was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.native
  /**
    * If a campaign update fails, the reason behind the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.native
  /**
    * The date and time (in Unix time) that the campaign update was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.native
  /**
    * Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon Personalize will support.
    */
  var minProvisionedTPS: js.UndefOr[TransactionsPerSecond] = js.native
  /**
    * The Amazon Resource Name (ARN) of the deployed solution version.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.native
  /**
    * The status of the campaign update. A campaign update can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.native
}

object CampaignUpdateSummary {
  @scala.inline
  def apply(
    creationDateTime: Date = null,
    failureReason: FailureReason = null,
    lastUpdatedDateTime: Date = null,
    minProvisionedTPS: js.UndefOr[TransactionsPerSecond] = js.undefined,
    solutionVersionArn: Arn = null,
    status: Status = null
  ): CampaignUpdateSummary = {
    val __obj = js.Dynamic.literal()
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(minProvisionedTPS)) __obj.updateDynamic("minProvisionedTPS")(minProvisionedTPS.get.asInstanceOf[js.Any])
    if (solutionVersionArn != null) __obj.updateDynamic("solutionVersionArn")(solutionVersionArn.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignUpdateSummary]
  }
}

