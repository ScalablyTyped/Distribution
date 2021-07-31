package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFirewallPolicyResponse extends StObject {
  
  /**
    * The object containing the definition of the FirewallPolicyResponse that you asked to delete. 
    */
  var FirewallPolicyResponse: typings.awsSdk.networkfirewallMod.FirewallPolicyResponse
}
object DeleteFirewallPolicyResponse {
  
  @scala.inline
  def apply(FirewallPolicyResponse: FirewallPolicyResponse): DeleteFirewallPolicyResponse = {
    val __obj = js.Dynamic.literal(FirewallPolicyResponse = FirewallPolicyResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFirewallPolicyResponse]
  }
  
  @scala.inline
  implicit class DeleteFirewallPolicyResponseMutableBuilder[Self <: DeleteFirewallPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirewallPolicyResponse(value: FirewallPolicyResponse): Self = StObject.set(x, "FirewallPolicyResponse", value.asInstanceOf[js.Any])
  }
}
