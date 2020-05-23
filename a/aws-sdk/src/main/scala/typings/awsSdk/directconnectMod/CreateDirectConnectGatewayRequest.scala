package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDirectConnectGatewayRequest extends js.Object {
  /**
    * The autonomous system number (ASN) for Border Gateway Protocol (BGP) to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294. The default is 64512.
    */
  var amazonSideAsn: js.UndefOr[LongAsn] = js.native
  /**
    * The name of the Direct Connect gateway.
    */
  var directConnectGatewayName: DirectConnectGatewayName = js.native
}

object CreateDirectConnectGatewayRequest {
  @scala.inline
  def apply(
    directConnectGatewayName: DirectConnectGatewayName,
    amazonSideAsn: js.UndefOr[LongAsn] = js.undefined
  ): CreateDirectConnectGatewayRequest = {
    val __obj = js.Dynamic.literal(directConnectGatewayName = directConnectGatewayName.asInstanceOf[js.Any])
    if (!js.isUndefined(amazonSideAsn)) __obj.updateDynamic("amazonSideAsn")(amazonSideAsn.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectConnectGatewayRequest]
  }
}

