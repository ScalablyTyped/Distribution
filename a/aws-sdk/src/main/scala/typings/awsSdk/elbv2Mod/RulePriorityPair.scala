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
  def apply(): RulePriorityPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RulePriorityPair]
  }
  @scala.inline
  implicit class RulePriorityPairOps[Self <: RulePriorityPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPriority(value: RulePriority): Self = this.set("Priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
    @scala.inline
    def setRuleArn(value: RuleArn): Self = this.set("RuleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleArn: Self = this.set("RuleArn", js.undefined)
  }
  
}

