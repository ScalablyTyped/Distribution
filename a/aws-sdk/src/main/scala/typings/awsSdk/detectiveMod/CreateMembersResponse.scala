package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMembersResponse extends StObject {
  
  /**
    * The set of member account invitation requests that Detective was able to process. This includes accounts that are being verified, that failed verification, and that passed verification and are being sent an invitation.
    */
  var Members: js.UndefOr[MemberDetailList] = js.undefined
  
  /**
    * The list of accounts for which Detective was unable to process the invitation request. For each account, the list provides the reason why the request could not be processed. The list includes accounts that are already member accounts in the behavior graph.
    */
  var UnprocessedAccounts: js.UndefOr[UnprocessedAccountList] = js.undefined
}
object CreateMembersResponse {
  
  @scala.inline
  def apply(): CreateMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMembersResponse]
  }
  
  @scala.inline
  implicit class CreateMembersResponseMutableBuilder[Self <: CreateMembersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: MemberDetailList): Self = StObject.set(x, "Members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "Members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: MemberDetail*): Self = StObject.set(x, "Members", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedAccounts(value: UnprocessedAccountList): Self = StObject.set(x, "UnprocessedAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedAccountsUndefined: Self = StObject.set(x, "UnprocessedAccounts", js.undefined)
    
    @scala.inline
    def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = StObject.set(x, "UnprocessedAccounts", js.Array(value :_*))
  }
}
