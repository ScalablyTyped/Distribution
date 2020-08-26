package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePullRequestApprovalStateInput extends js.Object {
  /**
    * The approval state to associate with the user on the pull request.
    */
  var approvalState: ApprovalState = js.native
  /**
    * The system-generated ID of the pull request.
    */
  var pullRequestId: PullRequestId = js.native
  /**
    * The system-generated ID of the revision.
    */
  var revisionId: RevisionId = js.native
}

object UpdatePullRequestApprovalStateInput {
  @scala.inline
  def apply(approvalState: ApprovalState, pullRequestId: PullRequestId, revisionId: RevisionId): UpdatePullRequestApprovalStateInput = {
    val __obj = js.Dynamic.literal(approvalState = approvalState.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePullRequestApprovalStateInput]
  }
  @scala.inline
  implicit class UpdatePullRequestApprovalStateInputOps[Self <: UpdatePullRequestApprovalStateInput] (val x: Self) extends AnyVal {
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
    def setApprovalState(value: ApprovalState): Self = this.set("approvalState", value.asInstanceOf[js.Any])
    @scala.inline
    def setPullRequestId(value: PullRequestId): Self = this.set("pullRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevisionId(value: RevisionId): Self = this.set("revisionId", value.asInstanceOf[js.Any])
  }
  
}

