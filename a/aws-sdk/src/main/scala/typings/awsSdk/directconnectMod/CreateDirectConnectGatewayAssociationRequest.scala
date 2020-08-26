package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDirectConnectGatewayAssociationRequest extends js.Object {
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway This parameter is required when you create an association to a transit gateway. For information about how to set the prefixes, see Allowed Prefixes in the AWS Direct Connect User Guide.
    */
  var addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: DirectConnectGatewayId = js.native
  /**
    * The ID of the virtual private gateway or transit gateway.
    */
  var gatewayId: js.UndefOr[GatewayIdToAssociate] = js.native
  /**
    * The ID of the virtual private gateway.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.native
}

object CreateDirectConnectGatewayAssociationRequest {
  @scala.inline
  def apply(directConnectGatewayId: DirectConnectGatewayId): CreateDirectConnectGatewayAssociationRequest = {
    val __obj = js.Dynamic.literal(directConnectGatewayId = directConnectGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectConnectGatewayAssociationRequest]
  }
  @scala.inline
  implicit class CreateDirectConnectGatewayAssociationRequestOps[Self <: CreateDirectConnectGatewayAssociationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = this.set("directConnectGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = this.set("addAllowedPrefixesToDirectConnectGateway", js.Array(value :_*))
    @scala.inline
    def setAddAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = this.set("addAllowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddAllowedPrefixesToDirectConnectGateway: Self = this.set("addAllowedPrefixesToDirectConnectGateway", js.undefined)
    @scala.inline
    def setGatewayId(value: GatewayIdToAssociate): Self = this.set("gatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayId: Self = this.set("gatewayId", js.undefined)
    @scala.inline
    def setVirtualGatewayId(value: VirtualGatewayId): Self = this.set("virtualGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualGatewayId: Self = this.set("virtualGatewayId", js.undefined)
  }
  
}

