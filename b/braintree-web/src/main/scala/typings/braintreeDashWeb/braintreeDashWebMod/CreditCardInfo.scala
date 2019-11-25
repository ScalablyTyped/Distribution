package typings.braintreeDashWeb.braintreeDashWebMod

import typings.braintreeDashWeb.Anon_PostalCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditCardInfo extends js.Object {
  var billingAddress: Anon_PostalCode
  var cvv: String
  var expirationDate: String
  var number: String
}

object CreditCardInfo {
  @scala.inline
  def apply(billingAddress: Anon_PostalCode, cvv: String, expirationDate: String, number: String): CreditCardInfo = {
    val __obj = js.Dynamic.literal(billingAddress = billingAddress.asInstanceOf[js.Any], cvv = cvv.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreditCardInfo]
  }
}

