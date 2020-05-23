package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGatewayResponse extends js.Object {
  /**
    * The ARN of the gateway, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:gateway/${GatewayId} 
    */
  var gatewayArn: ARN = js.native
  /**
    * The ID of the gateway device. You can use this ID when you call other AWS IoT SiteWise APIs.
    */
  var gatewayId: ID = js.native
}

object CreateGatewayResponse {
  @scala.inline
  def apply(gatewayArn: ARN, gatewayId: ID): CreateGatewayResponse = {
    val __obj = js.Dynamic.literal(gatewayArn = gatewayArn.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGatewayResponse]
  }
}

