package typings.braintreeDashWeb.braintreeDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayPalBillingAddress extends js.Object {
  var city: String
  var countryCode: String
  var line1: String
  var line2: String
  var postalCode: String
  var state: String
}

object PayPalBillingAddress {
  @scala.inline
  def apply(city: String, countryCode: String, line1: String, line2: String, postalCode: String, state: String): PayPalBillingAddress = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], line1 = line1.asInstanceOf[js.Any], line2 = line2.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PayPalBillingAddress]
  }
}

