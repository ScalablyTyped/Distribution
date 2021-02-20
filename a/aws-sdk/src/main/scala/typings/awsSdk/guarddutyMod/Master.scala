package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Master extends StObject {
  
  /**
    * The ID of the account used as the master account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.guarddutyMod.AccountId] = js.native
  
  /**
    * The value used to validate the master account to the member account.
    */
  var InvitationId: js.UndefOr[String] = js.native
  
  /**
    * The timestamp when the invitation was sent.
    */
  var InvitedAt: js.UndefOr[String] = js.native
  
  /**
    * The status of the relationship between the master and member accounts.
    */
  var RelationshipStatus: js.UndefOr[String] = js.native
}
object Master {
  
  @scala.inline
  def apply(): Master = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Master]
  }
  
  @scala.inline
  implicit class MasterMutableBuilder[Self <: Master] (val x: Self) extends AnyVal {
    
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
