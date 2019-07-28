package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomRadiusLength extends js.Object {
  var bottomRadius: Double
  var length: Double
  var numberOfVerticalLines: js.UndefOr[Double] = js.undefined
  var slices: js.UndefOr[Double] = js.undefined
  var topRadius: Double
}

object Anon_BottomRadiusLength {
  @scala.inline
  def apply(
    bottomRadius: Double,
    length: Double,
    topRadius: Double,
    numberOfVerticalLines: Int | Double = null,
    slices: Int | Double = null
  ): Anon_BottomRadiusLength = {
    val __obj = js.Dynamic.literal(bottomRadius = bottomRadius, length = length, topRadius = topRadius)
    if (numberOfVerticalLines != null) __obj.updateDynamic("numberOfVerticalLines")(numberOfVerticalLines.asInstanceOf[js.Any])
    if (slices != null) __obj.updateDynamic("slices")(slices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BottomRadiusLength]
  }
}

