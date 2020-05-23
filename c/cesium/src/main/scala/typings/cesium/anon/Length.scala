package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Length extends js.Object {
  var bottomRadius: Double
  var length: Double
  var numberOfVerticalLines: js.UndefOr[Double] = js.undefined
  var slices: js.UndefOr[Double] = js.undefined
  var topRadius: Double
}

object Length {
  @scala.inline
  def apply(
    bottomRadius: Double,
    length: Double,
    topRadius: Double,
    numberOfVerticalLines: js.UndefOr[Double] = js.undefined,
    slices: js.UndefOr[Double] = js.undefined
  ): Length = {
    val __obj = js.Dynamic.literal(bottomRadius = bottomRadius.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], topRadius = topRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfVerticalLines)) __obj.updateDynamic("numberOfVerticalLines")(numberOfVerticalLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slices)) __obj.updateDynamic("slices")(slices.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
}

