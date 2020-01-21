package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableTransitGatewayRouteTablePropagationResult extends js.Object {
  /**
    * Information about route propagation.
    */
  var Propagation: js.UndefOr[TransitGatewayPropagation] = js.native
}

object DisableTransitGatewayRouteTablePropagationResult {
  @scala.inline
  def apply(Propagation: TransitGatewayPropagation = null): DisableTransitGatewayRouteTablePropagationResult = {
    val __obj = js.Dynamic.literal()
    if (Propagation != null) __obj.updateDynamic("Propagation")(Propagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableTransitGatewayRouteTablePropagationResult]
  }
}

