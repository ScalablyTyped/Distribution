package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMembersRequest extends StObject {
  
  /**
    * The list of account IDs for the member accounts to delete.
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.native
}
object DeleteMembersRequest {
  
  @scala.inline
  def apply(): DeleteMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMembersRequest]
  }
  
  @scala.inline
  implicit class DeleteMembersRequestMutableBuilder[Self <: DeleteMembersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsUndefined: Self = StObject.set(x, "AccountIds", js.undefined)
    
    @scala.inline
    def setAccountIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
  }
}
