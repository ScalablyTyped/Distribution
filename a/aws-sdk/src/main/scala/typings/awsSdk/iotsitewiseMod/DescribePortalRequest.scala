package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePortalRequest extends js.Object {
  /**
    * The ID of the portal.
    */
  var portalId: ID = js.native
}

object DescribePortalRequest {
  @scala.inline
  def apply(portalId: ID): DescribePortalRequest = {
    val __obj = js.Dynamic.literal(portalId = portalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePortalRequest]
  }
}

