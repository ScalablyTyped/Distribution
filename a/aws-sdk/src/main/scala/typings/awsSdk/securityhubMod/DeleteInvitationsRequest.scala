package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInvitationsRequest extends StObject {
  
  /**
    * The list of the account IDs that sent the invitations to delete.
    */
  var AccountIds: AccountIdList
}
object DeleteInvitationsRequest {
  
  @scala.inline
  def apply(AccountIds: AccountIdList): DeleteInvitationsRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInvitationsRequest]
  }
  
  @scala.inline
  implicit class DeleteInvitationsRequestMutableBuilder[Self <: DeleteInvitationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
  }
}
