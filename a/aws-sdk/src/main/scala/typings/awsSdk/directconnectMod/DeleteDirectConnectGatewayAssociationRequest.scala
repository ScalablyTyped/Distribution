package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDirectConnectGatewayAssociationRequest extends js.Object {
  /**
    * The ID of the Direct Connect gateway association.
    */
  var associationId: js.UndefOr[DirectConnectGatewayAssociationId] = js.native
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.native
  /**
    * The ID of the virtual private gateway.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.native
}

object DeleteDirectConnectGatewayAssociationRequest {
  @scala.inline
  def apply(): DeleteDirectConnectGatewayAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationRequest]
  }
  @scala.inline
  implicit class DeleteDirectConnectGatewayAssociationRequestOps[Self <: DeleteDirectConnectGatewayAssociationRequest] (val x: Self) extends AnyVal {
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
    def setAssociationId(value: DirectConnectGatewayAssociationId): Self = this.set("associationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationId: Self = this.set("associationId", js.undefined)
    @scala.inline
    def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = this.set("directConnectGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectConnectGatewayId: Self = this.set("directConnectGatewayId", js.undefined)
    @scala.inline
    def setVirtualGatewayId(value: VirtualGatewayId): Self = this.set("virtualGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualGatewayId: Self = this.set("virtualGatewayId", js.undefined)
  }
  
}

