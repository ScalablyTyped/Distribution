package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invitation extends js.Object {
  /**
    * The date and time that the invitation was created.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.native
  /**
    * The date and time that the invitation expires. This is the CreationDate plus the ProposalDurationInHours that is specified in the ProposalThresholdPolicy. After this date and time, the invitee can no longer create a member and join the network using this InvitationId.
    */
  var ExpirationDate: js.UndefOr[Timestamp] = js.native
  /**
    * The unique identifier for the invitation.
    */
  var InvitationId: js.UndefOr[ResourceIdString] = js.native
  var NetworkSummary: js.UndefOr[typings.awsSdk.managedblockchainMod.NetworkSummary] = js.native
  /**
    * The status of the invitation:    PENDING - The invitee has not created a member to join the network, and the invitation has not yet expired.    ACCEPTING - The invitee has begun creating a member, and creation has not yet completed.    ACCEPTED - The invitee created a member and joined the network using the InvitationID.    REJECTED - The invitee rejected the invitation.    EXPIRED - The invitee neither created a member nor rejected the invitation before the ExpirationDate.  
    */
  var Status: js.UndefOr[InvitationStatus] = js.native
}

object Invitation {
  @scala.inline
  def apply(): Invitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invitation]
  }
  @scala.inline
  implicit class InvitationOps[Self <: Invitation] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: Timestamp): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setExpirationDate(value: Timestamp): Self = this.set("ExpirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationDate: Self = this.set("ExpirationDate", js.undefined)
    @scala.inline
    def setInvitationId(value: ResourceIdString): Self = this.set("InvitationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitationId: Self = this.set("InvitationId", js.undefined)
    @scala.inline
    def setNetworkSummary(value: NetworkSummary): Self = this.set("NetworkSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkSummary: Self = this.set("NetworkSummary", js.undefined)
    @scala.inline
    def setStatus(value: InvitationStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

