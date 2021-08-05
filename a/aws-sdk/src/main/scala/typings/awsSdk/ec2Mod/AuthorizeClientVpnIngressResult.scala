package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeClientVpnIngressResult extends StObject {
  
  /**
    * The current state of the authorization rule.
    */
  var Status: js.UndefOr[ClientVpnAuthorizationRuleStatus] = js.undefined
}
object AuthorizeClientVpnIngressResult {
  
  inline def apply(): AuthorizeClientVpnIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeClientVpnIngressResult]
  }
  
  extension [Self <: AuthorizeClientVpnIngressResult](x: Self) {
    
    inline def setStatus(value: ClientVpnAuthorizationRuleStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
