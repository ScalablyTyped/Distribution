package typings
package braintreeDashWebLib.braintreeDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditCardInfo extends js.Object {
  var billingAddress: braintreeDashWebLib.Anon_PostalCode
  var cvv: java.lang.String
  var expirationDate: java.lang.String
  var number: java.lang.String
}

object CreditCardInfo {
  @scala.inline
  def apply(
    billingAddress: braintreeDashWebLib.Anon_PostalCode,
    cvv: java.lang.String,
    expirationDate: java.lang.String,
    number: java.lang.String
  ): CreditCardInfo = {
    val __obj = js.Dynamic.literal(billingAddress = billingAddress, cvv = cvv, expirationDate = expirationDate, number = number)
  
    __obj.asInstanceOf[CreditCardInfo]
  }
}

