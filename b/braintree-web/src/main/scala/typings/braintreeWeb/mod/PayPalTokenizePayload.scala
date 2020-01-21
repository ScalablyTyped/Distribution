package typings.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayPalTokenizePayload extends js.Object {
  var details: PayPalAccountDetails
  var nonce: String
  var `type`: String
}

object PayPalTokenizePayload {
  @scala.inline
  def apply(details: PayPalAccountDetails, nonce: String, `type`: String): PayPalTokenizePayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalTokenizePayload]
  }
}

