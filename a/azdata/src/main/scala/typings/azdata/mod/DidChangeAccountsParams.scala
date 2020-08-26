package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DidChangeAccountsParams extends js.Object {
  // Updated accounts
  var accounts: js.Array[Account] = js.native
}

object DidChangeAccountsParams {
  @scala.inline
  def apply(accounts: js.Array[Account]): DidChangeAccountsParams = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidChangeAccountsParams]
  }
  @scala.inline
  implicit class DidChangeAccountsParamsOps[Self <: DidChangeAccountsParams] (val x: Self) extends AnyVal {
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
    def setAccountsVarargs(value: Account*): Self = this.set("accounts", js.Array(value :_*))
    @scala.inline
    def setAccounts(value: js.Array[Account]): Self = this.set("accounts", value.asInstanceOf[js.Any])
  }
  
}

