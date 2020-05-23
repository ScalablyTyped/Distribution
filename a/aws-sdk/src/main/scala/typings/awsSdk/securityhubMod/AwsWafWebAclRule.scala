package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsWafWebAclRule extends js.Object {
  /**
    * Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule. 
    */
  var Action: js.UndefOr[WafAction] = js.native
  /**
    * Rules to exclude from a rule group.
    */
  var ExcludedRules: js.UndefOr[WafExcludedRuleList] = js.native
  /**
    * Use the OverrideAction to test your RuleGroup. Any rule in a RuleGroup can potentially block a request. If you set the OverrideAction to None, the RuleGroup blocks a request if any individual rule in the RuleGroup matches the request and is configured to block that request. However, if you first want to test the RuleGroup, set the OverrideAction to Count. The RuleGroup then overrides any block action specified by individual rules contained within the group. Instead of blocking matching requests, those requests are counted.  ActivatedRule|OverrideAction applies only when updating or adding a RuleGroup to a WebACL. In this case you do not use ActivatedRule|Action. For all other update requests, ActivatedRule|Action is used instead of ActivatedRule|OverrideAction. 
    */
  var OverrideAction: js.UndefOr[WafOverrideAction] = js.native
  /**
    * Specifies the order in which the rules in a WebACL are evaluated. Rules with a lower value for Priority are evaluated before rules with a higher value. The value must be a unique integer. If you add multiple rules to a WebACL, the values do not need to be consecutive.
    */
  var Priority: js.UndefOr[Integer] = js.native
  /**
    * The identifier for a rule.
    */
  var RuleId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The rule type. Valid values: REGULAR | RATE_BASED | GROUP  The default is REGULAR.
    */
  var Type: js.UndefOr[NonEmptyString] = js.native
}

object AwsWafWebAclRule {
  @scala.inline
  def apply(
    Action: WafAction = null,
    ExcludedRules: WafExcludedRuleList = null,
    OverrideAction: WafOverrideAction = null,
    Priority: js.UndefOr[Integer] = js.undefined,
    RuleId: NonEmptyString = null,
    Type: NonEmptyString = null
  ): AwsWafWebAclRule = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (ExcludedRules != null) __obj.updateDynamic("ExcludedRules")(ExcludedRules.asInstanceOf[js.Any])
    if (OverrideAction != null) __obj.updateDynamic("OverrideAction")(OverrideAction.asInstanceOf[js.Any])
    if (!js.isUndefined(Priority)) __obj.updateDynamic("Priority")(Priority.get.asInstanceOf[js.Any])
    if (RuleId != null) __obj.updateDynamic("RuleId")(RuleId.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsWafWebAclRule]
  }
}

