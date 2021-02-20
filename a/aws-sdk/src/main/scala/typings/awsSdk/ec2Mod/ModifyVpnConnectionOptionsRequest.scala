package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyVpnConnectionOptionsRequest extends StObject {
  
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
  implicit class ModifyVpnConnectionOptionsRequestMutableBuilder[Self <: ModifyVpnConnectionOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setLocalIpv4NetworkCidr(value: String): Self = StObject.set(x, "LocalIpv4NetworkCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalIpv4NetworkCidrUndefined: Self = StObject.set(x, "LocalIpv4NetworkCidr", js.undefined)
    
    @scala.inline
    def setLocalIpv6NetworkCidr(value: String): Self = StObject.set(x, "LocalIpv6NetworkCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalIpv6NetworkCidrUndefined: Self = StObject.set(x, "LocalIpv6NetworkCidr", js.undefined)
    
    @scala.inline
    def setRemoteIpv4NetworkCidr(value: String): Self = StObject.set(x, "RemoteIpv4NetworkCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteIpv4NetworkCidrUndefined: Self = StObject.set(x, "RemoteIpv4NetworkCidr", js.undefined)
    
    @scala.inline
    def setRemoteIpv6NetworkCidr(value: String): Self = StObject.set(x, "RemoteIpv6NetworkCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteIpv6NetworkCidrUndefined: Self = StObject.set(x, "RemoteIpv6NetworkCidr", js.undefined)
    
    @scala.inline
    def setVpnConnectionId(value: VpnConnectionId): Self = StObject.set(x, "VpnConnectionId", value.asInstanceOf[js.Any])
  }
}
