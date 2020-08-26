package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyRuleInput extends js.Object {
  /**
    * The actions. Each rule must include exactly one of the following types of actions: forward, fixed-response, or redirect, and it must be the last action to be performed. If the action type is forward, you specify one or more target groups. The protocol of the target group must be HTTP or HTTPS for an Application Load Balancer. The protocol of the target group must be TCP, TLS, UDP, or TCP_UDP for a Network Load Balancer. [HTTPS listeners] If the action type is authenticate-oidc, you authenticate users through an identity provider that is OpenID Connect (OIDC) compliant. [HTTPS listeners] If the action type is authenticate-cognito, you authenticate users through the user pools supported by Amazon Cognito. [Application Load Balancer] If the action type is redirect, you redirect specified client requests from one URL to another. [Application Load Balancer] If the action type is fixed-response, you drop specified client requests and return a custom HTTP response.
    */
  var Actions: js.UndefOr[typings.awsSdk.elbv2Mod.Actions] = js.native
  /**
    * The conditions. Each rule can include zero or one of the following conditions: http-request-method, host-header, path-pattern, and source-ip, and zero or more of the following conditions: http-header and query-string.
    */
  var Conditions: js.UndefOr[RuleConditionList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: typings.awsSdk.elbv2Mod.RuleArn = js.native
}

object ModifyRuleInput {
  @scala.inline
  def apply(RuleArn: RuleArn): ModifyRuleInput = {
    val __obj = js.Dynamic.literal(RuleArn = RuleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyRuleInput]
  }
  @scala.inline
  implicit class ModifyRuleInputOps[Self <: ModifyRuleInput] (val x: Self) extends AnyVal {
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
    def setRuleArn(value: RuleArn): Self = this.set("RuleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionsVarargs(value: Action*): Self = this.set("Actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: Actions): Self = this.set("Actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("Actions", js.undefined)
    @scala.inline
    def setConditionsVarargs(value: RuleCondition*): Self = this.set("Conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: RuleConditionList): Self = this.set("Conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("Conditions", js.undefined)
  }
  
}

