package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountDetail extends js.Object {
  /**
    * The AWS account ID for the account.
    */
  var accountId: string = js.native
  /**
    * The email address for the account.
    */
  var email: string = js.native
}

object AccountDetail {
  @scala.inline
  def apply(accountId: string, email: string): AccountDetail = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountDetail]
  }
  @scala.inline
  implicit class AccountDetailOps[Self <: AccountDetail] (val x: Self) extends AnyVal {
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
    def setAccountId(value: string): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: string): Self = this.set("email", value.asInstanceOf[js.Any])
  }
  
}

