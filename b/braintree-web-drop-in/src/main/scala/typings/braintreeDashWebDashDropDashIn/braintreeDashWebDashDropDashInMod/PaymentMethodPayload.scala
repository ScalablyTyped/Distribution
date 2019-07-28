package typings.braintreeDashWebDashDropDashIn.braintreeDashWebDashDropDashInMod

import org.scalablytyped.runtime.StringDictionary
import typings.braintreeDashWebDashDropDashIn.braintreeDashWebDashDropDashInStrings.AndroidPayCard
import typings.braintreeDashWebDashDropDashIn.braintreeDashWebDashDropDashInStrings.ApplePayCard
import typings.braintreeDashWebDashDropDashIn.braintreeDashWebDashDropDashInStrings.CreditCard
import typings.braintreeDashWebDashDropDashIn.braintreeDashWebDashDropDashInStrings.PayPalAccount
import typings.braintreeDashWebDashDropDashIn.braintreeDashWebDashDropDashInStrings.VenmoAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodPayload
  extends /* key */ StringDictionary[js.Any] {
  var details: js.Object
  var deviceData: String | Null
  var nonce: String
  var `type`: CreditCard | PayPalAccount | VenmoAccount | AndroidPayCard | ApplePayCard
}

object PaymentMethodPayload {
  @scala.inline
  def apply(
    details: js.Object,
    nonce: String,
    `type`: CreditCard | PayPalAccount | VenmoAccount | AndroidPayCard | ApplePayCard,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    deviceData: String = null
  ): PaymentMethodPayload = {
    val __obj = js.Dynamic.literal(details = details, nonce = nonce)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (deviceData != null) __obj.updateDynamic("deviceData")(deviceData)
    __obj.asInstanceOf[PaymentMethodPayload]
  }
}

