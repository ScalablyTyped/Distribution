package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClientVpnRouteRequest extends js.Object {
  /**
    * The ID of the Client VPN endpoint from which the route is to be deleted.
    */
  var ClientVpnEndpointId: typings.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  /**
    * The IPv4 address range, in CIDR notation, of the route to be deleted.
    */
  var DestinationCidrBlock: String = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the target subnet used by the route.
    */
  var TargetVpcSubnetId: js.UndefOr[SubnetId] = js.native
}

object DeleteClientVpnRouteRequest {
  @scala.inline
  def apply(ClientVpnEndpointId: ClientVpnEndpointId, DestinationCidrBlock: String): DeleteClientVpnRouteRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any], DestinationCidrBlock = DestinationCidrBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClientVpnRouteRequest]
  }
  @scala.inline
  implicit class DeleteClientVpnRouteRequestOps[Self <: DeleteClientVpnRouteRequest] (val x: Self) extends AnyVal {
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
    def setDestinationCidrBlock(value: String): Self = this.set("DestinationCidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setTargetVpcSubnetId(value: SubnetId): Self = this.set("TargetVpcSubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetVpcSubnetId: Self = this.set("TargetVpcSubnetId", js.undefined)
  }
  
}

