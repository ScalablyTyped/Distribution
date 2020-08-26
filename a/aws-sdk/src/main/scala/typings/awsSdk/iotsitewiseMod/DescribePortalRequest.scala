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
  @scala.inline
  implicit class DescribePortalRequestOps[Self <: DescribePortalRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPortalId(value: ID): Self = this.set("portalId", value.asInstanceOf[js.Any])
  }
  
}

