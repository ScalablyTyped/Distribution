package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auto extends js.Object {
  /**
    * Indicate if the chart should automatically get resized when the window gets resized.
    */
  var auto: js.UndefOr[Boolean] = js.undefined
}

object Auto {
  @scala.inline
  def apply(auto: js.UndefOr[Boolean] = js.undefined): Auto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auto]
  }
}

