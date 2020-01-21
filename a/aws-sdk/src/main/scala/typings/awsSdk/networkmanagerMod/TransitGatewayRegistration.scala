package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayRegistration extends js.Object {
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.native
  /**
    * The state of the transit gateway registration.
    */
  var State: js.UndefOr[TransitGatewayRegistrationStateReason] = js.native
  /**
    * The Amazon Resource Name (ARN) of the transit gateway.
    */
  var TransitGatewayArn: js.UndefOr[String] = js.native
}

object TransitGatewayRegistration {
  @scala.inline
  def apply(
    GlobalNetworkId: String = null,
    State: TransitGatewayRegistrationStateReason = null,
    TransitGatewayArn: String = null
  ): TransitGatewayRegistration = {
    val __obj = js.Dynamic.literal()
    if (GlobalNetworkId != null) __obj.updateDynamic("GlobalNetworkId")(GlobalNetworkId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (TransitGatewayArn != null) __obj.updateDynamic("TransitGatewayArn")(TransitGatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitGatewayRegistration]
  }
}

