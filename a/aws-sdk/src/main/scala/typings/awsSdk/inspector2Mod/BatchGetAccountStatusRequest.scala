package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetAccountStatusRequest extends StObject {
  
  /**
    * The 12-digit Amazon Web Services account IDs of the accounts to retrieve Amazon Inspector status for.
    */
  var accountIds: js.UndefOr[AccountIdSet] = js.undefined
}
object BatchGetAccountStatusRequest {
  
  inline def apply(): BatchGetAccountStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetAccountStatusRequest]
  }
  
  extension [Self <: BatchGetAccountStatusRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIdSet): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "accountIds", js.Array(value*))
  }
}
