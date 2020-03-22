package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DidChangeAccountsParams extends js.Object {
  // Updated accounts
  var accounts: js.Array[Account]
}

object DidChangeAccountsParams {
  @scala.inline
  def apply(accounts: js.Array[Account]): DidChangeAccountsParams = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DidChangeAccountsParams]
  }
}

