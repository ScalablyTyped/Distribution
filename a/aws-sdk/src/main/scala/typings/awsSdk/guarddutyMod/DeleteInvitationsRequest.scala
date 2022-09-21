package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInvitationsRequest extends StObject {
  
  /**
    * A list of account IDs of the Amazon Web Services accounts that sent invitations to the current member account that you want to delete invitations from.
    */
  var AccountIds: typings.awsSdk.guarddutyMod.AccountIds
}
object DeleteInvitationsRequest {
  
  inline def apply(AccountIds: AccountIds): DeleteInvitationsRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInvitationsRequest]
  }
  
  extension [Self <: DeleteInvitationsRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIds): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value*))
  }
}
