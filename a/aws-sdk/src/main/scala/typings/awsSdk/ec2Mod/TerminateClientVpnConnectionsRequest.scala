package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateClientVpnConnectionsRequest extends js.Object {
  /**
    * The ID of the Client VPN endpoint to which the client is connected.
    */
  var ClientVpnEndpointId: typings.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  /**
    * The ID of the client connection to be terminated.
    */
  var ConnectionId: js.UndefOr[VpnConnectionId] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The name of the user who initiated the connection. Use this option to terminate all active connections for the specified user. This option can only be used if the user has established up to five connections.
    */
  var Username: js.UndefOr[String] = js.native
}

object TerminateClientVpnConnectionsRequest {
  @scala.inline
  def apply(ClientVpnEndpointId: ClientVpnEndpointId): TerminateClientVpnConnectionsRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateClientVpnConnectionsRequest]
  }
  @scala.inline
  implicit class TerminateClientVpnConnectionsRequestOps[Self <: TerminateClientVpnConnectionsRequest] (val x: Self) extends AnyVal {
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
    def setClientVpnEndpointId(value: ClientVpnEndpointId): Self = this.set("ClientVpnEndpointId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionId(value: VpnConnectionId): Self = this.set("ConnectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionId: Self = this.set("ConnectionId", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("Username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
  
}

