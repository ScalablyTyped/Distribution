package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyVpnTunnelOptionsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The tunnel options to modify.
    */
  var TunnelOptions: ModifyVpnTunnelOptionsSpecification = js.native
  
  /**
    * The ID of the AWS Site-to-Site VPN connection.
    */
  var VpnConnectionId: typings.awsSdk.ec2Mod.VpnConnectionId = js.native
  
  /**
    * The external IP address of the VPN tunnel.
    */
  var VpnTunnelOutsideIpAddress: String = js.native
}
object ModifyVpnTunnelOptionsRequest {
  
  @scala.inline
  def apply(
    TunnelOptions: ModifyVpnTunnelOptionsSpecification,
    VpnConnectionId: VpnConnectionId,
    VpnTunnelOutsideIpAddress: String
  ): ModifyVpnTunnelOptionsRequest = {
    val __obj = js.Dynamic.literal(TunnelOptions = TunnelOptions.asInstanceOf[js.Any], VpnConnectionId = VpnConnectionId.asInstanceOf[js.Any], VpnTunnelOutsideIpAddress = VpnTunnelOutsideIpAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpnTunnelOptionsRequest]
  }
  
  @scala.inline
  implicit class ModifyVpnTunnelOptionsRequestMutableBuilder[Self <: ModifyVpnTunnelOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setTunnelOptions(value: ModifyVpnTunnelOptionsSpecification): Self = StObject.set(x, "TunnelOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnConnectionId(value: VpnConnectionId): Self = StObject.set(x, "VpnConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnTunnelOutsideIpAddress(value: String): Self = StObject.set(x, "VpnTunnelOutsideIpAddress", value.asInstanceOf[js.Any])
  }
}
