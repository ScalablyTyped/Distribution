package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePullRequestApprovalRuleOutput extends js.Object {
  /**
    * Information about the created approval rule.
    */
  var approvalRule: ApprovalRule = js.native
}

object CreatePullRequestApprovalRuleOutput {
  @scala.inline
  def apply(approvalRule: ApprovalRule): CreatePullRequestApprovalRuleOutput = {
    val __obj = js.Dynamic.literal(approvalRule = approvalRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePullRequestApprovalRuleOutput]
  }
}

