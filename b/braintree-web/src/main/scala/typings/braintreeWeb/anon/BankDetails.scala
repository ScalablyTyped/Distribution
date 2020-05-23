package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BankDetails extends js.Object {
  var bankDetails: js.Any
  var bankLogin: js.Any
  var mandateText: String
}

object BankDetails {
  @scala.inline
  def apply(bankDetails: js.Any, bankLogin: js.Any, mandateText: String): BankDetails = {
    val __obj = js.Dynamic.literal(bankDetails = bankDetails.asInstanceOf[js.Any], bankLogin = bankLogin.asInstanceOf[js.Any], mandateText = mandateText.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankDetails]
  }
}

