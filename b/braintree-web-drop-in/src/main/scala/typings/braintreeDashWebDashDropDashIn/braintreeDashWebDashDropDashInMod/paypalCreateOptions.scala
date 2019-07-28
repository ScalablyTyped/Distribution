package typings.braintreeDashWebDashDropDashIn.braintreeDashWebDashDropDashInMod

import typings.braintreeDashWebDashDropDashIn.braintreeDashWebDashDropDashInStrings.checkout
import typings.braintreeDashWebDashDropDashIn.braintreeDashWebDashDropDashInStrings.vault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait paypalCreateOptions extends js.Object {
  var amount: js.UndefOr[String | Double] = js.undefined
  var buttonStyle: js.UndefOr[String] = js.undefined
  var commit: js.UndefOr[Boolean] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var flow: checkout | vault
}

object paypalCreateOptions {
  @scala.inline
  def apply(
    flow: checkout | vault,
    amount: String | Double = null,
    buttonStyle: String = null,
    commit: js.UndefOr[Boolean] = js.undefined,
    currency: String = null
  ): paypalCreateOptions = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle)
    if (!js.isUndefined(commit)) __obj.updateDynamic("commit")(commit)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    __obj.asInstanceOf[paypalCreateOptions]
  }
}

