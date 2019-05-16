package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "ApplePayCard")
@js.native
class ApplePayCard () extends PaymentMethod {
  var bin: java.lang.String = js.native
  var cardType: java.lang.String = js.native
  var cardholderName: java.lang.String = js.native
  var createdAt: stdLib.Date = js.native
  var customerId: java.lang.String = js.native
  var default: scala.Boolean = js.native
  var expirationMonth: java.lang.String = js.native
  var expirationYear: java.lang.String = js.native
  var expired: scala.Boolean = js.native
  var imageUrl: java.lang.String = js.native
  var last4: java.lang.String = js.native
  var paymentInsuranceName: java.lang.String = js.native
  var sourceDescription: java.lang.String = js.native
  var subscriptions: js.UndefOr[js.Array[Subscription]] = js.native
  var token: java.lang.String = js.native
  var updatedAt: stdLib.Date = js.native
}

