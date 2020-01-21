package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerGatewayAssociation extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the customer gateway.
    */
  var CustomerGatewayArn: js.UndefOr[String] = js.native
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[String] = js.native
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.native
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[String] = js.native
  /**
    * The association state.
    */
  var State: js.UndefOr[CustomerGatewayAssociationState] = js.native
}

object CustomerGatewayAssociation {
  @scala.inline
  def apply(
    CustomerGatewayArn: String = null,
    DeviceId: String = null,
    GlobalNetworkId: String = null,
    LinkId: String = null,
    State: CustomerGatewayAssociationState = null
  ): CustomerGatewayAssociation = {
    val __obj = js.Dynamic.literal()
    if (CustomerGatewayArn != null) __obj.updateDynamic("CustomerGatewayArn")(CustomerGatewayArn.asInstanceOf[js.Any])
    if (DeviceId != null) __obj.updateDynamic("DeviceId")(DeviceId.asInstanceOf[js.Any])
    if (GlobalNetworkId != null) __obj.updateDynamic("GlobalNetworkId")(GlobalNetworkId.asInstanceOf[js.Any])
    if (LinkId != null) __obj.updateDynamic("LinkId")(LinkId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerGatewayAssociation]
  }
}

