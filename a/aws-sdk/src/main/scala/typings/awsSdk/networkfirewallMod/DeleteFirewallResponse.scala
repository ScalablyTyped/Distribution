package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFirewallResponse extends js.Object {
  
  var Firewall: js.UndefOr[typings.awsSdk.networkfirewallMod.Firewall] = js.native
  
  var FirewallStatus: js.UndefOr[typings.awsSdk.networkfirewallMod.FirewallStatus] = js.native
}
object DeleteFirewallResponse {
  
  @scala.inline
  def apply(): DeleteFirewallResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFirewallResponse]
  }
  
  @scala.inline
  implicit class DeleteFirewallResponseOps[Self <: DeleteFirewallResponse] (val x: Self) extends AnyVal {
    
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
    def setFirewall(value: Firewall): Self = this.set("Firewall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirewall: Self = this.set("Firewall", js.undefined)
    
    @scala.inline
    def setFirewallStatus(value: FirewallStatus): Self = this.set("FirewallStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirewallStatus: Self = this.set("FirewallStatus", js.undefined)
  }
}
