package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInsightRulesInput extends js.Object {
  /**
    * An array of the rule names to delete. If you need to find out the names of your rules, use DescribeInsightRules.
    */
  var RuleNames: InsightRuleNames = js.native
}

object DeleteInsightRulesInput {
  @scala.inline
  def apply(RuleNames: InsightRuleNames): DeleteInsightRulesInput = {
    val __obj = js.Dynamic.literal(RuleNames = RuleNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInsightRulesInput]
  }
  @scala.inline
  implicit class DeleteInsightRulesInputOps[Self <: DeleteInsightRulesInput] (val x: Self) extends AnyVal {
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
    def setRuleNamesVarargs(value: InsightRuleName*): Self = this.set("RuleNames", js.Array(value :_*))
    @scala.inline
    def setRuleNames(value: InsightRuleNames): Self = this.set("RuleNames", value.asInstanceOf[js.Any])
  }
  
}

