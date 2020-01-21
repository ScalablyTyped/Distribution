package typings.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTunnelResponse extends js.Object {
  /**
    * The tunnel being described.
    */
  var tunnel: js.UndefOr[Tunnel] = js.native
}

object DescribeTunnelResponse {
  @scala.inline
  def apply(tunnel: Tunnel = null): DescribeTunnelResponse = {
    val __obj = js.Dynamic.literal()
    if (tunnel != null) __obj.updateDynamic("tunnel")(tunnel.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTunnelResponse]
  }
}

