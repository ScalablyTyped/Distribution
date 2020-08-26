package typings.braintreeWeb.paypalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayPalTokenizePayload extends js.Object {
  var details: PayPalAccountDetails = js.native
  var nonce: String = js.native
  var `type`: String = js.native
}

object PayPalTokenizePayload {
  @scala.inline
  def apply(details: PayPalAccountDetails, nonce: String, `type`: String): PayPalTokenizePayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalTokenizePayload]
  }
  @scala.inline
  implicit class PayPalTokenizePayloadOps[Self <: PayPalTokenizePayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetails(value: PayPalAccountDetails): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

