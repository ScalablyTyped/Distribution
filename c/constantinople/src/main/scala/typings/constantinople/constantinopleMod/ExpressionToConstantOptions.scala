package typings.constantinople.constantinopleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionToConstantOptions extends js.Object {
  var constants: js.UndefOr[js.Any] = js.undefined
}

object ExpressionToConstantOptions {
  @scala.inline
  def apply(constants: js.Any = null): ExpressionToConstantOptions = {
    val __obj = js.Dynamic.literal()
    if (constants != null) __obj.updateDynamic("constants")(constants.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionToConstantOptions]
  }
}

