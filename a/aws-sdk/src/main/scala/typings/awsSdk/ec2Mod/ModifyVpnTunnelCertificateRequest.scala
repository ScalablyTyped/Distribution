package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpnTunnelCertificateRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the AWS Site-to-Site VPN connection.
    */
  var VpnConnectionId: typings.awsSdk.ec2Mod.VpnConnectionId = js.native
  /**
    * The external IP address of the VPN tunnel.
    */
  var VpnTunnelOutsideIpAddress: String = js.native
}

object ModifyVpnTunnelCertificateRequest {
  @scala.inline
  def apply(
    VpnConnectionId: VpnConnectionId,
    VpnTunnelOutsideIpAddress: String,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): ModifyVpnTunnelCertificateRequest = {
    val __obj = js.Dynamic.literal(VpnConnectionId = VpnConnectionId.asInstanceOf[js.Any], VpnTunnelOutsideIpAddress = VpnTunnelOutsideIpAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpnTunnelCertificateRequest]
  }
}

