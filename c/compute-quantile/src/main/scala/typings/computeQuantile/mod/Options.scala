package typings.computeQuantile.mod

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
  var sorted: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(sorted: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sorted)) __obj.updateDynamic("sorted")(sorted.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

