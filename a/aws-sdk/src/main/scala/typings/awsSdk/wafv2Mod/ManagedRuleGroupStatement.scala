package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedRuleGroupStatement extends StObject {
  
  /**
    * The rules in the referenced rule group whose actions are set to Count. When you exclude a rule, WAF evaluates it exactly as it would if the rule action setting were Count. This is a useful option for testing the rules in a rule group without modifying how they handle your web traffic.
    */
  var ExcludedRules: js.UndefOr[typings.awsSdk.wafv2Mod.ExcludedRules] = js.undefined
  
  /**
    * Additional information that's used by a managed rule group. Most managed rule groups don't require this. Use this for the account takeover prevention managed rule group AWSManagedRulesATPRuleSet, to provide information about the sign-in page of your application.  You can provide multiple individual ManagedRuleGroupConfig objects for any rule group configuration, for example UsernameField and PasswordField. The configuration that you provide depends on the needs of the managed rule group. For the ATP managed rule group, you provide the following individual configuration objects: LoginPath, PasswordField, PayloadType and UsernameField.
    */
  var ManagedRuleGroupConfigs: js.UndefOr[typings.awsSdk.wafv2Mod.ManagedRuleGroupConfigs] = js.undefined
  
  /**
    * The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
    */
  var Name: EntityName
  
  /**
    * An optional nested statement that narrows the scope of the web requests that are evaluated by the managed rule group. Requests are only evaluated by the rule group if they match the scope-down statement. You can use any nestable Statement in the scope-down statement, and you can nest statements at any level, the same as you can for a rule statement. 
    */
  var ScopeDownStatement: js.UndefOr[Statement] = js.undefined
  
  /**
    * The name of the managed rule group vendor. You use this, along with the rule group name, to identify the rule group.
    */
  var VendorName: typings.awsSdk.wafv2Mod.VendorName
  
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
  
  extension [Self <: ManagedRuleGroupStatement](x: Self) {
    
    inline def setExcludedRules(value: ExcludedRules): Self = StObject.set(x, "ExcludedRules", value.asInstanceOf[js.Any])
    
    inline def setExcludedRulesUndefined: Self = StObject.set(x, "ExcludedRules", js.undefined)
    
    inline def setExcludedRulesVarargs(value: ExcludedRule*): Self = StObject.set(x, "ExcludedRules", js.Array(value*))
    
    inline def setManagedRuleGroupConfigs(value: ManagedRuleGroupConfigs): Self = StObject.set(x, "ManagedRuleGroupConfigs", value.asInstanceOf[js.Any])
    
    inline def setManagedRuleGroupConfigsUndefined: Self = StObject.set(x, "ManagedRuleGroupConfigs", js.undefined)
    
    inline def setManagedRuleGroupConfigsVarargs(value: ManagedRuleGroupConfig*): Self = StObject.set(x, "ManagedRuleGroupConfigs", js.Array(value*))
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setScopeDownStatement(value: Statement): Self = StObject.set(x, "ScopeDownStatement", value.asInstanceOf[js.Any])
    
    inline def setScopeDownStatementUndefined: Self = StObject.set(x, "ScopeDownStatement", js.undefined)
    
    inline def setVendorName(value: VendorName): Self = StObject.set(x, "VendorName", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionKeyString): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
