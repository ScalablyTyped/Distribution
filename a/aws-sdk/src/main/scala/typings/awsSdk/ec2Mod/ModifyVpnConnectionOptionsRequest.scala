package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyVpnConnectionOptionsRequest extends js.Object {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The IPv4 CIDR on the customer gateway (on-premises) side of the VPN connection. Default: 0.0.0.0/0 
    */
  var LocalIpv4NetworkCidr: js.UndefOr[String] = js.native
  
  /**
    * The IPv6 CIDR on the customer gateway (on-premises) side of the VPN connection. Default: ::/0 
    */
  var LocalIpv6NetworkCidr: js.UndefOr[String] = js.native
  
  /**
    * The IPv4 CIDR on the AWS side of the VPN connection. Default: 0.0.0.0/0 
    */
  var RemoteIpv4NetworkCidr: js.UndefOr[String] = js.native
  
  /**
    * The IPv6 CIDR on the AWS side of the VPN connection. Default: ::/0 
    */
  var RemoteIpv6NetworkCidr: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Site-to-Site VPN connection. 
    */
  var VpnConnectionId: typings.awsSdk.ec2Mod.VpnConnectionId = js.native
}
object ModifyVpnConnectionOptionsRequest {
  
  @scala.inline
  def apply(VpnConnectionId: VpnConnectionId): ModifyVpnConnectionOptionsRequest = {
    val __obj = js.Dynamic.literal(VpnConnectionId = VpnConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpnConnectionOptionsRequest]
  }
  
  @scala.inline
  implicit class ModifyVpnConnectionOptionsRequestOps[Self <: ModifyVpnConnectionOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVpnConnectionId(value: VpnConnectionId): Self = this.set("VpnConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setLocalIpv4NetworkCidr(value: String): Self = this.set("LocalIpv4NetworkCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalIpv4NetworkCidr: Self = this.set("LocalIpv4NetworkCidr", js.undefined)
    
    @scala.inline
    def setLocalIpv6NetworkCidr(value: String): Self = this.set("LocalIpv6NetworkCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalIpv6NetworkCidr: Self = this.set("LocalIpv6NetworkCidr", js.undefined)
    
    @scala.inline
    def setRemoteIpv4NetworkCidr(value: String): Self = this.set("RemoteIpv4NetworkCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteIpv4NetworkCidr: Self = this.set("RemoteIpv4NetworkCidr", js.undefined)
    
    @scala.inline
    def setRemoteIpv6NetworkCidr(value: String): Self = this.set("RemoteIpv6NetworkCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteIpv6NetworkCidr: Self = this.set("RemoteIpv6NetworkCidr", js.undefined)
  }
}
