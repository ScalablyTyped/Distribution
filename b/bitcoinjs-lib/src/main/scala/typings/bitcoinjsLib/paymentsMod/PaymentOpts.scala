package typings.bitcoinjsLib.paymentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentOpts extends js.Object {
  var allowIncomplete: js.UndefOr[Boolean] = js.undefined
  var validate: js.UndefOr[Boolean] = js.undefined
}

object PaymentOpts {
  @scala.inline
  def apply(allowIncomplete: js.UndefOr[Boolean] = js.undefined, validate: js.UndefOr[Boolean] = js.undefined): PaymentOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowIncomplete)) __obj.updateDynamic("allowIncomplete")(allowIncomplete.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentOpts]
  }
}

