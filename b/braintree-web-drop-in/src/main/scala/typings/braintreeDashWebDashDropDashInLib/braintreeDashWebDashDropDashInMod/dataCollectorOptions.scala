package typings
package braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dataCollectorOptions extends js.Object {
  var kount: js.UndefOr[scala.Boolean] = js.undefined
  var paypal: js.UndefOr[scala.Boolean] = js.undefined
}

object dataCollectorOptions {
  @scala.inline
  def apply(kount: js.UndefOr[scala.Boolean] = js.undefined, paypal: js.UndefOr[scala.Boolean] = js.undefined): dataCollectorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(kount)) __obj.updateDynamic("kount")(kount)
    if (!js.isUndefined(paypal)) __obj.updateDynamic("paypal")(paypal)
    __obj.asInstanceOf[dataCollectorOptions]
  }
}

