package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpnTunnelOptionsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The tunnel options to modify.
    */
  var TunnelOptions: ModifyVpnTunnelOptionsSpecification
  
  /**
    * The ID of the Amazon Web Services Site-to-Site VPN connection.
    */
  var VpnConnectionId: typings.awsSdk.ec2Mod.VpnConnectionId
  
  /**
    * The external IP address of the VPN tunnel.
    */
  var VpnTunnelOutsideIpAddress: String
}
object ModifyVpnTunnelOptionsRequest {
  
  inline def apply(
    TunnelOptions: ModifyVpnTunnelOptionsSpecification,
    VpnConnectionId: VpnConnectionId,
    VpnTunnelOutsideIpAddress: String
  ): ModifyVpnTunnelOptionsRequest = {
    val __obj = js.Dynamic.literal(TunnelOptions = TunnelOptions.asInstanceOf[js.Any], VpnConnectionId = VpnConnectionId.asInstanceOf[js.Any], VpnTunnelOutsideIpAddress = VpnTunnelOutsideIpAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpnTunnelOptionsRequest]
  }
  
  extension [Self <: ModifyVpnTunnelOptionsRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setTunnelOptions(value: ModifyVpnTunnelOptionsSpecification): Self = StObject.set(x, "TunnelOptions", value.asInstanceOf[js.Any])
    
    inline def setVpnConnectionId(value: VpnConnectionId): Self = StObject.set(x, "VpnConnectionId", value.asInstanceOf[js.Any])
    
    inline def setVpnTunnelOutsideIpAddress(value: String): Self = StObject.set(x, "VpnTunnelOutsideIpAddress", value.asInstanceOf[js.Any])
  }
}
