package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateClientVpnTargetNetworkRequest extends js.Object {
  /**
    * The ID of the target network association.
    */
  var AssociationId: ClientVpnAssociationId = js.native
  /**
    * The ID of the Client VPN endpoint from which to disassociate the target network.
    */
  var ClientVpnEndpointId: typings.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}

object DisassociateClientVpnTargetNetworkRequest {
  @scala.inline
  def apply(AssociationId: ClientVpnAssociationId, ClientVpnEndpointId: ClientVpnEndpointId): DisassociateClientVpnTargetNetworkRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateClientVpnTargetNetworkRequest]
  }
  @scala.inline
  implicit class DisassociateClientVpnTargetNetworkRequestOps[Self <: DisassociateClientVpnTargetNetworkRequest] (val x: Self) extends AnyVal {
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
    def setAssociationId(value: ClientVpnAssociationId): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientVpnEndpointId(value: ClientVpnEndpointId): Self = this.set("ClientVpnEndpointId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
  
}

