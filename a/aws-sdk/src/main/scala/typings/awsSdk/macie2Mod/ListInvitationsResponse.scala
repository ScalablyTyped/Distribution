package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInvitationsResponse extends js.Object {
  /**
    * An array of objects, one for each invitation that was received by the account.
    */
  var invitations: js.UndefOr[listOfInvitation] = js.native
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.native
}

object ListInvitationsResponse {
  @scala.inline
  def apply(invitations: listOfInvitation = null, nextToken: string = null): ListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (invitations != null) __obj.updateDynamic("invitations")(invitations.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInvitationsResponse]
  }
}

