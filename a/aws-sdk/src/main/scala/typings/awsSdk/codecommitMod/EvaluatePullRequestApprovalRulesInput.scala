package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class EvaluatePullRequestApprovalRulesInputOps[Self <: EvaluatePullRequestApprovalRulesInput] (val x: Self) extends AnyVal {
    
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
    def setPullRequestId(value: PullRequestId): Self = this.set("pullRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: RevisionId): Self = this.set("revisionId", value.asInstanceOf[js.Any])
  }
}
