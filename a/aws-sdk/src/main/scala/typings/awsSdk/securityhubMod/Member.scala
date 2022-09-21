package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Member extends StObject {
  
  /**
    * The Amazon Web Services account ID of the member account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.securityhubMod.AccountId] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the Security Hub administrator account associated with this member account.
    */
  var AdministratorId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The email address of the member account.
    */
  var Email: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A timestamp for the date and time when the invitation was sent to the member account.
    */
  var InvitedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * This is replaced by AdministratorID. The Amazon Web Services account ID of the Security Hub administrator account associated with this member account.
    */
  var MasterId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of the relationship between the member account and its administrator account.  The status can have one of the following values:    CREATED - Indicates that the administrator account added the member account, but has not yet invited the member account.    INVITED - Indicates that the administrator account invited the member account. The member account has not yet responded to the invitation.    ENABLED - Indicates that the member account is currently active. For manually invited member accounts, indicates that the member account accepted the invitation.    REMOVED - Indicates that the administrator account disassociated the member account.    RESIGNED - Indicates that the member account disassociated themselves from the administrator account.    DELETED - Indicates that the administrator account deleted the member account.    ACCOUNT_SUSPENDED - Indicates that an organization account was suspended from Amazon Web Services at the same time that the administrator account tried to enable the organization account as a member account.  
    */
  var MemberStatus: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The timestamp for the date and time when the member account was updated.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object Member {
  
  inline def apply(): Member = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Member]
  }
  
  extension [Self <: Member](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAdministratorId(value: NonEmptyString): Self = StObject.set(x, "AdministratorId", value.asInstanceOf[js.Any])
    
    inline def setAdministratorIdUndefined: Self = StObject.set(x, "AdministratorId", js.undefined)
    
    inline def setEmail(value: NonEmptyString): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    inline def setInvitedAt(value: js.Date): Self = StObject.set(x, "InvitedAt", value.asInstanceOf[js.Any])
    
    inline def setInvitedAtUndefined: Self = StObject.set(x, "InvitedAt", js.undefined)
    
    inline def setMasterId(value: NonEmptyString): Self = StObject.set(x, "MasterId", value.asInstanceOf[js.Any])
    
    inline def setMasterIdUndefined: Self = StObject.set(x, "MasterId", js.undefined)
    
    inline def setMemberStatus(value: NonEmptyString): Self = StObject.set(x, "MemberStatus", value.asInstanceOf[js.Any])
    
    inline def setMemberStatusUndefined: Self = StObject.set(x, "MemberStatus", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
