package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutInsightRuleInput extends js.Object {
  /**
    * The definition of the rule, as a JSON object. For details on the valid syntax, see Contributor Insights Rule Syntax.
    */
  var RuleDefinition: InsightRuleDefinition = js.native
  /**
    * A unique name for the rule.
    */
  var RuleName: InsightRuleName = js.native
  /**
    * The state of the rule. Valid values are ENABLED and DISABLED.
    */
  var RuleState: js.UndefOr[InsightRuleState] = js.native
  /**
    * A list of key-value pairs to associate with the Contributor Insights rule. You can associate as many as 50 tags with a rule. Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only the resources that have certain tag values. To be able to associate tags with a rule, you must have the cloudwatch:TagResource permission in addition to the cloudwatch:PutInsightRule permission. If you are using this operation to update an existing Contributor Insights rule, any tags you specify in this parameter are ignored. To change the tags of an existing rule, use TagResource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object PutInsightRuleInput {
  @scala.inline
  def apply(
    RuleDefinition: InsightRuleDefinition,
    RuleName: InsightRuleName,
    RuleState: InsightRuleState = null,
    Tags: TagList = null
  ): PutInsightRuleInput = {
    val __obj = js.Dynamic.literal(RuleDefinition = RuleDefinition.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any])
    if (RuleState != null) __obj.updateDynamic("RuleState")(RuleState.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutInsightRuleInput]
  }
}

