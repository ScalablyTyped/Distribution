package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invitation extends StObject {
  
  /**
    * The ID of the account that the invitation was sent from.
    */
  var AccountId: js.UndefOr[typings.awsSdk.guarddutyMod.AccountId] = js.undefined
  
  /**
    * The ID of the invitation. This value is used to validate the inviter account to the member account.
    */
  var InvitationId: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp when the invitation was sent.
    */
  var InvitedAt: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the relationship between the inviter and invitee accounts.
    */
  var RelationshipStatus: js.UndefOr[String] = js.undefined
}
object Invitation {
  
  @scala.inline
  def apply(): Invitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invitation]
  }
  
  @scala.inline
  implicit class InvitationMutableBuilder[Self <: Invitation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setInvitationId(value: String): Self = StObject.set(x, "InvitationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationIdUndefined: Self = StObject.set(x, "InvitationId", js.undefined)
    
    @scala.inline
    def setInvitedAt(value: String): Self = StObject.set(x, "InvitedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitedAtUndefined: Self = StObject.set(x, "InvitedAt", js.undefined)
    
    @scala.inline
    def setRelationshipStatus(value: String): Self = StObject.set(x, "RelationshipStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipStatusUndefined: Self = StObject.set(x, "RelationshipStatus", js.undefined)
  }
}
