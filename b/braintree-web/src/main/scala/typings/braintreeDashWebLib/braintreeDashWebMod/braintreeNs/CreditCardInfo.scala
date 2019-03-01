package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("billingAddress")(billingAddress)
    __obj.updateDynamic("cvv")(cvv)
    __obj.updateDynamic("expirationDate")(expirationDate)
    __obj.updateDynamic("number")(number)
    __obj.asInstanceOf[CreditCardInfo]
  }
}

