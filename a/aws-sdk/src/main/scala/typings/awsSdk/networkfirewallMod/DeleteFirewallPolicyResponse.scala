package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFirewallPolicyResponse extends js.Object {
  
  /**
    * The object containing the definition of the FirewallPolicyResponse that you asked to delete. 
    */
  var FirewallPolicyResponse: typings.awsSdk.networkfirewallMod.FirewallPolicyResponse = js.native
}
object DeleteFirewallPolicyResponse {
  
  @scala.inline
  def apply(FirewallPolicyResponse: FirewallPolicyResponse): DeleteFirewallPolicyResponse = {
    val __obj = js.Dynamic.literal(FirewallPolicyResponse = FirewallPolicyResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFirewallPolicyResponse]
  }
  
  @scala.inline
  implicit class DeleteFirewallPolicyResponseOps[Self <: DeleteFirewallPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFirewallPolicyResponse(value: FirewallPolicyResponse): Self = this.set("FirewallPolicyResponse", value.asInstanceOf[js.Any])
  }
}
