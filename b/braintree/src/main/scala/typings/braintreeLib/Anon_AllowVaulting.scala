package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowVaulting extends js.Object {
  var allowVaulting: js.UndefOr[scala.Boolean] = js.undefined
  var includeBillingPostalCode: js.UndefOr[scala.Boolean] = js.undefined
  var revokeAfter: js.UndefOr[stdLib.Date] = js.undefined
}

object Anon_AllowVaulting {
  @scala.inline
  def apply(
    allowVaulting: js.UndefOr[scala.Boolean] = js.undefined,
    includeBillingPostalCode: js.UndefOr[scala.Boolean] = js.undefined,
    revokeAfter: stdLib.Date = null
  ): Anon_AllowVaulting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowVaulting)) __obj.updateDynamic("allowVaulting")(allowVaulting)
    if (!js.isUndefined(includeBillingPostalCode)) __obj.updateDynamic("includeBillingPostalCode")(includeBillingPostalCode)
    if (revokeAfter != null) __obj.updateDynamic("revokeAfter")(revokeAfter)
    __obj.asInstanceOf[Anon_AllowVaulting]
  }
}

