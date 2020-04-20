package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccountNotAuthorizedContactUs extends js.Object {
  var AccountNotAuthorizedContactUs: String
  var AnotherUsBankMerchantAccount: String
  var Approve: String
  var BankRejectedNone: String
  var BankRejectedUpdateFundingInformation: String
  var InsufficientFundsContactUs: String
  var UsBankMerchantAccount: String
}

object AnonAccountNotAuthorizedContactUs {
  @scala.inline
  def apply(
    AccountNotAuthorizedContactUs: String,
    AnotherUsBankMerchantAccount: String,
    Approve: String,
    BankRejectedNone: String,
    BankRejectedUpdateFundingInformation: String,
    InsufficientFundsContactUs: String,
    UsBankMerchantAccount: String
  ): AnonAccountNotAuthorizedContactUs = {
    val __obj = js.Dynamic.literal(AccountNotAuthorizedContactUs = AccountNotAuthorizedContactUs.asInstanceOf[js.Any], AnotherUsBankMerchantAccount = AnotherUsBankMerchantAccount.asInstanceOf[js.Any], Approve = Approve.asInstanceOf[js.Any], BankRejectedNone = BankRejectedNone.asInstanceOf[js.Any], BankRejectedUpdateFundingInformation = BankRejectedUpdateFundingInformation.asInstanceOf[js.Any], InsufficientFundsContactUs = InsufficientFundsContactUs.asInstanceOf[js.Any], UsBankMerchantAccount = UsBankMerchantAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccountNotAuthorizedContactUs]
  }
}

