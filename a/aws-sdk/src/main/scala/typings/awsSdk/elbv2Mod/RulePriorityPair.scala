package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulePriorityPair extends js.Object {
  /**
    * The rule priority.
    */
  var Priority: js.UndefOr[RulePriority] = js.native
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: js.UndefOr[typings.awsSdk.elbv2Mod.RuleArn] = js.native
}

object RulePriorityPair {
  @scala.inline
  def apply(Priority: Int | Double = null, RuleArn: RuleArn = null): RulePriorityPair = {
    val __obj = js.Dynamic.literal()
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (RuleArn != null) __obj.updateDynamic("RuleArn")(RuleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulePriorityPair]
  }
}

