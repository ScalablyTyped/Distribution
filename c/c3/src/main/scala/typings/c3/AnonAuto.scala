package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuto extends js.Object {
  /**
    * Indicate if the chart should automatically get resized when the window gets resized.
    */
  var auto: js.UndefOr[Boolean] = js.undefined
}

object AnonAuto {
  @scala.inline
  def apply(auto: js.UndefOr[Boolean] = js.undefined): AnonAuto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuto]
  }
}

