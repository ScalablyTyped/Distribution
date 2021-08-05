package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedRuleGroupStatement extends StObject {
  
  /**
    * The rules whose actions are set to COUNT by the web ACL, regardless of the action that is set on the rule. This effectively excludes the rule from acting on web requests. 
    */
  var ExcludedRules: js.UndefOr[typings.awsSdk.wafv2Mod.ExcludedRules] = js.undefined
  
  /**
    * The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
    */
  var Name: EntityName
  
  /**
    * The name of the managed rule group vendor. You use this, along with the rule group name, to identify the rule group.
    */
  var VendorName: typings.awsSdk.wafv2Mod.VendorName
}
object ManagedRuleGroupStatement {
  
  inline def apply(Name: EntityName, VendorName: VendorName): ManagedRuleGroupStatement = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], VendorName = VendorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedRuleGroupStatement]
  }
  
  extension [Self <: ManagedRuleGroupStatement](x: Self) {
    
    inline def setExcludedRules(value: ExcludedRules): Self = StObject.set(x, "ExcludedRules", value.asInstanceOf[js.Any])
    
    inline def setExcludedRulesUndefined: Self = StObject.set(x, "ExcludedRules", js.undefined)
    
    inline def setExcludedRulesVarargs(value: ExcludedRule*): Self = StObject.set(x, "ExcludedRules", js.Array(value :_*))
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setVendorName(value: VendorName): Self = StObject.set(x, "VendorName", value.asInstanceOf[js.Any])
  }
}
