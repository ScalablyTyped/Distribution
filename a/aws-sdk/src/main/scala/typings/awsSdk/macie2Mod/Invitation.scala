package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invitation extends StObject {
  
  /**
    * The AWS account ID for the account that sent the invitation.
    */
  var accountId: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the invitation. Amazon Macie uses this identifier to validate the inviter account with the invitee account.
    */
  var invitationId: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the invitation was sent.
    */
  var invitedAt: js.UndefOr[timestampIso8601] = js.undefined
  
  /**
    * The status of the relationship between the account that sent the invitation (inviter account) and the account that received the invitation (invitee account).
    */
  var relationshipStatus: js.UndefOr[RelationshipStatus] = js.undefined
}
object Invitation {
  
  inline def apply(): Invitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invitation]
  }
  
  extension [Self <: Invitation](x: Self) {
    
    inline def setAccountId(value: string): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setInvitationId(value: string): Self = StObject.set(x, "invitationId", value.asInstanceOf[js.Any])
    
    inline def setInvitationIdUndefined: Self = StObject.set(x, "invitationId", js.undefined)
    
    inline def setInvitedAt(value: timestampIso8601): Self = StObject.set(x, "invitedAt", value.asInstanceOf[js.Any])
    
    inline def setInvitedAtUndefined: Self = StObject.set(x, "invitedAt", js.undefined)
    
    inline def setRelationshipStatus(value: RelationshipStatus): Self = StObject.set(x, "relationshipStatus", value.asInstanceOf[js.Any])
    
    inline def setRelationshipStatusUndefined: Self = StObject.set(x, "relationshipStatus", js.undefined)
  }
}
