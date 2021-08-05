package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccountsForProvisionedPermissionSetResponse extends StObject {
  
  /**
    * The list of AWS AccountIds.
    */
  var AccountIds: js.UndefOr[AccountList] = js.undefined
  
  /**
    * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make subsequent calls.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListAccountsForProvisionedPermissionSetResponse {
  
  inline def apply(): ListAccountsForProvisionedPermissionSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountsForProvisionedPermissionSetResponse]
  }
  
  extension [Self <: ListAccountsForProvisionedPermissionSetResponse](x: Self) {
    
    inline def setAccountIds(value: AccountList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "AccountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
