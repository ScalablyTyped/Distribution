package typings
package builderDashUtilLib.builderDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraSpawnOptions extends js.Object {
  var isPipeInput: js.UndefOr[scala.Boolean] = js.undefined
}

object ExtraSpawnOptions {
  @scala.inline
  def apply(isPipeInput: js.UndefOr[scala.Boolean] = js.undefined): ExtraSpawnOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isPipeInput)) __obj.updateDynamic("isPipeInput")(isPipeInput)
    __obj.asInstanceOf[ExtraSpawnOptions]
  }
}

