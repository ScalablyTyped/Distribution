package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDirectConnectGatewayRequest extends js.Object {
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: DirectConnectGatewayId = js.native
}

object DeleteDirectConnectGatewayRequest {
  @scala.inline
  def apply(directConnectGatewayId: DirectConnectGatewayId): DeleteDirectConnectGatewayRequest = {
    val __obj = js.Dynamic.literal(directConnectGatewayId = directConnectGatewayId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDirectConnectGatewayRequest]
  }
}

