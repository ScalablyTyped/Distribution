package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePullRequestApprovalRuleInput extends js.Object {
  /**
    * The name of the approval rule you want to delete.
    */
  var approvalRuleName: ApprovalRuleName = js.native
  /**
    * The system-generated ID of the pull request that contains the approval rule you want to delete.
    */
  var pullRequestId: PullRequestId = js.native
}

object DeletePullRequestApprovalRuleInput {
  @scala.inline
  def apply(approvalRuleName: ApprovalRuleName, pullRequestId: PullRequestId): DeletePullRequestApprovalRuleInput = {
    val __obj = js.Dynamic.literal(approvalRuleName = approvalRuleName.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeletePullRequestApprovalRuleInput]
  }
}

