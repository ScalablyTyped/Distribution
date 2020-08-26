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
  @scala.inline
  implicit class UpdatePullRequestApprovalRuleContentOutputOps[Self <: UpdatePullRequestApprovalRuleContentOutput] (val x: Self) extends AnyVal {
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
    def setApprovalRule(value: ApprovalRule): Self = this.set("approvalRule", value.asInstanceOf[js.Any])
  }
  
}

