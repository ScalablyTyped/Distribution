package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutFirewallRuleGroupPolicyResponse extends StObject {
  
  /**
    * 
    */
  var ReturnValue: js.UndefOr[Boolean] = js.undefined
}
object PutFirewallRuleGroupPolicyResponse {
  
  inline def apply(): PutFirewallRuleGroupPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutFirewallRuleGroupPolicyResponse]
  }
  
  extension [Self <: PutFirewallRuleGroupPolicyResponse](x: Self) {
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "ReturnValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValueUndefined: Self = StObject.set(x, "ReturnValue", js.undefined)
  }
}
