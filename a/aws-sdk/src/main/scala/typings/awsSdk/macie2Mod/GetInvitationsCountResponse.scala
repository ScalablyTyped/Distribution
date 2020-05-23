package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInvitationsCountResponse extends js.Object {
  /**
    * The total number of invitations that were received by the account, not including the currently accepted invitation.
    */
  var invitationsCount: js.UndefOr[long] = js.native
}

object GetInvitationsCountResponse {
  @scala.inline
  def apply(invitationsCount: js.UndefOr[long] = js.undefined): GetInvitationsCountResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(invitationsCount)) __obj.updateDynamic("invitationsCount")(invitationsCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInvitationsCountResponse]
  }
}

