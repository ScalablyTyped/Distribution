package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmPrivateVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.native
  /**
    * The ID of the virtual private gateway.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.native
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: VirtualInterfaceId = js.native
}

object ConfirmPrivateVirtualInterfaceRequest {
  @scala.inline
  def apply(
    virtualInterfaceId: VirtualInterfaceId,
    directConnectGatewayId: DirectConnectGatewayId = null,
    virtualGatewayId: VirtualGatewayId = null
  ): ConfirmPrivateVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    if (directConnectGatewayId != null) __obj.updateDynamic("directConnectGatewayId")(directConnectGatewayId.asInstanceOf[js.Any])
    if (virtualGatewayId != null) __obj.updateDynamic("virtualGatewayId")(virtualGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmPrivateVirtualInterfaceRequest]
  }
}

