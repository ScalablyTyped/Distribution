package typings.braintreeWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBankDetails extends js.Object {
  var bankDetails: js.Any
  var bankLogin: js.Any
  var mandateText: String
}

object AnonBankDetails {
  @scala.inline
  def apply(bankDetails: js.Any, bankLogin: js.Any, mandateText: String): AnonBankDetails = {
    val __obj = js.Dynamic.literal(bankDetails = bankDetails.asInstanceOf[js.Any], bankLogin = bankLogin.asInstanceOf[js.Any], mandateText = mandateText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBankDetails]
  }
}

