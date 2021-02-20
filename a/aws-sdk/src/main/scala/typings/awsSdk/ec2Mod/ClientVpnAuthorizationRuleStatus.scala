package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientVpnAuthorizationRuleStatus extends StObject {
  
  /**
    * The state of the authorization rule.
    */
  var Code: js.UndefOr[ClientVpnAuthorizationRuleStatusCode] = js.native
  
  /**
    * A message about the status of the authorization rule, if applicable.
    */
  var Message: js.UndefOr[String] = js.native
}
object ClientVpnAuthorizationRuleStatus {
  
  @scala.inline
  def apply(): ClientVpnAuthorizationRuleStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnAuthorizationRuleStatus]
  }
  
  @scala.inline
  implicit class ClientVpnAuthorizationRuleStatusMutableBuilder[Self <: ClientVpnAuthorizationRuleStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: ClientVpnAuthorizationRuleStatusCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
