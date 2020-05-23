package typings.braintreeWebDropIn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dataCollectorOptions extends js.Object {
  var kount: js.UndefOr[Boolean] = js.undefined
  var paypal: js.UndefOr[Boolean] = js.undefined
}

object dataCollectorOptions {
  @scala.inline
  def apply(kount: js.UndefOr[Boolean] = js.undefined, paypal: js.UndefOr[Boolean] = js.undefined): dataCollectorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(kount)) __obj.updateDynamic("kount")(kount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paypal)) __obj.updateDynamic("paypal")(paypal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dataCollectorOptions]
  }
}

