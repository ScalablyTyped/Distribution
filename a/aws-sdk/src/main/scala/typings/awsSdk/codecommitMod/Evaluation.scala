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
  def apply(
    approvalRulesNotSatisfied: ApprovalRulesNotSatisfiedList = null,
    approvalRulesSatisfied: ApprovalRulesSatisfiedList = null,
    approved: js.UndefOr[Boolean] = js.undefined,
    overridden: js.UndefOr[Boolean] = js.undefined
  ): Evaluation = {
    val __obj = js.Dynamic.literal()
    if (approvalRulesNotSatisfied != null) __obj.updateDynamic("approvalRulesNotSatisfied")(approvalRulesNotSatisfied.asInstanceOf[js.Any])
    if (approvalRulesSatisfied != null) __obj.updateDynamic("approvalRulesSatisfied")(approvalRulesSatisfied.asInstanceOf[js.Any])
    if (!js.isUndefined(approved)) __obj.updateDynamic("approved")(approved.asInstanceOf[js.Any])
    if (!js.isUndefined(overridden)) __obj.updateDynamic("overridden")(overridden.asInstanceOf[js.Any])
    __obj.asInstanceOf[Evaluation]
  }
}

