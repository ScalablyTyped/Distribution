package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalResource extends js.Object {
  /**
    * The ID of the portal.
    */
  var id: ID = js.native
}

object PortalResource {
  @scala.inline
  def apply(id: ID): PortalResource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalResource]
  }
}

