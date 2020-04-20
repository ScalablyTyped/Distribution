package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePullRequestApprovalRuleContentOutput extends js.Object {
  /**
    * Information about the updated approval rule.
    */
  var approvalRule: ApprovalRule = js.native
}

object UpdatePullRequestApprovalRuleContentOutput {
  @scala.inline
  def apply(approvalRule: ApprovalRule): UpdatePullRequestApprovalRuleContentOutput = {
    val __obj = js.Dynamic.literal(approvalRule = approvalRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePullRequestApprovalRuleContentOutput]
  }
}

