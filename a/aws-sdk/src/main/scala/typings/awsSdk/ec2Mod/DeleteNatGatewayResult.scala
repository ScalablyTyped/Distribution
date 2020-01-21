package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNatGatewayResult extends js.Object {
  /**
    * The ID of the NAT gateway.
    */
  var NatGatewayId: js.UndefOr[String] = js.native
}

object DeleteNatGatewayResult {
  @scala.inline
  def apply(NatGatewayId: String = null): DeleteNatGatewayResult = {
    val __obj = js.Dynamic.literal()
    if (NatGatewayId != null) __obj.updateDynamic("NatGatewayId")(NatGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNatGatewayResult]
  }
}

