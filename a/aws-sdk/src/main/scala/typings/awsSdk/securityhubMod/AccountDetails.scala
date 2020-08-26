package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountDetails extends js.Object {
  /**
    * The ID of an AWS account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.securityhubMod.AccountId] = js.native
  /**
    * The email of an AWS account.
    */
  var Email: js.UndefOr[NonEmptyString] = js.native
}

object AccountDetails {
  @scala.inline
  def apply(): AccountDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountDetails]
  }
  @scala.inline
  implicit class AccountDetailsOps[Self <: AccountDetails] (val x: Self) extends AnyVal {
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    @scala.inline
    def setEmail(value: NonEmptyString): Self = this.set("Email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("Email", js.undefined)
  }
  
}

