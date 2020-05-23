package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInvitationsResponse extends js.Object {
  /**
    * A list of invitation descriptions.
    */
  var Invitations: js.UndefOr[typings.awsSdk.guarddutyMod.Invitations] = js.native
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListInvitationsResponse {
  @scala.inline
  def apply(Invitations: Invitations = null, NextToken: String = null): ListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Invitations != null) __obj.updateDynamic("Invitations")(Invitations.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInvitationsResponse]
  }
}

