package typings.baseui

import typings.baseui.paymentDashCardMod.PaymentCardOverrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Overrides extends js.Object {
  var overrides: js.UndefOr[PaymentCardOverrides] = js.undefined
}

object Anon_Overrides {
  @scala.inline
  def apply(overrides: PaymentCardOverrides = null): Anon_Overrides = {
    val __obj = js.Dynamic.literal()
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Overrides]
  }
}

