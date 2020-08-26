package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInvitationsOutput extends js.Object {
  /**
    * The invitations for the network.
    */
  var Invitations: js.UndefOr[InvitationList] = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListInvitationsOutput {
  @scala.inline
  def apply(): ListInvitationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInvitationsOutput]
  }
  @scala.inline
  implicit class ListInvitationsOutputOps[Self <: ListInvitationsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
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
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

