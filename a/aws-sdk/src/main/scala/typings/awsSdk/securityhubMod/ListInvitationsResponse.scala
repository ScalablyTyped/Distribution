package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInvitationsResponse extends js.Object {
  /**
    * The details of the invitations returned by the operation.
    */
  var Invitations: js.UndefOr[InvitationList] = js.native
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.native
}

object ListInvitationsResponse {
  @scala.inline
  def apply(Invitations: InvitationList = null, NextToken: NonEmptyString = null): ListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Invitations != null) __obj.updateDynamic("Invitations")(Invitations.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInvitationsResponse]
  }
}

