package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMembersResponse extends StObject {
  
  /**
    * The accounts that could not be processed.
    */
  var UnprocessedAccounts: typings.awsSdk.guarddutyMod.UnprocessedAccounts
}
object DeleteMembersResponse {
  
  inline def apply(UnprocessedAccounts: UnprocessedAccounts): DeleteMembersResponse = {
    val __obj = js.Dynamic.literal(UnprocessedAccounts = UnprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMembersResponse]
  }
  
  extension [Self <: DeleteMembersResponse](x: Self) {
    
    inline def setUnprocessedAccounts(value: UnprocessedAccounts): Self = StObject.set(x, "UnprocessedAccounts", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = StObject.set(x, "UnprocessedAccounts", js.Array(value :_*))
  }
}
