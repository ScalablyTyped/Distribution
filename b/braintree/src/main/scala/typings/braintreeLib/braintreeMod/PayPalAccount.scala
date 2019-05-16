package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "PayPalAccount")
@js.native
class PayPalAccount () extends PaymentMethod {
  var billingAgreementId: java.lang.String = js.native
  var createdAt: stdLib.Date = js.native
  var customerId: java.lang.String = js.native
  var default: scala.Boolean = js.native
  var email: java.lang.String = js.native
  var imageUrl: java.lang.String = js.native
  var payerId: java.lang.String = js.native
  var revokedAt: java.lang.String = js.native
  var subscriptions: js.UndefOr[js.Array[Subscription]] = js.native
  var token: java.lang.String = js.native
  var updatedAt: stdLib.Date = js.native
}

