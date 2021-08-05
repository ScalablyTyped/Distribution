package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInvitationsResponse extends StObject {
  
  /**
    * A list of objects that contain the unprocessed account and a result string that explains why it was unprocessed.
    */
  var UnprocessedAccounts: typings.awsSdk.guarddutyMod.UnprocessedAccounts
}
object DeleteInvitationsResponse {
  
  inline def apply(UnprocessedAccounts: UnprocessedAccounts): DeleteInvitationsResponse = {
    val __obj = js.Dynamic.literal(UnprocessedAccounts = UnprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInvitationsResponse]
  }
  
  extension [Self <: DeleteInvitationsResponse](x: Self) {
    
    inline def setUnprocessedAccounts(value: UnprocessedAccounts): Self = StObject.set(x, "UnprocessedAccounts", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = StObject.set(x, "UnprocessedAccounts", js.Array(value :_*))
  }
}
