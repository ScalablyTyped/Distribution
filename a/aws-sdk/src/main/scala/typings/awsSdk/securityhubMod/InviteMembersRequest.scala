package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InviteMembersRequest extends StObject {
  
  /**
    * The list of account IDs of the AWS accounts to invite to Security Hub as members. 
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.undefined
}
object InviteMembersRequest {
  
  @scala.inline
  def apply(): InviteMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviteMembersRequest]
  }
  
  @scala.inline
  implicit class InviteMembersRequestMutableBuilder[Self <: InviteMembersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsUndefined: Self = StObject.set(x, "AccountIds", js.undefined)
    
    @scala.inline
    def setAccountIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
  }
}
