package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceShareInvitation extends js.Object {
  /**
    * The date and time when the invitation was sent.
    */
  var invitationTimestamp: js.UndefOr[DateTime] = js.native
  /**
    * The ID of the AWS account that received the invitation.
    */
  var receiverAccountId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: js.UndefOr[String] = js.native
  /**
    * To view the resources associated with a pending resource share invitation, use  ListPendingInvitationResources.
    */
  var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the invitation.
    */
  var resourceShareInvitationArn: js.UndefOr[String] = js.native
  /**
    * The name of the resource share.
    */
  var resourceShareName: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account that sent the invitation.
    */
  var senderAccountId: js.UndefOr[String] = js.native
  /**
    * The status of the invitation.
    */
  var status: js.UndefOr[ResourceShareInvitationStatus] = js.native
}

object ResourceShareInvitation {
  @scala.inline
  def apply(): ResourceShareInvitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceShareInvitation]
  }
  @scala.inline
  implicit class ResourceShareInvitationOps[Self <: ResourceShareInvitation] (val x: Self) extends AnyVal {
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
    def setInvitationTimestamp(value: DateTime): Self = this.set("invitationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitationTimestamp: Self = this.set("invitationTimestamp", js.undefined)
    @scala.inline
    def setReceiverAccountId(value: String): Self = this.set("receiverAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceiverAccountId: Self = this.set("receiverAccountId", js.undefined)
    @scala.inline
    def setResourceShareArn(value: String): Self = this.set("resourceShareArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceShareArn: Self = this.set("resourceShareArn", js.undefined)
    @scala.inline
    def setResourceShareAssociationsVarargs(value: ResourceShareAssociation*): Self = this.set("resourceShareAssociations", js.Array(value :_*))
    @scala.inline
    def setResourceShareAssociations(value: ResourceShareAssociationList): Self = this.set("resourceShareAssociations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceShareAssociations: Self = this.set("resourceShareAssociations", js.undefined)
    @scala.inline
    def setResourceShareInvitationArn(value: String): Self = this.set("resourceShareInvitationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceShareInvitationArn: Self = this.set("resourceShareInvitationArn", js.undefined)
    @scala.inline
    def setResourceShareName(value: String): Self = this.set("resourceShareName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceShareName: Self = this.set("resourceShareName", js.undefined)
    @scala.inline
    def setSenderAccountId(value: String): Self = this.set("senderAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSenderAccountId: Self = this.set("senderAccountId", js.undefined)
    @scala.inline
    def setStatus(value: ResourceShareInvitationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

