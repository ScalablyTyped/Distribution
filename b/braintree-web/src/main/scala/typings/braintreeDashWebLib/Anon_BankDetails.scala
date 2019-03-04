package typings
package braintreeDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BankDetails extends js.Object {
  var bankDetails: js.Any
  var bankLogin: js.Any
  var mandateText: java.lang.String
}

object Anon_BankDetails {
  @scala.inline
  def apply(bankDetails: js.Any, bankLogin: js.Any, mandateText: java.lang.String): Anon_BankDetails = {
    val __obj = js.Dynamic.literal(bankDetails = bankDetails, bankLogin = bankLogin, mandateText = mandateText)
  
    __obj.asInstanceOf[Anon_BankDetails]
  }
}

