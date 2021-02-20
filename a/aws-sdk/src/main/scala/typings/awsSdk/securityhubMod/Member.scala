package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Member extends StObject {
  
  /**
    * The AWS account ID of the member account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.securityhubMod.AccountId] = js.native
  
  /**
    * The email address of the member account.
    */
  var Email: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A timestamp for the date and time when the invitation was sent to the member account.
    */
  var InvitedAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The AWS account ID of the Security Hub master account associated with this member account.
    */
  var MasterId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The status of the relationship between the member account and its master account.  The status can have one of the following values:    CREATED - Indicates that the master account added the member account, but has not yet invited the member account.    INVITED - Indicates that the master account invited the member account. The member account has not yet responded to the invitation.    ASSOCIATED - Indicates that the member account accepted the invitation.    REMOVED - Indicates that the master account disassociated the member account.    RESIGNED - Indicates that the member account disassociated themselves from the master account.    DELETED - Indicates that the master account deleted the member account.  
    */
  var MemberStatus: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The timestamp for the date and time when the member account was updated.
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.native
}
object Member {
  
  @scala.inline
  def apply(): Member = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Member]
  }
  
  @scala.inline
  implicit class MemberMutableBuilder[Self <: Member] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setEmail(value: NonEmptyString): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    @scala.inline
    def setInvitedAt(value: Timestamp): Self = StObject.set(x, "InvitedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitedAtUndefined: Self = StObject.set(x, "InvitedAt", js.undefined)
    
    @scala.inline
    def setMasterId(value: NonEmptyString): Self = StObject.set(x, "MasterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterIdUndefined: Self = StObject.set(x, "MasterId", js.undefined)
    
    @scala.inline
    def setMemberStatus(value: NonEmptyString): Self = StObject.set(x, "MemberStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberStatusUndefined: Self = StObject.set(x, "MemberStatus", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
