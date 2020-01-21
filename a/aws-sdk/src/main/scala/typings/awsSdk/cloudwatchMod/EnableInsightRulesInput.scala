package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableInsightRulesInput extends js.Object {
  /**
    * An array of the rule names to enable. If you need to find out the names of your rules, use DescribeInsightRules.
    */
  var RuleNames: InsightRuleNames = js.native
}

object EnableInsightRulesInput {
  @scala.inline
  def apply(RuleNames: InsightRuleNames): EnableInsightRulesInput = {
    val __obj = js.Dynamic.literal(RuleNames = RuleNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EnableInsightRulesInput]
  }
}

