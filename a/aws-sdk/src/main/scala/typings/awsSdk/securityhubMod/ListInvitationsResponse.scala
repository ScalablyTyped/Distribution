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
  def apply(): ListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInvitationsResponse]
  }
  @scala.inline
  implicit class ListInvitationsResponseOps[Self <: ListInvitationsResponse] (val x: Self) extends AnyVal {
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
    def setInvitationsVarargs(value: Invitation*): Self = this.set("Invitations", js.Array(value :_*))
    @scala.inline
    def setInvitations(value: InvitationList): Self = this.set("Invitations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitations: Self = this.set("Invitations", js.undefined)
    @scala.inline
    def setNextToken(value: NonEmptyString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

