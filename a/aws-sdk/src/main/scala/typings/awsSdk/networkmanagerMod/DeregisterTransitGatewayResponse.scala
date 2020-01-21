package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterTransitGatewayResponse extends js.Object {
  /**
    * The transit gateway registration information.
    */
  var TransitGatewayRegistration: js.UndefOr[typings.awsSdk.networkmanagerMod.TransitGatewayRegistration] = js.native
}

object DeregisterTransitGatewayResponse {
  @scala.inline
  def apply(TransitGatewayRegistration: TransitGatewayRegistration = null): DeregisterTransitGatewayResponse = {
    val __obj = js.Dynamic.literal()
    if (TransitGatewayRegistration != null) __obj.updateDynamic("TransitGatewayRegistration")(TransitGatewayRegistration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterTransitGatewayResponse]
  }
}

