package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptInvitationRequest extends StObject {
  
  /**
    * The unique identifier for the invitation to accept.
    */
  var invitationId: string
  
  /**
    * The AWS account ID for the account that sent the invitation.
    */
  var masterAccount: string
}
object AcceptInvitationRequest {
  
  inline def apply(invitationId: string, masterAccount: string): AcceptInvitationRequest = {
    val __obj = js.Dynamic.literal(invitationId = invitationId.asInstanceOf[js.Any], masterAccount = masterAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptInvitationRequest]
  }
  
  extension [Self <: AcceptInvitationRequest](x: Self) {
    
    inline def setInvitationId(value: string): Self = StObject.set(x, "invitationId", value.asInstanceOf[js.Any])
    
    inline def setMasterAccount(value: string): Self = StObject.set(x, "masterAccount", value.asInstanceOf[js.Any])
  }
}
