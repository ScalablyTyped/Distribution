package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGatewayRequest extends js.Object {
  /**
    * The ID of the gateway to update.
    */
  var gatewayId: ID = js.native
  /**
    * A unique, friendly name for the gateway.
    */
  var gatewayName: Name = js.native
}

object UpdateGatewayRequest {
  @scala.inline
  def apply(gatewayId: ID, gatewayName: Name): UpdateGatewayRequest = {
    val __obj = js.Dynamic.literal(gatewayId = gatewayId.asInstanceOf[js.Any], gatewayName = gatewayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewayRequest]
  }
}

