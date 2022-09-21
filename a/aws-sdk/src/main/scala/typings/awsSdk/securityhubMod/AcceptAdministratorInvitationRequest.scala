package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptAdministratorInvitationRequest extends StObject {
  
  /**
    * The account ID of the Security Hub administrator account that sent the invitation.
    */
  var AdministratorId: NonEmptyString
  
  /**
    * The identifier of the invitation sent from the Security Hub administrator account.
    */
  var InvitationId: NonEmptyString
}
object AcceptAdministratorInvitationRequest {
  
  inline def apply(AdministratorId: NonEmptyString, InvitationId: NonEmptyString): AcceptAdministratorInvitationRequest = {
    val __obj = js.Dynamic.literal(AdministratorId = AdministratorId.asInstanceOf[js.Any], InvitationId = InvitationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptAdministratorInvitationRequest]
  }
  
  extension [Self <: AcceptAdministratorInvitationRequest](x: Self) {
    
    inline def setAdministratorId(value: NonEmptyString): Self = StObject.set(x, "AdministratorId", value.asInstanceOf[js.Any])
    
    inline def setInvitationId(value: NonEmptyString): Self = StObject.set(x, "InvitationId", value.asInstanceOf[js.Any])
  }
}
