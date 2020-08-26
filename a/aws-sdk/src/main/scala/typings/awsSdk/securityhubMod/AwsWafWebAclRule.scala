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
  def apply(): AwsWafWebAclRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafWebAclRule]
  }
  @scala.inline
  implicit class AwsWafWebAclRuleOps[Self <: AwsWafWebAclRule] (val x: Self) extends AnyVal {
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
    def setAction(value: WafAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    @scala.inline
    def setExcludedRulesVarargs(value: WafExcludedRule*): Self = this.set("ExcludedRules", js.Array(value :_*))
    @scala.inline
    def setExcludedRules(value: WafExcludedRuleList): Self = this.set("ExcludedRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedRules: Self = this.set("ExcludedRules", js.undefined)
    @scala.inline
    def setOverrideAction(value: WafOverrideAction): Self = this.set("OverrideAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideAction: Self = this.set("OverrideAction", js.undefined)
    @scala.inline
    def setPriority(value: Integer): Self = this.set("Priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
    @scala.inline
    def setRuleId(value: NonEmptyString): Self = this.set("RuleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleId: Self = this.set("RuleId", js.undefined)
    @scala.inline
    def setType(value: NonEmptyString): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

