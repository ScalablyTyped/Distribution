package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpnConnectionOptionsSpecification extends StObject {
  
  /**
    * Indicate whether to enable acceleration for the VPN connection. Default: false 
    */
  var EnableAcceleration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IPv4 CIDR on the customer gateway (on-premises) side of the VPN connection. Default: 0.0.0.0/0 
    */
  var LocalIpv4NetworkCidr: js.UndefOr[String] = js.undefined
  
  /**
    * The IPv6 CIDR on the customer gateway (on-premises) side of the VPN connection. Default: ::/0 
    */
  var LocalIpv6NetworkCidr: js.UndefOr[String] = js.undefined
  
  /**
    * The IPv4 CIDR on the AWS side of the VPN connection. Default: 0.0.0.0/0 
    */
  var RemoteIpv4NetworkCidr: js.UndefOr[String] = js.undefined
  
  /**
    * The IPv6 CIDR on the AWS side of the VPN connection. Default: ::/0 
    */
  var RemoteIpv6NetworkCidr: js.UndefOr[String] = js.undefined
  
  /**
    * Indicate whether the VPN connection uses static routes only. If you are creating a VPN connection for a device that does not support BGP, you must specify true. Use CreateVpnConnectionRoute to create a static route. Default: false 
    */
  var StaticRoutesOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicate whether the VPN tunnels process IPv4 or IPv6 traffic. Default: ipv4 
    */
  var TunnelInsideIpVersion: js.UndefOr[typings.awsSdk.ec2Mod.TunnelInsideIpVersion] = js.undefined
  
  /**
    * The tunnel options for the VPN connection.
    */
  var TunnelOptions: js.UndefOr[VpnTunnelOptionsSpecificationsList] = js.undefined
}
object VpnConnectionOptionsSpecification {
  
  inline def apply(): VpnConnectionOptionsSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnConnectionOptionsSpecification]
  }
  
  extension [Self <: VpnConnectionOptionsSpecification](x: Self) {
    
    inline def setEnableAcceleration(value: Boolean): Self = StObject.set(x, "EnableAcceleration", value.asInstanceOf[js.Any])
    
    inline def setEnableAccelerationUndefined: Self = StObject.set(x, "EnableAcceleration", js.undefined)
    
    inline def setLocalIpv4NetworkCidr(value: String): Self = StObject.set(x, "LocalIpv4NetworkCidr", value.asInstanceOf[js.Any])
    
    inline def setLocalIpv4NetworkCidrUndefined: Self = StObject.set(x, "LocalIpv4NetworkCidr", js.undefined)
    
    inline def setLocalIpv6NetworkCidr(value: String): Self = StObject.set(x, "LocalIpv6NetworkCidr", value.asInstanceOf[js.Any])
    
    inline def setLocalIpv6NetworkCidrUndefined: Self = StObject.set(x, "LocalIpv6NetworkCidr", js.undefined)
    
    inline def setRemoteIpv4NetworkCidr(value: String): Self = StObject.set(x, "RemoteIpv4NetworkCidr", value.asInstanceOf[js.Any])
    
    inline def setRemoteIpv4NetworkCidrUndefined: Self = StObject.set(x, "RemoteIpv4NetworkCidr", js.undefined)
    
    inline def setRemoteIpv6NetworkCidr(value: String): Self = StObject.set(x, "RemoteIpv6NetworkCidr", value.asInstanceOf[js.Any])
    
    inline def setRemoteIpv6NetworkCidrUndefined: Self = StObject.set(x, "RemoteIpv6NetworkCidr", js.undefined)
    
    inline def setStaticRoutesOnly(value: Boolean): Self = StObject.set(x, "StaticRoutesOnly", value.asInstanceOf[js.Any])
    
    inline def setStaticRoutesOnlyUndefined: Self = StObject.set(x, "StaticRoutesOnly", js.undefined)
    
    inline def setTunnelInsideIpVersion(value: TunnelInsideIpVersion): Self = StObject.set(x, "TunnelInsideIpVersion", value.asInstanceOf[js.Any])
    
    inline def setTunnelInsideIpVersionUndefined: Self = StObject.set(x, "TunnelInsideIpVersion", js.undefined)
    
    inline def setTunnelOptions(value: VpnTunnelOptionsSpecificationsList): Self = StObject.set(x, "TunnelOptions", value.asInstanceOf[js.Any])
    
    inline def setTunnelOptionsUndefined: Self = StObject.set(x, "TunnelOptions", js.undefined)
    
    inline def setTunnelOptionsVarargs(value: VpnTunnelOptionsSpecification*): Self = StObject.set(x, "TunnelOptions", js.Array(value :_*))
  }
}
