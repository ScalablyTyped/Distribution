package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclineInvitationsRequest extends js.Object {
  /**
    * An array that lists AWS account IDs, one for each account that sent an invitation to decline.
    */
  var accountIds: listOfString = js.native
}

object DeclineInvitationsRequest {
  @scala.inline
  def apply(accountIds: listOfString): DeclineInvitationsRequest = {
    val __obj = js.Dynamic.literal(accountIds = accountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclineInvitationsRequest]
  }
}

