package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropagatingVgw extends js.Object {
  /**
    * The ID of the virtual private gateway.
    */
  var GatewayId: js.UndefOr[String] = js.native
}

object PropagatingVgw {
  @scala.inline
  def apply(GatewayId: String = null): PropagatingVgw = {
    val __obj = js.Dynamic.literal()
    if (GatewayId != null) __obj.updateDynamic("GatewayId")(GatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropagatingVgw]
  }
}

