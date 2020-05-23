package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends js.Object {
  /**
    * The actions. Each rule must include exactly one of the following types of actions: forward, redirect, or fixed-response, and it must be the last action to be performed.
    */
  var Actions: js.UndefOr[typings.awsSdk.elbv2Mod.Actions] = js.native
  /**
    * The conditions. Each rule can include zero or one of the following conditions: http-request-method, host-header, path-pattern, and source-ip, and zero or more of the following conditions: http-header and query-string.
    */
  var Conditions: js.UndefOr[RuleConditionList] = js.native
  /**
    * Indicates whether this is the default rule.
    */
  var IsDefault: js.UndefOr[typings.awsSdk.elbv2Mod.IsDefault] = js.native
  /**
    * The priority.
    */
  var Priority: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: js.UndefOr[typings.awsSdk.elbv2Mod.RuleArn] = js.native
}

object Rule {
  @scala.inline
  def apply(
    Actions: Actions = null,
    Conditions: RuleConditionList = null,
    IsDefault: js.UndefOr[IsDefault] = js.undefined,
    Priority: String = null,
    RuleArn: RuleArn = null
  ): Rule = {
    val __obj = js.Dynamic.literal()
    if (Actions != null) __obj.updateDynamic("Actions")(Actions.asInstanceOf[js.Any])
    if (Conditions != null) __obj.updateDynamic("Conditions")(Conditions.asInstanceOf[js.Any])
    if (!js.isUndefined(IsDefault)) __obj.updateDynamic("IsDefault")(IsDefault.get.asInstanceOf[js.Any])
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (RuleArn != null) __obj.updateDynamic("RuleArn")(RuleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
}

