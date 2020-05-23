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
}

