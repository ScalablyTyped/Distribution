package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDirectConnectGatewayResult extends js.Object {
  /**
    * The Direct Connect gateway.
    */
  var directConnectGateway: js.UndefOr[DirectConnectGateway] = js.native
}

object CreateDirectConnectGatewayResult {
  @scala.inline
  def apply(directConnectGateway: DirectConnectGateway = null): CreateDirectConnectGatewayResult = {
    val __obj = js.Dynamic.literal()
    if (directConnectGateway != null) __obj.updateDynamic("directConnectGateway")(directConnectGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectConnectGatewayResult]
  }
}

