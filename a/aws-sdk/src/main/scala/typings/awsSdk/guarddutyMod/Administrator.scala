package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Administrator extends StObject {
  
  /**
    * The ID of the account used as the administrator account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.guarddutyMod.AccountId] = js.undefined
  
  /**
    * The value that is used to validate the administrator account to the member account.
    */
  var InvitationId: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp when the invitation was sent.
    */
  var InvitedAt: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the relationship between the administrator and member accounts.
    */
  var RelationshipStatus: js.UndefOr[String] = js.undefined
}
object Administrator {
  
  inline def apply(): Administrator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Administrator]
  }
  
  extension [Self <: Administrator](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setInvitationId(value: String): Self = StObject.set(x, "InvitationId", value.asInstanceOf[js.Any])
    
    inline def setInvitationIdUndefined: Self = StObject.set(x, "InvitationId", js.undefined)
    
    inline def setInvitedAt(value: String): Self = StObject.set(x, "InvitedAt", value.asInstanceOf[js.Any])
    
    inline def setInvitedAtUndefined: Self = StObject.set(x, "InvitedAt", js.undefined)
    
    inline def setRelationshipStatus(value: String): Self = StObject.set(x, "RelationshipStatus", value.asInstanceOf[js.Any])
    
    inline def setRelationshipStatusUndefined: Self = StObject.set(x, "RelationshipStatus", js.undefined)
  }
}
