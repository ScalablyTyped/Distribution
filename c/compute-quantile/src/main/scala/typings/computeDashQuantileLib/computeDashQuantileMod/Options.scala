package typings
package computeDashQuantileLib.computeDashQuantileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * If the input `array` is already sorted in `__ascending__` order, you can set the `sorted` option to `true`.
    *
    * @default
    * false
    */
  var sorted: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(sorted: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sorted)) __obj.updateDynamic("sorted")(sorted)
    __obj.asInstanceOf[Options]
  }
}

