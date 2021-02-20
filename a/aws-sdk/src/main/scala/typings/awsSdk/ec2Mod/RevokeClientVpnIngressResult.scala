package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeClientVpnIngressResult extends StObject {
  
  /**
    * The current state of the authorization rule.
    */
  var Status: js.UndefOr[ClientVpnAuthorizationRuleStatus] = js.native
}
object RevokeClientVpnIngressResult {
  
  @scala.inline
  def apply(): RevokeClientVpnIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeClientVpnIngressResult]
  }
  
  @scala.inline
  implicit class RevokeClientVpnIngressResultMutableBuilder[Self <: RevokeClientVpnIngressResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: ClientVpnAuthorizationRuleStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
