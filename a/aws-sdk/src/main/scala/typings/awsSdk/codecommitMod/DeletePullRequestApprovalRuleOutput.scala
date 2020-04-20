package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePullRequestApprovalRuleOutput extends js.Object {
  /**
    * The ID of the deleted approval rule.   If the approval rule was deleted in an earlier API call, the response is 200 OK without content. 
    */
  var approvalRuleId: ApprovalRuleId = js.native
}

object DeletePullRequestApprovalRuleOutput {
  @scala.inline
  def apply(approvalRuleId: ApprovalRuleId): DeletePullRequestApprovalRuleOutput = {
    val __obj = js.Dynamic.literal(approvalRuleId = approvalRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePullRequestApprovalRuleOutput]
  }
}

