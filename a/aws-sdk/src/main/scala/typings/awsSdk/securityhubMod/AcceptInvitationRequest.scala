package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptInvitationRequest extends StObject {
  
  /**
    * The identifier of the invitation sent from the Security Hub administrator account.
    */
  var InvitationId: NonEmptyString
  
  /**
    * The account ID of the Security Hub administrator account that sent the invitation.
    */
  var MasterId: NonEmptyString
}
object AcceptInvitationRequest {
  
  inline def apply(InvitationId: NonEmptyString, MasterId: NonEmptyString): AcceptInvitationRequest = {
    val __obj = js.Dynamic.literal(InvitationId = InvitationId.asInstanceOf[js.Any], MasterId = MasterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptInvitationRequest]
  }
  
  extension [Self <: AcceptInvitationRequest](x: Self) {
    
    inline def setInvitationId(value: NonEmptyString): Self = StObject.set(x, "InvitationId", value.asInstanceOf[js.Any])
    
    inline def setMasterId(value: NonEmptyString): Self = StObject.set(x, "MasterId", value.asInstanceOf[js.Any])
  }
}
