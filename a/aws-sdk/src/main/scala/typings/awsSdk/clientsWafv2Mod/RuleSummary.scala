package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleSummary extends StObject {
  
  /**
    * The action that WAF should take on a web request when it matches a rule's statement. Settings at the web ACL level can override the rule action setting. 
    */
  var Action: js.UndefOr[RuleAction] = js.undefined
  
  /**
    * The name of the rule. 
    */
  var Name: js.UndefOr[EntityName] = js.undefined
}
object RuleSummary {
  
  inline def apply(): RuleSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleSummary]
  }
  
  extension [Self <: RuleSummary](x: Self) {
    
    inline def setAction(value: RuleAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
