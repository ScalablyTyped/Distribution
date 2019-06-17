package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenOverrides extends js.Object {
  var children: js.UndefOr[scala.Nothing] = js.undefined
  var overrides: js.UndefOr[baseuiLib.paymentDashCardMod.PaymentCardOverrides] = js.undefined
}

object Anon_ChildrenOverrides {
  @scala.inline
  def apply(
    children: js.UndefOr[scala.Nothing] = js.undefined,
    overrides: baseuiLib.paymentDashCardMod.PaymentCardOverrides = null
  ): Anon_ChildrenOverrides = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[Anon_ChildrenOverrides]
  }
}

