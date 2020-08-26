package typings.awsSdk.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAccountsResponse extends js.Object {
  /**
    * A paginated response with the list of account information and the next token if more results are available.
    */
  var accountList: js.UndefOr[AccountListType] = js.native
  /**
    * The page token client that is used to retrieve the list of accounts.
    */
  var nextToken: js.UndefOr[NextTokenType] = js.native
}

object ListAccountsResponse {
  @scala.inline
  def apply(): ListAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountsResponse]
  }
  @scala.inline
  implicit class ListAccountsResponseOps[Self <: ListAccountsResponse] (val x: Self) extends AnyVal {
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
    def setAccountListVarargs(value: AccountInfo*): Self = this.set("accountList", js.Array(value :_*))
    @scala.inline
    def setAccountList(value: AccountListType): Self = this.set("accountList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountList: Self = this.set("accountList", js.undefined)
    @scala.inline
    def setNextToken(value: NextTokenType): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

