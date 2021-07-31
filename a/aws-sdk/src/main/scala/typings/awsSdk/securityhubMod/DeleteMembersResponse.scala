package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMembersResponse extends StObject {
  
  /**
    * The list of AWS accounts that were not deleted. For each account, the list includes the account ID and the email address.
    */
  var UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined
}
object DeleteMembersResponse {
  
  @scala.inline
  def apply(): DeleteMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMembersResponse]
  }
  
  @scala.inline
  implicit class DeleteMembersResponseMutableBuilder[Self <: DeleteMembersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnprocessedAccounts(value: ResultList): Self = StObject.set(x, "UnprocessedAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedAccountsUndefined: Self = StObject.set(x, "UnprocessedAccounts", js.undefined)
    
    @scala.inline
    def setUnprocessedAccountsVarargs(value: Result*): Self = StObject.set(x, "UnprocessedAccounts", js.Array(value :_*))
  }
}
