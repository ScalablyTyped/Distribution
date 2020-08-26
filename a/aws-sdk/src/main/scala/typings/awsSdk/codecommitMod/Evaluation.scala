package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Evaluation extends js.Object {
  /**
    * The names of the approval rules that have not had their conditions met.
    */
  var approvalRulesNotSatisfied: js.UndefOr[ApprovalRulesNotSatisfiedList] = js.native
  /**
    * The names of the approval rules that have had their conditions met.
    */
  var approvalRulesSatisfied: js.UndefOr[ApprovalRulesSatisfiedList] = js.native
  /**
    * Whether the state of the pull request is approved.
    */
  var approved: js.UndefOr[Approved] = js.native
  /**
    * Whether the approval rule requirements for the pull request have been overridden and no longer need to be met.
    */
  var overridden: js.UndefOr[Overridden] = js.native
}

object Evaluation {
  @scala.inline
  def apply(): Evaluation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Evaluation]
  }
  @scala.inline
  implicit class EvaluationOps[Self <: Evaluation] (val x: Self) extends AnyVal {
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
    def setApprovalRulesNotSatisfiedVarargs(value: ApprovalRuleName*): Self = this.set("approvalRulesNotSatisfied", js.Array(value :_*))
    @scala.inline
    def setApprovalRulesNotSatisfied(value: ApprovalRulesNotSatisfiedList): Self = this.set("approvalRulesNotSatisfied", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalRulesNotSatisfied: Self = this.set("approvalRulesNotSatisfied", js.undefined)
    @scala.inline
    def setApprovalRulesSatisfiedVarargs(value: ApprovalRuleName*): Self = this.set("approvalRulesSatisfied", js.Array(value :_*))
    @scala.inline
    def setApprovalRulesSatisfied(value: ApprovalRulesSatisfiedList): Self = this.set("approvalRulesSatisfied", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalRulesSatisfied: Self = this.set("approvalRulesSatisfied", js.undefined)
    @scala.inline
    def setApproved(value: Approved): Self = this.set("approved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApproved: Self = this.set("approved", js.undefined)
    @scala.inline
    def setOverridden(value: Overridden): Self = this.set("overridden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverridden: Self = this.set("overridden", js.undefined)
  }
  
}

