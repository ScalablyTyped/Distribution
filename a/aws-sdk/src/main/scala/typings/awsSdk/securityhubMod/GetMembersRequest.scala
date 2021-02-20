package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMembersRequest extends StObject {
  
  /**
    * The list of account IDs for the Security Hub member accounts to return the details for. 
    */
  var AccountIds: AccountIdList = js.native
}
object GetMembersRequest {
  
  @scala.inline
  def apply(AccountIds: AccountIdList): GetMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMembersRequest]
  }
  
  @scala.inline
  implicit class GetMembersRequestMutableBuilder[Self <: GetMembersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
  }
}
