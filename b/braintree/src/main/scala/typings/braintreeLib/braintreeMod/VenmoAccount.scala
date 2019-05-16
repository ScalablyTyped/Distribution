package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "VenmoAccount")
@js.native
class VenmoAccount () extends PaymentMethod {
  var createdAt: stdLib.Date = js.native
  var customerId: java.lang.String = js.native
  var default: scala.Boolean = js.native
  var imageUrl: java.lang.String = js.native
  var sourceDescription: java.lang.String = js.native
  var subscriptions: js.UndefOr[js.Array[Subscription]] = js.native
  var token: java.lang.String = js.native
  var updatedAt: stdLib.Date = js.native
  var username: java.lang.String = js.native
  var venmoUserId: java.lang.String = js.native
}

