package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGatewayRequest extends js.Object {
  /**
    * The ID of the gateway to delete.
    */
  var gatewayId: ID = js.native
}

object DeleteGatewayRequest {
  @scala.inline
  def apply(gatewayId: ID): DeleteGatewayRequest = {
    val __obj = js.Dynamic.literal(gatewayId = gatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGatewayRequest]
  }
  @scala.inline
  implicit class DeleteGatewayRequestOps[Self <: DeleteGatewayRequest] (val x: Self) extends AnyVal {
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
    def setGatewayId(value: ID): Self = this.set("gatewayId", value.asInstanceOf[js.Any])
  }
  
}

