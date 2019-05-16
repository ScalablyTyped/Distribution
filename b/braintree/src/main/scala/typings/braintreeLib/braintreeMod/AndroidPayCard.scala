package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "AndroidPayCard")
@js.native
class AndroidPayCard () extends PaymentMethod {
  var bin: java.lang.String = js.native
  var createdAt: stdLib.Date = js.native
  var customerId: java.lang.String = js.native
  var default: scala.Boolean = js.native
  var expirationMonth: java.lang.String = js.native
  var expirationYear: java.lang.String = js.native
  var googleTransactionId: java.lang.String = js.native
  var imageUrl: java.lang.String = js.native
  var sourceCardLast4: java.lang.String = js.native
  var sourceCardType: java.lang.String = js.native
  var sourceDescription: java.lang.String = js.native
  var subscriptions: js.UndefOr[js.Array[Subscription]] = js.native
  var token: java.lang.String = js.native
  var updatedAt: stdLib.Date = js.native
  var virtualCardLast4: java.lang.String = js.native
  var virtualCardType: java.lang.String = js.native
}

