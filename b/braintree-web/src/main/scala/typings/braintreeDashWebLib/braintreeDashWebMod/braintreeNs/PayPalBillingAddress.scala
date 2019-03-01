package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayPalBillingAddress extends js.Object {
  var city: java.lang.String
  var countryCode: java.lang.String
  var line1: java.lang.String
  var line2: java.lang.String
  var postalCode: java.lang.String
  var state: java.lang.String
}

object PayPalBillingAddress {
  @scala.inline
  def apply(
    city: java.lang.String,
    countryCode: java.lang.String,
    line1: java.lang.String,
    line2: java.lang.String,
    postalCode: java.lang.String,
    state: java.lang.String
  ): PayPalBillingAddress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("countryCode")(countryCode)
    __obj.updateDynamic("line1")(line1)
    __obj.updateDynamic("line2")(line2)
    __obj.updateDynamic("postalCode")(postalCode)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[PayPalBillingAddress]
  }
}

