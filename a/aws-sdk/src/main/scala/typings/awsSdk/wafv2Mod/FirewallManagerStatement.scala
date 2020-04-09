package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirewallManagerStatement extends js.Object {
  var ManagedRuleGroupStatement: js.UndefOr[typings.awsSdk.wafv2Mod.ManagedRuleGroupStatement] = js.native
  var RuleGroupReferenceStatement: js.UndefOr[typings.awsSdk.wafv2Mod.RuleGroupReferenceStatement] = js.native
}

object FirewallManagerStatement {
  @scala.inline
  def apply(
    ManagedRuleGroupStatement: ManagedRuleGroupStatement = null,
    RuleGroupReferenceStatement: RuleGroupReferenceStatement = null
  ): FirewallManagerStatement = {
    val __obj = js.Dynamic.literal()
    if (ManagedRuleGroupStatement != null) __obj.updateDynamic("ManagedRuleGroupStatement")(ManagedRuleGroupStatement.asInstanceOf[js.Any])
    if (RuleGroupReferenceStatement != null) __obj.updateDynamic("RuleGroupReferenceStatement")(RuleGroupReferenceStatement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallManagerStatement]
  }
}

