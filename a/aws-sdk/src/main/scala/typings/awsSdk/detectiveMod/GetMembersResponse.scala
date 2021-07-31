package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMembersResponse extends StObject {
  
  /**
    * The member account details that Detective is returning in response to the request.
    */
  var MemberDetails: js.UndefOr[MemberDetailList] = js.undefined
  
  /**
    * The requested member accounts for which Detective was unable to return member details. For each account, provides the reason why the request could not be processed.
    */
  var UnprocessedAccounts: js.UndefOr[UnprocessedAccountList] = js.undefined
}
object GetMembersResponse {
  
  @scala.inline
  def apply(): GetMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMembersResponse]
  }
  
  @scala.inline
  implicit class GetMembersResponseMutableBuilder[Self <: GetMembersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberDetails(value: MemberDetailList): Self = StObject.set(x, "MemberDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberDetailsUndefined: Self = StObject.set(x, "MemberDetails", js.undefined)
    
    @scala.inline
    def setMemberDetailsVarargs(value: MemberDetail*): Self = StObject.set(x, "MemberDetails", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedAccounts(value: UnprocessedAccountList): Self = StObject.set(x, "UnprocessedAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedAccountsUndefined: Self = StObject.set(x, "UnprocessedAccounts", js.undefined)
    
    @scala.inline
    def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = StObject.set(x, "UnprocessedAccounts", js.Array(value :_*))
  }
}
