package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpnTunnelCertificateRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the AWS Site-to-Site VPN connection.
    */
  var VpnConnectionId: typings.awsSdk.ec2Mod.VpnConnectionId
  
  /**
    * The external IP address of the VPN tunnel.
    */
  var VpnTunnelOutsideIpAddress: String
}
object ModifyVpnTunnelCertificateRequest {
  
  @scala.inline
  def apply(VpnConnectionId: VpnConnectionId, VpnTunnelOutsideIpAddress: String): ModifyVpnTunnelCertificateRequest = {
    val __obj = js.Dynamic.literal(VpnConnectionId = VpnConnectionId.asInstanceOf[js.Any], VpnTunnelOutsideIpAddress = VpnTunnelOutsideIpAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpnTunnelCertificateRequest]
  }
  
  @scala.inline
  implicit class ModifyVpnTunnelCertificateRequestMutableBuilder[Self <: ModifyVpnTunnelCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setVpnConnectionId(value: VpnConnectionId): Self = StObject.set(x, "VpnConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnTunnelOutsideIpAddress(value: String): Self = StObject.set(x, "VpnTunnelOutsideIpAddress", value.asInstanceOf[js.Any])
  }
}
