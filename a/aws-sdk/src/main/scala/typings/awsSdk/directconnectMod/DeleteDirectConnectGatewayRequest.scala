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
  @scala.inline
  implicit class DeleteDirectConnectGatewayRequestOps[Self <: DeleteDirectConnectGatewayRequest] (val x: Self) extends AnyVal {
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
  }
  
}

