package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnConnectionOptionsSpecification extends js.Object {
  
  /**
    * Indicate whether to enable acceleration for the VPN connection. Default: false 
    */
  var EnableAcceleration: js.UndefOr[Boolean] = js.native
  
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
    * Indicate whether the VPN connection uses static routes only. If you are creating a VPN connection for a device that does not support BGP, you must specify true. Use CreateVpnConnectionRoute to create a static route. Default: false 
    */
  var StaticRoutesOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicate whether the VPN tunnels process IPv4 or IPv6 traffic. Default: ipv4 
    */
  var TunnelInsideIpVersion: js.UndefOr[typings.awsSdk.ec2Mod.TunnelInsideIpVersion] = js.native
  
  /**
    * The tunnel options for the VPN connection.
    */
  var TunnelOptions: js.UndefOr[VpnTunnelOptionsSpecificationsList] = js.native
}
object VpnConnectionOptionsSpecification {
  
  @scala.inline
  def apply(): VpnConnectionOptionsSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnConnectionOptionsSpecification]
  }
  
  @scala.inline
  implicit class VpnConnectionOptionsSpecificationOps[Self <: VpnConnectionOptionsSpecification] (val x: Self) extends AnyVal {
    
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
    def setEnableAcceleration(value: Boolean): Self = this.set("EnableAcceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAcceleration: Self = this.set("EnableAcceleration", js.undefined)
    
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
    
    @scala.inline
    def setStaticRoutesOnly(value: Boolean): Self = this.set("StaticRoutesOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticRoutesOnly: Self = this.set("StaticRoutesOnly", js.undefined)
    
    @scala.inline
    def setTunnelInsideIpVersion(value: TunnelInsideIpVersion): Self = this.set("TunnelInsideIpVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTunnelInsideIpVersion: Self = this.set("TunnelInsideIpVersion", js.undefined)
    
    @scala.inline
    def setTunnelOptionsVarargs(value: VpnTunnelOptionsSpecification*): Self = this.set("TunnelOptions", js.Array(value :_*))
    
    @scala.inline
    def setTunnelOptions(value: VpnTunnelOptionsSpecificationsList): Self = this.set("TunnelOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTunnelOptions: Self = this.set("TunnelOptions", js.undefined)
  }
}
