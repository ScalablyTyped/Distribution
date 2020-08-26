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
  def apply(VpnConnectionId: VpnConnectionId, VpnTunnelOutsideIpAddress: String): ModifyVpnTunnelCertificateRequest = {
    val __obj = js.Dynamic.literal(VpnConnectionId = VpnConnectionId.asInstanceOf[js.Any], VpnTunnelOutsideIpAddress = VpnTunnelOutsideIpAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpnTunnelCertificateRequest]
  }
  @scala.inline
  implicit class ModifyVpnTunnelCertificateRequestOps[Self <: ModifyVpnTunnelCertificateRequest] (val x: Self) extends AnyVal {
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
    def setVpnTunnelOutsideIpAddress(value: String): Self = this.set("VpnTunnelOutsideIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
  
}

