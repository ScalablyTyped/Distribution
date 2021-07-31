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
  
  @scala.inline
  def apply(): AuthorizeClientVpnIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeClientVpnIngressResult]
  }
  
  @scala.inline
  implicit class AuthorizeClientVpnIngressResultMutableBuilder[Self <: AuthorizeClientVpnIngressResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: ClientVpnAuthorizationRuleStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
