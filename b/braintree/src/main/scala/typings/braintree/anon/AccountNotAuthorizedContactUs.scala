package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountNotAuthorizedContactUs extends js.Object {
  var AccountNotAuthorizedContactUs: String = js.native
  var AnotherUsBankMerchantAccount: String = js.native
  var Approve: String = js.native
  var BankRejectedNone: String = js.native
  var BankRejectedUpdateFundingInformation: String = js.native
  var InsufficientFundsContactUs: String = js.native
  var UsBankMerchantAccount: String = js.native
}

object AccountNotAuthorizedContactUs {
  @scala.inline
  def apply(
    AccountNotAuthorizedContactUs: String,
    AnotherUsBankMerchantAccount: String,
    Approve: String,
    BankRejectedNone: String,
    BankRejectedUpdateFundingInformation: String,
    InsufficientFundsContactUs: String,
    UsBankMerchantAccount: String
  ): AccountNotAuthorizedContactUs = {
    val __obj = js.Dynamic.literal(AccountNotAuthorizedContactUs = AccountNotAuthorizedContactUs.asInstanceOf[js.Any], AnotherUsBankMerchantAccount = AnotherUsBankMerchantAccount.asInstanceOf[js.Any], Approve = Approve.asInstanceOf[js.Any], BankRejectedNone = BankRejectedNone.asInstanceOf[js.Any], BankRejectedUpdateFundingInformation = BankRejectedUpdateFundingInformation.asInstanceOf[js.Any], InsufficientFundsContactUs = InsufficientFundsContactUs.asInstanceOf[js.Any], UsBankMerchantAccount = UsBankMerchantAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountNotAuthorizedContactUs]
  }
  @scala.inline
  implicit class AccountNotAuthorizedContactUsOps[Self <: AccountNotAuthorizedContactUs] (val x: Self) extends AnyVal {
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
    def setAccountNotAuthorizedContactUs(value: String): Self = this.set("AccountNotAuthorizedContactUs", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnotherUsBankMerchantAccount(value: String): Self = this.set("AnotherUsBankMerchantAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def setApprove(value: String): Self = this.set("Approve", value.asInstanceOf[js.Any])
    @scala.inline
    def setBankRejectedNone(value: String): Self = this.set("BankRejectedNone", value.asInstanceOf[js.Any])
    @scala.inline
    def setBankRejectedUpdateFundingInformation(value: String): Self = this.set("BankRejectedUpdateFundingInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsufficientFundsContactUs(value: String): Self = this.set("InsufficientFundsContactUs", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsBankMerchantAccount(value: String): Self = this.set("UsBankMerchantAccount", value.asInstanceOf[js.Any])
  }
  
}

