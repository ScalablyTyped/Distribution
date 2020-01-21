package typings.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTunnelRequest extends js.Object {
  /**
    * The tunnel to describe.
    */
  var tunnelId: TunnelId = js.native
}

object DescribeTunnelRequest {
  @scala.inline
  def apply(tunnelId: TunnelId): DescribeTunnelRequest = {
    val __obj = js.Dynamic.literal(tunnelId = tunnelId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeTunnelRequest]
  }
}

