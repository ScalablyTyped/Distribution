package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFirewallRuleResponse extends StObject {
  
  /**
    * The specification for the firewall rule that you just deleted.
    */
  var FirewallRule: js.UndefOr[typings.awsSdk.route53resolverMod.FirewallRule] = js.undefined
}
object DeleteFirewallRuleResponse {
  
  inline def apply(): DeleteFirewallRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFirewallRuleResponse]
  }
  
  extension [Self <: DeleteFirewallRuleResponse](x: Self) {
    
    inline def setFirewallRule(value: FirewallRule): Self = StObject.set(x, "FirewallRule", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleUndefined: Self = StObject.set(x, "FirewallRule", js.undefined)
  }
}
