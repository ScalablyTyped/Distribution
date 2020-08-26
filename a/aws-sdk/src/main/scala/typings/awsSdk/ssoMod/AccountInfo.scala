package typings.awsSdk.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountInfo extends js.Object {
  /**
    * The identifier of the AWS account that is assigned to the user.
    */
  var accountId: js.UndefOr[AccountIdType] = js.native
  /**
    * The display name of the AWS account that is assigned to the user.
    */
  var accountName: js.UndefOr[AccountNameType] = js.native
  /**
    * The email address of the AWS account that is assigned to the user.
    */
  var emailAddress: js.UndefOr[EmailAddressType] = js.native
}

object AccountInfo {
  @scala.inline
  def apply(): AccountInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountInfo]
  }
  @scala.inline
  implicit class AccountInfoOps[Self <: AccountInfo] (val x: Self) extends AnyVal {
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
    def setAccountId(value: AccountIdType): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setAccountName(value: AccountNameType): Self = this.set("accountName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountName: Self = this.set("accountName", js.undefined)
    @scala.inline
    def setEmailAddress(value: EmailAddressType): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
  }
  
}

