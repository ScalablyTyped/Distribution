package typings
package braintreeDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BillingAddress extends js.Object {
  var billingAddress: js.UndefOr[js.Any] = js.undefined
  var cardholderName: js.UndefOr[java.lang.String] = js.undefined
  var vault: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_BillingAddress {
  @scala.inline
  def apply(
    billingAddress: js.Any = null,
    cardholderName: java.lang.String = null,
    vault: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_BillingAddress = {
    val __obj = js.Dynamic.literal()
    if (billingAddress != null) __obj.updateDynamic("billingAddress")(billingAddress)
    if (cardholderName != null) __obj.updateDynamic("cardholderName")(cardholderName)
    if (!js.isUndefined(vault)) __obj.updateDynamic("vault")(vault)
    __obj.asInstanceOf[Anon_BillingAddress]
  }
}

