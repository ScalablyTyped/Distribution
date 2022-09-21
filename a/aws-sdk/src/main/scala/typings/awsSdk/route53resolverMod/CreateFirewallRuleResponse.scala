package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFirewallRuleResponse extends StObject {
  
  /**
    * The firewall rule that you just created. 
    */
  var FirewallRule: js.UndefOr[typings.awsSdk.route53resolverMod.FirewallRule] = js.undefined
}
object CreateFirewallRuleResponse {
  
  inline def apply(): CreateFirewallRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFirewallRuleResponse]
  }
  
  extension [Self <: CreateFirewallRuleResponse](x: Self) {
    
    inline def setFirewallRule(value: FirewallRule): Self = StObject.set(x, "FirewallRule", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleUndefined: Self = StObject.set(x, "FirewallRule", js.undefined)
  }
}
