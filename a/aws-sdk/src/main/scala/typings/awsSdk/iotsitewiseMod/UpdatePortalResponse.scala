package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePortalResponse extends js.Object {
  /**
    * The status of the portal, which contains a state (UPDATING after successfully calling this operation) and any error message.
    */
  var portalStatus: PortalStatus = js.native
}

object UpdatePortalResponse {
  @scala.inline
  def apply(portalStatus: PortalStatus): UpdatePortalResponse = {
    val __obj = js.Dynamic.literal(portalStatus = portalStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePortalResponse]
  }
}

