package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGatewayRequest extends js.Object {
  /**
    * The ID of the gateway device.
    */
  var gatewayId: ID = js.native
}

object DescribeGatewayRequest {
  @scala.inline
  def apply(gatewayId: ID): DescribeGatewayRequest = {
    val __obj = js.Dynamic.literal(gatewayId = gatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGatewayRequest]
  }
}

