package typings.braintreeWebDropIn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequired extends js.Object {
  var required: js.UndefOr[Boolean] = js.undefined
}

object AnonRequired {
  @scala.inline
  def apply(required: js.UndefOr[Boolean] = js.undefined): AnonRequired = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequired]
  }
}

