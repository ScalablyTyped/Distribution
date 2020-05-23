package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectConnectGateway extends js.Object {
  /**
    * The autonomous system number (ASN) for the Amazon side of the connection.
    */
  var amazonSideAsn: js.UndefOr[LongAsn] = js.native
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.native
  /**
    * The name of the Direct Connect gateway.
    */
  var directConnectGatewayName: js.UndefOr[DirectConnectGatewayName] = js.native
  /**
    * The state of the Direct Connect gateway. The following are the possible values:    pending: The initial state after calling CreateDirectConnectGateway.    available: The Direct Connect gateway is ready for use.    deleting: The initial state after calling DeleteDirectConnectGateway.    deleted: The Direct Connect gateway is deleted and cannot pass traffic.  
    */
  var directConnectGatewayState: js.UndefOr[DirectConnectGatewayState] = js.native
  /**
    * The ID of the AWS account that owns the Direct Connect gateway.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.native
  /**
    * The error message if the state of an object failed to advance.
    */
  var stateChangeError: js.UndefOr[StateChangeError] = js.native
}

object DirectConnectGateway {
  @scala.inline
  def apply(
    amazonSideAsn: js.UndefOr[LongAsn] = js.undefined,
    directConnectGatewayId: DirectConnectGatewayId = null,
    directConnectGatewayName: DirectConnectGatewayName = null,
    directConnectGatewayState: DirectConnectGatewayState = null,
    ownerAccount: OwnerAccount = null,
    stateChangeError: StateChangeError = null
  ): DirectConnectGateway = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(amazonSideAsn)) __obj.updateDynamic("amazonSideAsn")(amazonSideAsn.get.asInstanceOf[js.Any])
    if (directConnectGatewayId != null) __obj.updateDynamic("directConnectGatewayId")(directConnectGatewayId.asInstanceOf[js.Any])
    if (directConnectGatewayName != null) __obj.updateDynamic("directConnectGatewayName")(directConnectGatewayName.asInstanceOf[js.Any])
    if (directConnectGatewayState != null) __obj.updateDynamic("directConnectGatewayState")(directConnectGatewayState.asInstanceOf[js.Any])
    if (ownerAccount != null) __obj.updateDynamic("ownerAccount")(ownerAccount.asInstanceOf[js.Any])
    if (stateChangeError != null) __obj.updateDynamic("stateChangeError")(stateChangeError.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectConnectGateway]
  }
}

