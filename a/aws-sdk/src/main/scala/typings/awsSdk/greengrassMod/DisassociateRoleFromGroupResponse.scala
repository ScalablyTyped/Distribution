package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateRoleFromGroupResponse extends js.Object {
  /**
    * The time, in milliseconds since the epoch, when the role was disassociated from the group.
    */
  var DisassociatedAt: js.UndefOr[string] = js.native
}

object DisassociateRoleFromGroupResponse {
  @scala.inline
  def apply(DisassociatedAt: string = null): DisassociateRoleFromGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (DisassociatedAt != null) __obj.updateDynamic("DisassociatedAt")(DisassociatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateRoleFromGroupResponse]
  }
}

