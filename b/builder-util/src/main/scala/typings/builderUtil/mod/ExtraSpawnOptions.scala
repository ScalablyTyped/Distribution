package typings.builderUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraSpawnOptions extends js.Object {
  var isPipeInput: js.UndefOr[Boolean] = js.undefined
}

object ExtraSpawnOptions {
  @scala.inline
  def apply(isPipeInput: js.UndefOr[Boolean] = js.undefined): ExtraSpawnOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isPipeInput)) __obj.updateDynamic("isPipeInput")(isPipeInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraSpawnOptions]
  }
}

