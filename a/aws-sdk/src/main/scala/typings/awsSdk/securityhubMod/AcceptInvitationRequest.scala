package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptInvitationRequest extends StObject {
  
  /**
    * The ID of the invitation sent from the Security Hub master account.
    */
  var InvitationId: NonEmptyString
  
  /**
    * The account ID of the Security Hub master account that sent the invitation.
    */
  var MasterId: NonEmptyString
}
object AcceptInvitationRequest {
  
  @scala.inline
  def apply(InvitationId: NonEmptyString, MasterId: NonEmptyString): AcceptInvitationRequest = {
    val __obj = js.Dynamic.literal(InvitationId = InvitationId.asInstanceOf[js.Any], MasterId = MasterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptInvitationRequest]
  }
  
  @scala.inline
  implicit class AcceptInvitationRequestMutableBuilder[Self <: AcceptInvitationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvitationId(value: NonEmptyString): Self = StObject.set(x, "InvitationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterId(value: NonEmptyString): Self = StObject.set(x, "MasterId", value.asInstanceOf[js.Any])
  }
}
