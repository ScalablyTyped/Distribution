package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableInsightRulesInput extends js.Object {
  /**
    * An array of the rule names to disable. If you need to find out the names of your rules, use DescribeInsightRules.
    */
  var RuleNames: InsightRuleNames = js.native
}

object DisableInsightRulesInput {
  @scala.inline
  def apply(RuleNames: InsightRuleNames): DisableInsightRulesInput = {
    val __obj = js.Dynamic.literal(RuleNames = RuleNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableInsightRulesInput]
  }
}

