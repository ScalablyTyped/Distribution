package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auto extends js.Object {
  /**
    * Indicate if the chart should automatically get resized when the window gets resized.
    */
  var auto: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Auto {
  @scala.inline
  def apply(auto: js.UndefOr[scala.Boolean] = js.undefined): Anon_Auto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto)
    __obj.asInstanceOf[Anon_Auto]
  }
}

