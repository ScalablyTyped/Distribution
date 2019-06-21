package typings
package braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait applePayCreateOptions extends js.Object {
  var applePaySessionVersion: js.UndefOr[scala.Double] = js.undefined
  var buttonStyle: js.UndefOr[java.lang.String] = js.undefined
  var displayName: java.lang.String
  var paymentRequest: js.Any
}

object applePayCreateOptions {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    paymentRequest: js.Any,
    applePaySessionVersion: scala.Int | scala.Double = null,
    buttonStyle: java.lang.String = null
  ): applePayCreateOptions = {
    val __obj = js.Dynamic.literal(displayName = displayName, paymentRequest = paymentRequest)
    if (applePaySessionVersion != null) __obj.updateDynamic("applePaySessionVersion")(applePaySessionVersion.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle)
    __obj.asInstanceOf[applePayCreateOptions]
  }
}

