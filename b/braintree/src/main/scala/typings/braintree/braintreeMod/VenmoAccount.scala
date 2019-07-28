package typings.braintree.braintreeMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "VenmoAccount")
@js.native
class VenmoAccount () extends PaymentMethod {
  var createdAt: Date = js.native
  var customerId: String = js.native
  var default: Boolean = js.native
  var imageUrl: String = js.native
  var sourceDescription: String = js.native
  var subscriptions: js.UndefOr[js.Array[Subscription]] = js.native
  var token: String = js.native
  var updatedAt: Date = js.native
  var username: String = js.native
  var venmoUserId: String = js.native
}

