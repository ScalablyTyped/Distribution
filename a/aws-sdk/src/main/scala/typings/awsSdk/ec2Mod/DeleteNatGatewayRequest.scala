package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNatGatewayRequest extends js.Object {
  /**
    * The ID of the NAT gateway.
    */
  var NatGatewayId: typings.awsSdk.ec2Mod.NatGatewayId = js.native
}

object DeleteNatGatewayRequest {
  @scala.inline
  def apply(NatGatewayId: NatGatewayId): DeleteNatGatewayRequest = {
    val __obj = js.Dynamic.literal(NatGatewayId = NatGatewayId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteNatGatewayRequest]
  }
}

