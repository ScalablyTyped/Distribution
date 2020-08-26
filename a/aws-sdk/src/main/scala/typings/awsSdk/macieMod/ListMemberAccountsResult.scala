package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMemberAccountsResult extends js.Object {
  /**
    * A list of the Amazon Macie Classic member accounts returned by the action. The current master account is also included in this list. 
    */
  var memberAccounts: js.UndefOr[MemberAccounts] = js.native
  /**
    * When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListMemberAccountsResult {
  @scala.inline
  def apply(): ListMemberAccountsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMemberAccountsResult]
  }
  @scala.inline
  implicit class ListMemberAccountsResultOps[Self <: ListMemberAccountsResult] (val x: Self) extends AnyVal {
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
    def setMemberAccountsVarargs(value: MemberAccount*): Self = this.set("memberAccounts", js.Array(value :_*))
    @scala.inline
    def setMemberAccounts(value: MemberAccounts): Self = this.set("memberAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberAccounts: Self = this.set("memberAccounts", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

