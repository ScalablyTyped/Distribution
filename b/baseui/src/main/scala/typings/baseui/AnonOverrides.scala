package typings.baseui

import typings.baseui.paymentCardMod.PaymentCardOverrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOverrides extends js.Object {
  var overrides: js.UndefOr[PaymentCardOverrides] = js.undefined
}

object AnonOverrides {
  @scala.inline
  def apply(overrides: PaymentCardOverrides = null): AnonOverrides = {
    val __obj = js.Dynamic.literal()
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOverrides]
  }
}

