package typings.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidePadding extends js.Object {
  /** Left padding. */
  var left: js.UndefOr[Double] = js.undefined
  /** Right padding. */
  var right: js.UndefOr[Double] = js.undefined
}

object SidePadding {
  @scala.inline
  def apply(left: js.UndefOr[Double] = js.undefined, right: js.UndefOr[Double] = js.undefined): SidePadding = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidePadding]
  }
}

