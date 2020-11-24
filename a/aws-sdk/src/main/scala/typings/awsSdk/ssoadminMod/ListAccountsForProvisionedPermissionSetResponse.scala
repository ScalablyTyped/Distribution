package typings.awsSdk.ssoadminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAccountsForProvisionedPermissionSetResponse extends js.Object {
  
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
  implicit class ListAccountsForProvisionedPermissionSetResponseOps[Self <: ListAccountsForProvisionedPermissionSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = this.set("AccountIds", js.Array(value :_*))
    
    @scala.inline
    def setAccountIds(value: AccountList): Self = this.set("AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountIds: Self = this.set("AccountIds", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
