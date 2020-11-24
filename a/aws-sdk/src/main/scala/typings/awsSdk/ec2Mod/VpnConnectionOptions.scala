package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnConnectionOptions extends js.Object {
  
  /**
    * Indicates whether acceleration is enabled for the VPN connection.
    */
  var EnableAcceleration: js.UndefOr[Boolean] = js.native
  
  /**
    * The IPv4 CIDR on the customer gateway (on-premises) side of the VPN connection.
    */
  var LocalIpv4NetworkCidr: js.UndefOr[String] = js.native
  
  /**
    * The IPv6 CIDR on the customer gateway (on-premises) side of the VPN connection.
    */
  var LocalIpv6NetworkCidr: js.UndefOr[String] = js.native
  
  /**
    * The IPv4 CIDR on the AWS side of the VPN connection.
    */
  var RemoteIpv4NetworkCidr: js.UndefOr[String] = js.native
  
  /**
    * The IPv6 CIDR on the AWS side of the VPN connection.
    */
  var RemoteIpv6NetworkCidr: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the VPN connection uses static routes only. Static routes must be used for devices that don't support BGP.
    */
  var StaticRoutesOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the VPN tunnels process IPv4 or IPv6 traffic.
    */
  var TunnelInsideIpVersion: js.UndefOr[typings.awsSdk.ec2Mod.TunnelInsideIpVersion] = js.native
  
  /**
    * Indicates the VPN tunnel options.
    */
  var TunnelOptions: js.UndefOr[TunnelOptionsList] = js.native
}
object VpnConnectionOptions {
  
  @scala.inline
  def apply(): VpnConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnConnectionOptions]
  }
  
  @scala.inline
  implicit class VpnConnectionOptionsOps[Self <: VpnConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setTunnelOptionsVarargs(value: TunnelOption*): Self = this.set("TunnelOptions", js.Array(value :_*))
    
    @scala.inline
    def setTunnelOptions(value: TunnelOptionsList): Self = this.set("TunnelOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTunnelOptions: Self = this.set("TunnelOptions", js.undefined)
  }
}
