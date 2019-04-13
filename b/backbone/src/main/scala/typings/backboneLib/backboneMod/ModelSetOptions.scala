package typings
package backboneLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelSetOptions
  extends Silenceable
     with Validable

object ModelSetOptions {
  @scala.inline
  def apply(
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    validate: js.UndefOr[scala.Boolean] = js.undefined
  ): ModelSetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[ModelSetOptions]
  }
}

