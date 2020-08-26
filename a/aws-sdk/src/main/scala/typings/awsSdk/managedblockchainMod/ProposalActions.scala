package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProposalActions extends js.Object {
  /**
    *  The actions to perform for an APPROVED proposal to invite an AWS account to create a member and join the network. 
    */
  var Invitations: js.UndefOr[InviteActionList] = js.native
  /**
    *  The actions to perform for an APPROVED proposal to remove a member from the network, which deletes the member and all associated member resources from the network. 
    */
  var Removals: js.UndefOr[RemoveActionList] = js.native
}

object ProposalActions {
  @scala.inline
  def apply(): ProposalActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProposalActions]
  }
  @scala.inline
  implicit class ProposalActionsOps[Self <: ProposalActions] (val x: Self) extends AnyVal {
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
    def setInvitationsVarargs(value: InviteAction*): Self = this.set("Invitations", js.Array(value :_*))
    @scala.inline
    def setInvitations(value: InviteActionList): Self = this.set("Invitations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitations: Self = this.set("Invitations", js.undefined)
    @scala.inline
    def setRemovalsVarargs(value: RemoveAction*): Self = this.set("Removals", js.Array(value :_*))
    @scala.inline
    def setRemovals(value: RemoveActionList): Self = this.set("Removals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemovals: Self = this.set("Removals", js.undefined)
  }
  
}

