package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMembersRequest extends js.Object {
  
  /**
    * The list of accounts to associate with the Security Hub master account. For each account, the list includes the account ID and the email address.
    */
  var AccountDetails: js.UndefOr[AccountDetailsList] = js.native
}
object CreateMembersRequest {
  
  @scala.inline
  def apply(): CreateMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMembersRequest]
  }
  
  @scala.inline
  implicit class CreateMembersRequestOps[Self <: CreateMembersRequest] (val x: Self) extends AnyVal {
    
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
    def setAccountDetailsVarargs(value: AccountDetails*): Self = this.set("AccountDetails", js.Array(value :_*))
    
    @scala.inline
    def setAccountDetails(value: AccountDetailsList): Self = this.set("AccountDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountDetails: Self = this.set("AccountDetails", js.undefined)
  }
}
