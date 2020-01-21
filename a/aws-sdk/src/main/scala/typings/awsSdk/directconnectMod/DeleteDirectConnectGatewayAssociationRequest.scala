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
  def apply(
    associationId: DirectConnectGatewayAssociationId = null,
    directConnectGatewayId: DirectConnectGatewayId = null,
    virtualGatewayId: VirtualGatewayId = null
  ): DeleteDirectConnectGatewayAssociationRequest = {
    val __obj = js.Dynamic.literal()
    if (associationId != null) __obj.updateDynamic("associationId")(associationId.asInstanceOf[js.Any])
    if (directConnectGatewayId != null) __obj.updateDynamic("directConnectGatewayId")(directConnectGatewayId.asInstanceOf[js.Any])
    if (virtualGatewayId != null) __obj.updateDynamic("virtualGatewayId")(virtualGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationRequest]
  }
}

