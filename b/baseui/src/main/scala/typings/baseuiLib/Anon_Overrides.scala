package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Overrides extends js.Object {
  var overrides: js.UndefOr[baseuiLib.paymentDashCardMod.PaymentCardOverrides] = js.undefined
}

object Anon_Overrides {
  @scala.inline
  def apply(overrides: baseuiLib.paymentDashCardMod.PaymentCardOverrides = null): Anon_Overrides = {
    val __obj = js.Dynamic.literal()
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[Anon_Overrides]
  }
}

