package typings.backbone.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelSetOptions
  extends Silenceable
     with Validable

object ModelSetOptions {
  @scala.inline
  def apply(silent: js.UndefOr[Boolean] = js.undefined, validate: js.UndefOr[Boolean] = js.undefined): ModelSetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelSetOptions]
  }
}

