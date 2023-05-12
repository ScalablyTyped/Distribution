package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedRuleGroupStatement extends StObject {
  
  /**
    * Rules in the referenced rule group whose actions are set to Count.   Instead of this option, use RuleActionOverrides. It accepts any valid action setting, including Count. 
    */
  var ExcludedRules: js.UndefOr[typings.awsSdk.clientsWafv2Mod.ExcludedRules] = js.undefined
  
  /**
    * Additional information that's used by a managed rule group. Many managed rule groups don't require this. Use the AWSManagedRulesATPRuleSet configuration object for the account takeover prevention managed rule group, to provide information such as the sign-in page of your application and the type of content to accept or reject from the client.  Use the AWSManagedRulesBotControlRuleSet configuration object to configure the protection level that you want the Bot Control rule group to use. 
    */
  var ManagedRuleGroupConfigs: js.UndefOr[typings.awsSdk.clientsWafv2Mod.ManagedRuleGroupConfigs] = js.undefined
  
  /**
    * The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
    */
  var Name: EntityName
  
  /**
    * Action settings to use in the place of the rule actions that are configured inside the rule group. You specify one override for each rule whose action you want to change.  You can use overrides for testing, for example you can override all of rule actions to Count and then monitor the resulting count metrics to understand how the rule group would handle your web traffic. You can also permanently override some or all actions, to modify how the rule group manages your web traffic.
    */
  var RuleActionOverrides: js.UndefOr[typings.awsSdk.clientsWafv2Mod.RuleActionOverrides] = js.undefined
  
  /**
    * An optional nested statement that narrows the scope of the web requests that are evaluated by the managed rule group. Requests are only evaluated by the rule group if they match the scope-down statement. You can use any nestable Statement in the scope-down statement, and you can nest statements at any level, the same as you can for a rule statement. 
    */
  var ScopeDownStatement: js.UndefOr[Statement] = js.undefined
  
  /**
    * The name of the managed rule group vendor. You use this, along with the rule group name, to identify the rule group.
    */
  var VendorName: typings.awsSdk.clientsWafv2Mod.VendorName
  
  /**
    * The version of the managed rule group to use. If you specify this, the version setting is fixed until you change it. If you don't specify this, WAF uses the vendor's default version, and then keeps the version at the vendor's default when the vendor updates the managed rule group settings. 
    */
  var Version: js.UndefOr[VersionKeyString] = js.undefined
}
object ManagedRuleGroupStatement {
  
  inline def apply(Name: EntityName, VendorName: VendorName): ManagedRuleGroupStatement = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], VendorName = VendorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedRuleGroupStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManagedRuleGroupStatement] (val x: Self) extends AnyVal {
    
    inline def setExcludedRules(value: ExcludedRules): Self = StObject.set(x, "ExcludedRules", value.asInstanceOf[js.Any])
    
    inline def setExcludedRulesUndefined: Self = StObject.set(x, "ExcludedRules", js.undefined)
    
    inline def setExcludedRulesVarargs(value: ExcludedRule*): Self = StObject.set(x, "ExcludedRules", js.Array(value*))
    
    inline def setManagedRuleGroupConfigs(value: ManagedRuleGroupConfigs): Self = StObject.set(x, "ManagedRuleGroupConfigs", value.asInstanceOf[js.Any])
    
    inline def setManagedRuleGroupConfigsUndefined: Self = StObject.set(x, "ManagedRuleGroupConfigs", js.undefined)
    
    inline def setManagedRuleGroupConfigsVarargs(value: ManagedRuleGroupConfig*): Self = StObject.set(x, "ManagedRuleGroupConfigs", js.Array(value*))
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRuleActionOverrides(value: RuleActionOverrides): Self = StObject.set(x, "RuleActionOverrides", value.asInstanceOf[js.Any])
    
    inline def setRuleActionOverridesUndefined: Self = StObject.set(x, "RuleActionOverrides", js.undefined)
    
    inline def setRuleActionOverridesVarargs(value: RuleActionOverride*): Self = StObject.set(x, "RuleActionOverrides", js.Array(value*))
    
    inline def setScopeDownStatement(value: Statement): Self = StObject.set(x, "ScopeDownStatement", value.asInstanceOf[js.Any])
    
    inline def setScopeDownStatementUndefined: Self = StObject.set(x, "ScopeDownStatement", js.undefined)
    
    inline def setVendorName(value: VendorName): Self = StObject.set(x, "VendorName", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionKeyString): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
