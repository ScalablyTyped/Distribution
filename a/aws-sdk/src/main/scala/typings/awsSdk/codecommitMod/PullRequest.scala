package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequest extends js.Object {
  /**
    * The approval rules applied to the pull request.
    */
  var approvalRules: js.UndefOr[ApprovalRulesList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user who created the pull request.
    */
  var authorArn: js.UndefOr[Arn] = js.native
  /**
    * A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request returns information about the initial request that used that token.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  /**
    * The date and time the pull request was originally created, in timestamp format.
    */
  var creationDate: js.UndefOr[CreationDate] = js.native
  /**
    * The user-defined description of the pull request. This description can be used to clarify what should be reviewed and other details of the request.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The day and time of the last user or system activity on the pull request, in timestamp format.
    */
  var lastActivityDate: js.UndefOr[LastModifiedDate] = js.native
  /**
    * The system-generated ID of the pull request. 
    */
  var pullRequestId: js.UndefOr[PullRequestId] = js.native
  /**
    * The status of the pull request. Pull request status can only change from OPEN to CLOSED.
    */
  var pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.native
  /**
    * The targets of the pull request, including the source branch and destination branch for the pull request.
    */
  var pullRequestTargets: js.UndefOr[PullRequestTargetList] = js.native
  /**
    * The system-generated revision ID for the pull request.
    */
  var revisionId: js.UndefOr[RevisionId] = js.native
  /**
    * The user-defined title of the pull request. This title is displayed in the list of pull requests to other repository users.
    */
  var title: js.UndefOr[Title] = js.native
}

object PullRequest {
  @scala.inline
  def apply(): PullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequest]
  }
  @scala.inline
  implicit class PullRequestOps[Self <: PullRequest] (val x: Self) extends AnyVal {
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
    def setApprovalRulesVarargs(value: ApprovalRule*): Self = this.set("approvalRules", js.Array(value :_*))
    @scala.inline
    def setApprovalRules(value: ApprovalRulesList): Self = this.set("approvalRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalRules: Self = this.set("approvalRules", js.undefined)
    @scala.inline
    def setAuthorArn(value: Arn): Self = this.set("authorArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorArn: Self = this.set("authorArn", js.undefined)
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    @scala.inline
    def setCreationDate(value: CreationDate): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLastActivityDate(value: LastModifiedDate): Self = this.set("lastActivityDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastActivityDate: Self = this.set("lastActivityDate", js.undefined)
    @scala.inline
    def setPullRequestId(value: PullRequestId): Self = this.set("pullRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullRequestId: Self = this.set("pullRequestId", js.undefined)
    @scala.inline
    def setPullRequestStatus(value: PullRequestStatusEnum): Self = this.set("pullRequestStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullRequestStatus: Self = this.set("pullRequestStatus", js.undefined)
    @scala.inline
    def setPullRequestTargetsVarargs(value: PullRequestTarget*): Self = this.set("pullRequestTargets", js.Array(value :_*))
    @scala.inline
    def setPullRequestTargets(value: PullRequestTargetList): Self = this.set("pullRequestTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullRequestTargets: Self = this.set("pullRequestTargets", js.undefined)
    @scala.inline
    def setRevisionId(value: RevisionId): Self = this.set("revisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionId: Self = this.set("revisionId", js.undefined)
    @scala.inline
    def setTitle(value: Title): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

