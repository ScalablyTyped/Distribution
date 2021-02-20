package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceShareInvitation extends StObject {
  
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
  implicit class ResourceShareInvitationMutableBuilder[Self <: ResourceShareInvitation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvitationTimestamp(value: DateTime): Self = StObject.set(x, "invitationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationTimestampUndefined: Self = StObject.set(x, "invitationTimestamp", js.undefined)
    
    @scala.inline
    def setReceiverAccountId(value: String): Self = StObject.set(x, "receiverAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiverAccountIdUndefined: Self = StObject.set(x, "receiverAccountId", js.undefined)
    
    @scala.inline
    def setResourceShareArn(value: String): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceShareArnUndefined: Self = StObject.set(x, "resourceShareArn", js.undefined)
    
    @scala.inline
    def setResourceShareAssociations(value: ResourceShareAssociationList): Self = StObject.set(x, "resourceShareAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceShareAssociationsUndefined: Self = StObject.set(x, "resourceShareAssociations", js.undefined)
    
    @scala.inline
    def setResourceShareAssociationsVarargs(value: ResourceShareAssociation*): Self = StObject.set(x, "resourceShareAssociations", js.Array(value :_*))
    
    @scala.inline
    def setResourceShareInvitationArn(value: String): Self = StObject.set(x, "resourceShareInvitationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceShareInvitationArnUndefined: Self = StObject.set(x, "resourceShareInvitationArn", js.undefined)
    
    @scala.inline
    def setResourceShareName(value: String): Self = StObject.set(x, "resourceShareName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceShareNameUndefined: Self = StObject.set(x, "resourceShareName", js.undefined)
    
    @scala.inline
    def setSenderAccountId(value: String): Self = StObject.set(x, "senderAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderAccountIdUndefined: Self = StObject.set(x, "senderAccountId", js.undefined)
    
    @scala.inline
    def setStatus(value: ResourceShareInvitationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
