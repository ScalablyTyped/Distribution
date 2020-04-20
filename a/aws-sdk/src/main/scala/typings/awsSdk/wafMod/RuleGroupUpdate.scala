package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleGroupUpdate extends js.Object {
  /**
    * Specify INSERT to add an ActivatedRule to a RuleGroup. Use DELETE to remove an ActivatedRule from a RuleGroup.
    */
  var Action: ChangeAction = js.native
  /**
    * The ActivatedRule object specifies a Rule that you want to insert or delete, the priority of the Rule in the WebACL, and the action that you want AWS WAF to take when a web request matches the Rule (ALLOW, BLOCK, or COUNT).
    */
  var ActivatedRule: typings.awsSdk.wafMod.ActivatedRule = js.native
}

object RuleGroupUpdate {
  @scala.inline
  def apply(Action: ChangeAction, ActivatedRule: ActivatedRule): RuleGroupUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], ActivatedRule = ActivatedRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupUpdate]
  }
}

