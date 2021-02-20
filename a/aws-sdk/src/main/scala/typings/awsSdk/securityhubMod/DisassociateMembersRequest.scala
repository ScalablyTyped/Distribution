package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateMembersRequest extends StObject {
  
  /**
    * The account IDs of the member accounts to disassociate from the master account.
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.native
}
object DisassociateMembersRequest {
  
  @scala.inline
  def apply(): DisassociateMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateMembersRequest]
  }
  
  @scala.inline
  implicit class DisassociateMembersRequestMutableBuilder[Self <: DisassociateMembersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsUndefined: Self = StObject.set(x, "AccountIds", js.undefined)
    
    @scala.inline
    def setAccountIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
  }
}
