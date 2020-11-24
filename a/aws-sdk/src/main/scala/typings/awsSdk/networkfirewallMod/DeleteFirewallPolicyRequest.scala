package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFirewallPolicyRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the firewall policy. You must specify the ARN or the name, and you can specify both. 
    */
  var FirewallPolicyArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it. You must specify the ARN or the name, and you can specify both. 
    */
  var FirewallPolicyName: js.UndefOr[ResourceName] = js.native
}
object DeleteFirewallPolicyRequest {
  
  @scala.inline
  def apply(): DeleteFirewallPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFirewallPolicyRequest]
  }
  
  @scala.inline
  implicit class DeleteFirewallPolicyRequestOps[Self <: DeleteFirewallPolicyRequest] (val x: Self) extends AnyVal {
    
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
    def setFirewallPolicyArn(value: ResourceArn): Self = this.set("FirewallPolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirewallPolicyArn: Self = this.set("FirewallPolicyArn", js.undefined)
    
    @scala.inline
    def setFirewallPolicyName(value: ResourceName): Self = this.set("FirewallPolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirewallPolicyName: Self = this.set("FirewallPolicyName", js.undefined)
  }
}
