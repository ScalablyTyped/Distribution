package typings.braintreeWebDropIn.mod

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
    applePaySessionVersion: js.UndefOr[Double] = js.undefined,
    buttonStyle: String = null
  ): applePayCreateOptions = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], paymentRequest = paymentRequest.asInstanceOf[js.Any])
    if (!js.isUndefined(applePaySessionVersion)) __obj.updateDynamic("applePaySessionVersion")(applePaySessionVersion.get.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[applePayCreateOptions]
  }
}

