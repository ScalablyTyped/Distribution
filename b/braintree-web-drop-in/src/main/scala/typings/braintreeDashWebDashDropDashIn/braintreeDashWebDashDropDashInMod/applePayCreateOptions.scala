package typings.braintreeDashWebDashDropDashIn.braintreeDashWebDashDropDashInMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait applePayCreateOptions extends js.Object {
  var applePaySessionVersion: js.UndefOr[Double] = js.undefined
  var buttonStyle: js.UndefOr[String] = js.undefined
  var displayName: String
  var paymentRequest: js.Any
}

object applePayCreateOptions {
  @scala.inline
  def apply(
    displayName: String,
    paymentRequest: js.Any,
    applePaySessionVersion: Int | Double = null,
    buttonStyle: String = null
  ): applePayCreateOptions = {
    val __obj = js.Dynamic.literal(displayName = displayName, paymentRequest = paymentRequest)
    if (applePaySessionVersion != null) __obj.updateDynamic("applePaySessionVersion")(applePaySessionVersion.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle)
    __obj.asInstanceOf[applePayCreateOptions]
  }
}

