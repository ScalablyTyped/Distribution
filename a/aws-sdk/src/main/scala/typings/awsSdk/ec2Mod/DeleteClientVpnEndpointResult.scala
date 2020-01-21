package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClientVpnEndpointResult extends js.Object {
  /**
    * The current state of the Client VPN endpoint.
    */
  var Status: js.UndefOr[ClientVpnEndpointStatus] = js.native
}

object DeleteClientVpnEndpointResult {
  @scala.inline
  def apply(Status: ClientVpnEndpointStatus = null): DeleteClientVpnEndpointResult = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClientVpnEndpointResult]
  }
}

