package typings
package braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait paypalCreateOptions extends js.Object {
  var amount: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var buttonStyle: js.UndefOr[java.lang.String] = js.undefined
  var commit: js.UndefOr[scala.Boolean] = js.undefined
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var flow: braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInLibStrings.checkout | braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInLibStrings.vault
}

object paypalCreateOptions {
  @scala.inline
  def apply(
    flow: braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInLibStrings.checkout | braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInLibStrings.vault,
    amount: java.lang.String | scala.Double = null,
    buttonStyle: java.lang.String = null,
    commit: js.UndefOr[scala.Boolean] = js.undefined,
    currency: java.lang.String = null
  ): paypalCreateOptions = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle)
    if (!js.isUndefined(commit)) __obj.updateDynamic("commit")(commit)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    __obj.asInstanceOf[paypalCreateOptions]
  }
}

