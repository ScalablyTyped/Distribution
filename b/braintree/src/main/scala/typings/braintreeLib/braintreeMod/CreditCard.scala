package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "CreditCard")
@js.native
class CreditCard () extends PaymentMethod {
  var billingAddress: js.UndefOr[Address] = js.native
  var bin: java.lang.String = js.native
  var cardType: java.lang.String = js.native
  var cardholderName: js.UndefOr[java.lang.String] = js.native
  var commercial: Commercial = js.native
  var countryOfIssuance: java.lang.String = js.native
  var createdAt: stdLib.Date = js.native
  var customerId: java.lang.String = js.native
  var customerLocation: CustomerLocation = js.native
  var debit: java.lang.String = js.native
  var default: scala.Boolean = js.native
  var durbinRegulated: DurbinRegulated = js.native
  var expirationDate: js.UndefOr[java.lang.String] = js.native
  var expirationMonth: js.UndefOr[java.lang.String] = js.native
  var expirationYear: js.UndefOr[java.lang.String] = js.native
  var expired: scala.Boolean = js.native
  var healthcare: HealthCare = js.native
  var imageUrl: java.lang.String = js.native
  var issuingBank: java.lang.String = js.native
  var last4: java.lang.String = js.native
  var maskedNumber: java.lang.String = js.native
  var payroll: Payroll = js.native
  var prepaid: Prepaid = js.native
  var productId: java.lang.String = js.native
  var subscriptions: js.UndefOr[js.Array[Subscription]] = js.native
  var token: java.lang.String = js.native
  var uniqueNumberIdentifier: java.lang.String = js.native
  var updatedAt: stdLib.Date = js.native
  var verification: js.UndefOr[CreditCardVerification] = js.native
}

