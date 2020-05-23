package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePortalResponse extends js.Object {
  /**
    * The status of the portal, which contains a state (DELETING after successfully calling this action) and any error message.
    */
  var portalStatus: PortalStatus = js.native
}

object DeletePortalResponse {
  @scala.inline
  def apply(portalStatus: PortalStatus): DeletePortalResponse = {
    val __obj = js.Dynamic.literal(portalStatus = portalStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePortalResponse]
  }
}

