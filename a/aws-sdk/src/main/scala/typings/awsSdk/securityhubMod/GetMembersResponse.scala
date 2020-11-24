package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMembersResponse extends js.Object {
  
  /**
    * The list of details about the Security Hub member accounts.
    */
  var Members: js.UndefOr[MemberList] = js.native
  
  /**
    * The list of AWS accounts that could not be processed. For each account, the list includes the account ID and the email address.
    */
  var UnprocessedAccounts: js.UndefOr[ResultList] = js.native
}
object GetMembersResponse {
  
  @scala.inline
  def apply(): GetMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMembersResponse]
  }
  
  @scala.inline
  implicit class GetMembersResponseOps[Self <: GetMembersResponse] (val x: Self) extends AnyVal {
    
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
    def setMembersVarargs(value: Member*): Self = this.set("Members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: MemberList): Self = this.set("Members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembers: Self = this.set("Members", js.undefined)
    
    @scala.inline
    def setUnprocessedAccountsVarargs(value: Result*): Self = this.set("UnprocessedAccounts", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedAccounts(value: ResultList): Self = this.set("UnprocessedAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnprocessedAccounts: Self = this.set("UnprocessedAccounts", js.undefined)
  }
}
