package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclineInvitationsRequest extends StObject {
  
  /**
    * A list of account IDs of the AWS accounts that sent invitations to the current member account that you want to decline invitations from.
    */
  var AccountIds: typings.awsSdk.guarddutyMod.AccountIds
}
object DeclineInvitationsRequest {
  
  @scala.inline
  def apply(AccountIds: AccountIds): DeclineInvitationsRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclineInvitationsRequest]
  }
  
  @scala.inline
  implicit class DeclineInvitationsRequestMutableBuilder[Self <: DeclineInvitationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountIds): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
  }
}
