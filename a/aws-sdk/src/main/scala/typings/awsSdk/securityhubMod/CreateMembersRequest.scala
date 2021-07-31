package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMembersRequest extends StObject {
  
  /**
    * The list of accounts to associate with the Security Hub master account. For each account, the list includes the account ID and the email address.
    */
  var AccountDetails: js.UndefOr[AccountDetailsList] = js.undefined
}
object CreateMembersRequest {
  
  @scala.inline
  def apply(): CreateMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMembersRequest]
  }
  
  @scala.inline
  implicit class CreateMembersRequestMutableBuilder[Self <: CreateMembersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountDetails(value: AccountDetailsList): Self = StObject.set(x, "AccountDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountDetailsUndefined: Self = StObject.set(x, "AccountDetails", js.undefined)
    
    @scala.inline
    def setAccountDetailsVarargs(value: AccountDetails*): Self = StObject.set(x, "AccountDetails", js.Array(value :_*))
  }
}
