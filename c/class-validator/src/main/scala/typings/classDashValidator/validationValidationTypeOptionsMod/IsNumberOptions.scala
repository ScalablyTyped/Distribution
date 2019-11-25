package typings.classDashValidator.validationValidationTypeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsNumberOptions extends js.Object {
  var allowInfinity: js.UndefOr[Boolean] = js.undefined
  var allowNaN: js.UndefOr[Boolean] = js.undefined
}

object IsNumberOptions {
  @scala.inline
  def apply(allowInfinity: js.UndefOr[Boolean] = js.undefined, allowNaN: js.UndefOr[Boolean] = js.undefined): IsNumberOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowInfinity)) __obj.updateDynamic("allowInfinity")(allowInfinity.asInstanceOf[js.Any])
    if (!js.isUndefined(allowNaN)) __obj.updateDynamic("allowNaN")(allowNaN.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNumberOptions]
  }
}

