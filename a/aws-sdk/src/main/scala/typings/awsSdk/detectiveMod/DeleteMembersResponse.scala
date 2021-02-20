package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMembersResponse extends StObject {
  
  /**
    * The list of AWS account identifiers for the member accounts that Detective successfully deleted from the behavior graph.
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.native
  
  /**
    * The list of member accounts that Detective was not able to delete from the behavior graph. For each member account, provides the reason that the deletion could not be processed.
    */
  var UnprocessedAccounts: js.UndefOr[UnprocessedAccountList] = js.native
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
    def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsUndefined: Self = StObject.set(x, "AccountIds", js.undefined)
    
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedAccounts(value: UnprocessedAccountList): Self = StObject.set(x, "UnprocessedAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedAccountsUndefined: Self = StObject.set(x, "UnprocessedAccounts", js.undefined)
    
    @scala.inline
    def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = StObject.set(x, "UnprocessedAccounts", js.Array(value :_*))
  }
}
