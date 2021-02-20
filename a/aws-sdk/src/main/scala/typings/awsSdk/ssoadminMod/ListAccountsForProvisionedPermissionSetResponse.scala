package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAccountsForProvisionedPermissionSetResponse extends StObject {
  
  /**
    * The list of AWS AccountIds.
    */
  var AccountIds: js.UndefOr[AccountList] = js.native
  
  /**
    * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make subsequent calls.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object ListAccountsForProvisionedPermissionSetResponse {
  
  @scala.inline
  def apply(): ListAccountsForProvisionedPermissionSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountsForProvisionedPermissionSetResponse]
  }
  
  @scala.inline
  implicit class ListAccountsForProvisionedPermissionSetResponseMutableBuilder[Self <: ListAccountsForProvisionedPermissionSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsUndefined: Self = StObject.set(x, "AccountIds", js.undefined)
    
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
