package typings
package braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodPayload
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var details: js.Object
  var deviceData: java.lang.String | scala.Null
  var nonce: java.lang.String
  var `type`: braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInLibStrings.CreditCard | braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInLibStrings.PayPalAccount | braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInLibStrings.VenmoAccount | braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInLibStrings.AndroidPayCard | braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInLibStrings.ApplePayCard
}

object PaymentMethodPayload {
  @scala.inline
  def apply(
    details: js.Object,
    nonce: java.lang.String,
    `type`: braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInLibStrings.CreditCard | braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInLibStrings.PayPalAccount | braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInLibStrings.VenmoAccount | braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInLibStrings.AndroidPayCard | braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInLibStrings.ApplePayCard,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    deviceData: java.lang.String = null
  ): PaymentMethodPayload = {
    val __obj = js.Dynamic.literal(details = details, nonce = nonce)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (deviceData != null) __obj.updateDynamic("deviceData")(deviceData)
    __obj.asInstanceOf[PaymentMethodPayload]
  }
}

