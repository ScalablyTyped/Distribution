package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluatePullRequestApprovalRulesInput extends js.Object {
  /**
    * The system-generated ID of the pull request you want to evaluate.
    */
  var pullRequestId: PullRequestId = js.native
  /**
    * The system-generated ID for the pull request revision. To retrieve the most recent revision ID for a pull request, use GetPullRequest.
    */
  var revisionId: RevisionId = js.native
}

object EvaluatePullRequestApprovalRulesInput {
  @scala.inline
  def apply(pullRequestId: PullRequestId, revisionId: RevisionId): EvaluatePullRequestApprovalRulesInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluatePullRequestApprovalRulesInput]
  }
}

