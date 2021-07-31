package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclineInvitationsRequest extends StObject {
  
  /**
    * The list of account IDs for the accounts from which to decline the invitations to Security Hub.
    */
  var AccountIds: AccountIdList
}
object DeclineInvitationsRequest {
  
  @scala.inline
  def apply(AccountIds: AccountIdList): DeclineInvitationsRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclineInvitationsRequest]
  }
  
  @scala.inline
  implicit class DeclineInvitationsRequestMutableBuilder[Self <: DeclineInvitationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
  }
}
