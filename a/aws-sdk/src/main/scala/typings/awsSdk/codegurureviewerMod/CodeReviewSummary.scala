package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeReviewSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the  CodeReview  object. 
    */
  var CodeReviewArn: js.UndefOr[Arn] = js.native
  /**
    *  The time, in milliseconds since the epoch, when the code review was created. 
    */
  var CreatedTimeStamp: js.UndefOr[TimeStamp] = js.native
  /**
    *  The time, in milliseconds since the epoch, when the code review was last updated. 
    */
  var LastUpdatedTimeStamp: js.UndefOr[TimeStamp] = js.native
  /**
    *  The statistics from the code review. 
    */
  var MetricsSummary: js.UndefOr[typings.awsSdk.codegurureviewerMod.MetricsSummary] = js.native
  /**
    *  The name of the code review. 
    */
  var Name: js.UndefOr[typings.awsSdk.codegurureviewerMod.Name] = js.native
  /**
    * The owner of the repository. For an AWS CodeCommit repository, this is the AWS account ID of the account that owns the repository. For a GitHub or Bitbucket repository, this is the username for the account that owns the repository.
    */
  var Owner: js.UndefOr[typings.awsSdk.codegurureviewerMod.Owner] = js.native
  /**
    *  The provider type of the repository association. 
    */
  var ProviderType: js.UndefOr[typings.awsSdk.codegurureviewerMod.ProviderType] = js.native
  /**
    *  The pull request ID for the code review. 
    */
  var PullRequestId: js.UndefOr[typings.awsSdk.codegurureviewerMod.PullRequestId] = js.native
  /**
    *  The name of the repository. 
    */
  var RepositoryName: js.UndefOr[Name] = js.native
  /**
    *  The state of the code review.  The valid code review states are:    Completed: The code review is complete.     Pending: The code review started and has not completed or failed.     Failed: The code review failed.     Deleting: The code review is being deleted.   
    */
  var State: js.UndefOr[JobState] = js.native
  /**
    *  The type of the code review. 
    */
  var Type: js.UndefOr[typings.awsSdk.codegurureviewerMod.Type] = js.native
}

object CodeReviewSummary {
  @scala.inline
  def apply(): CodeReviewSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeReviewSummary]
  }
  @scala.inline
  implicit class CodeReviewSummaryOps[Self <: CodeReviewSummary] (val x: Self) extends AnyVal {
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
    def setCodeReviewArn(value: Arn): Self = this.set("CodeReviewArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeReviewArn: Self = this.set("CodeReviewArn", js.undefined)
    @scala.inline
    def setCreatedTimeStamp(value: TimeStamp): Self = this.set("CreatedTimeStamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTimeStamp: Self = this.set("CreatedTimeStamp", js.undefined)
    @scala.inline
    def setLastUpdatedTimeStamp(value: TimeStamp): Self = this.set("LastUpdatedTimeStamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTimeStamp: Self = this.set("LastUpdatedTimeStamp", js.undefined)
    @scala.inline
    def setMetricsSummary(value: MetricsSummary): Self = this.set("MetricsSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricsSummary: Self = this.set("MetricsSummary", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setOwner(value: Owner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
    @scala.inline
    def setProviderType(value: ProviderType): Self = this.set("ProviderType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderType: Self = this.set("ProviderType", js.undefined)
    @scala.inline
    def setPullRequestId(value: PullRequestId): Self = this.set("PullRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullRequestId: Self = this.set("PullRequestId", js.undefined)
    @scala.inline
    def setRepositoryName(value: Name): Self = this.set("RepositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoryName: Self = this.set("RepositoryName", js.undefined)
    @scala.inline
    def setState(value: JobState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setType(value: Type): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

