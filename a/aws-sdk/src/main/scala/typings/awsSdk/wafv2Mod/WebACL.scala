package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebACL extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
    */
  var ARN: ResourceArn = js.native
  /**
    * The web ACL capacity units (WCUs) currently being used by this web ACL.  AWS WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. AWS WAF calculates capacity differently for each rule type, to reflect the relative cost of each rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power. Rule group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule group. The WCU limit for web ACLs is 1,500. 
    */
  var Capacity: js.UndefOr[ConsumedCapacity] = js.native
  /**
    * The action to perform if none of the Rules contained in the WebACL match. 
    */
  var DefaultAction: typings.awsSdk.wafv2Mod.DefaultAction = js.native
  /**
    * A description of the Web ACL that helps with identification. You cannot change the description of a Web ACL after you create it.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  /**
    * A unique identifier for the WebACL. This ID is returned in the responses to create and list commands. You use this ID to do things like get, update, and delete a WebACL.
    */
  var Id: EntityId = js.native
  /**
    * Indicates whether this web ACL is managed by AWS Firewall Manager. If true, then only AWS Firewall Manager can delete the web ACL or any Firewall Manager rule groups in the web ACL. 
    */
  var ManagedByFirewallManager: js.UndefOr[Boolean] = js.native
  /**
    * The name of the Web ACL. You cannot change the name of a Web ACL after you create it.
    */
  var Name: EntityName = js.native
  /**
    * The last set of rules for AWS WAF to process in the web ACL. This is defined in an AWS Firewall Manager WAF policy and contains only rule group references. You can't alter these. Any rules and rule groups that you define for the web ACL are prioritized before these.  In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to run first in the web ACL and a set of rule groups to run last. Within each set, the administrator prioritizes the rule groups, to determine their relative processing order.
    */
  var PostProcessFirewallManagerRuleGroups: js.UndefOr[FirewallManagerRuleGroups] = js.native
  /**
    * The first set of rules for AWS WAF to process in the web ACL. This is defined in an AWS Firewall Manager WAF policy and contains only rule group references. You can't alter these. Any rules and rule groups that you define for the web ACL are prioritized after these.  In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to run first in the web ACL and a set of rule groups to run last. Within each set, the administrator prioritizes the rule groups, to determine their relative processing order.
    */
  var PreProcessFirewallManagerRuleGroups: js.UndefOr[FirewallManagerRuleGroups] = js.native
  /**
    * The Rule statements used to identify the web requests that you want to allow, block, or count. Each rule includes one top-level statement that AWS WAF uses to identify matching web requests, and parameters that govern how AWS WAF handles them. 
    */
  var Rules: js.UndefOr[typings.awsSdk.wafv2Mod.Rules] = js.native
  /**
    * Defines and enables Amazon CloudWatch metrics and web request sample collection. 
    */
  var VisibilityConfig: typings.awsSdk.wafv2Mod.VisibilityConfig = js.native
}

object WebACL {
  @scala.inline
  def apply(
    ARN: ResourceArn,
    DefaultAction: DefaultAction,
    Id: EntityId,
    Name: EntityName,
    VisibilityConfig: VisibilityConfig,
    Capacity: Int | Double = null,
    Description: EntityDescription = null,
    ManagedByFirewallManager: js.UndefOr[scala.Boolean] = js.undefined,
    PostProcessFirewallManagerRuleGroups: FirewallManagerRuleGroups = null,
    PreProcessFirewallManagerRuleGroups: FirewallManagerRuleGroups = null,
    Rules: Rules = null
  ): WebACL = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], DefaultAction = DefaultAction.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], VisibilityConfig = VisibilityConfig.asInstanceOf[js.Any])
    if (Capacity != null) __obj.updateDynamic("Capacity")(Capacity.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(ManagedByFirewallManager)) __obj.updateDynamic("ManagedByFirewallManager")(ManagedByFirewallManager.asInstanceOf[js.Any])
    if (PostProcessFirewallManagerRuleGroups != null) __obj.updateDynamic("PostProcessFirewallManagerRuleGroups")(PostProcessFirewallManagerRuleGroups.asInstanceOf[js.Any])
    if (PreProcessFirewallManagerRuleGroups != null) __obj.updateDynamic("PreProcessFirewallManagerRuleGroups")(PreProcessFirewallManagerRuleGroups.asInstanceOf[js.Any])
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebACL]
  }
}

