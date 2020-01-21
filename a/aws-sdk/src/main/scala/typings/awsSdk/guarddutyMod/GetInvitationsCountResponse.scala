package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInvitationsCountResponse extends js.Object {
  /**
    * The number of received invitations.
    */
  var InvitationsCount: js.UndefOr[Integer] = js.native
}

object GetInvitationsCountResponse {
  @scala.inline
  def apply(InvitationsCount: Int | scala.Double = null): GetInvitationsCountResponse = {
    val __obj = js.Dynamic.literal()
    if (InvitationsCount != null) __obj.updateDynamic("InvitationsCount")(InvitationsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInvitationsCountResponse]
  }
}

