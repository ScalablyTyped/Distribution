package typings.braintreeWebDropIn.mod

import org.scalablytyped.runtime.StringDictionary
import typings.braintreeWebDropIn.braintreeWebDropInStrings.AndroidPayCard
import typings.braintreeWebDropIn.braintreeWebDropInStrings.ApplePayCard
import typings.braintreeWebDropIn.braintreeWebDropInStrings.CreditCard
import typings.braintreeWebDropIn.braintreeWebDropInStrings.PayPalAccount
import typings.braintreeWebDropIn.braintreeWebDropInStrings.VenmoAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentMethodPayload
  extends /* key */ StringDictionary[js.Any] {
  var details: js.Object = js.native
  var deviceData: String | Null = js.native
  var nonce: String = js.native
  var `type`: CreditCard | PayPalAccount | VenmoAccount | AndroidPayCard | ApplePayCard = js.native
}

object PaymentMethodPayload {
  @scala.inline
  def apply(
    details: js.Object,
    nonce: String,
    `type`: CreditCard | PayPalAccount | VenmoAccount | AndroidPayCard | ApplePayCard
  ): PaymentMethodPayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodPayload]
  }
  @scala.inline
  implicit class PaymentMethodPayloadOps[Self <: PaymentMethodPayload] (val x: Self) extends AnyVal {
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
    def setDetails(value: js.Object): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: CreditCard | PayPalAccount | VenmoAccount | AndroidPayCard | ApplePayCard): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceData(value: String): Self = this.set("deviceData", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceDataNull: Self = this.set("deviceData", null)
  }
  
}

