package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFirewallResponse extends js.Object {
  
  /**
    * The configuration settings for the firewall. These settings include the firewall policy and the subnets in your VPC to use for the firewall endpoints. 
    */
  var Firewall: js.UndefOr[typings.awsSdk.networkfirewallMod.Firewall] = js.native
  
  /**
    * Detailed information about the current status of a Firewall. You can retrieve this for a firewall by calling DescribeFirewall and providing the firewall name and ARN.
    */
  var FirewallStatus: js.UndefOr[typings.awsSdk.networkfirewallMod.FirewallStatus] = js.native
}
object CreateFirewallResponse {
  
  @scala.inline
  def apply(): CreateFirewallResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFirewallResponse]
  }
  
  @scala.inline
  implicit class CreateFirewallResponseOps[Self <: CreateFirewallResponse] (val x: Self) extends AnyVal {
    
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
