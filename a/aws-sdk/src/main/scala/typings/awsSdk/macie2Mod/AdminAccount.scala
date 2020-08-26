package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminAccount extends js.Object {
  /**
    * The AWS account ID for the account.
    */
  var accountId: js.UndefOr[string] = js.native
  /**
    * The current status of the account as a delegated administrator of Amazon Macie for the organization.
    */
  var status: js.UndefOr[AdminStatus] = js.native
}

object AdminAccount {
  @scala.inline
  def apply(): AdminAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminAccount]
  }
  @scala.inline
  implicit class AdminAccountOps[Self <: AdminAccount] (val x: Self) extends AnyVal {
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
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setStatus(value: AdminStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

