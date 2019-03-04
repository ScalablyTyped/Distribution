package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomRadiusLength extends js.Object {
  var bottomRadius: scala.Double
  var length: scala.Double
  var numberOfVerticalLines: js.UndefOr[scala.Double] = js.undefined
  var slices: js.UndefOr[scala.Double] = js.undefined
  var topRadius: scala.Double
}

object Anon_BottomRadiusLength {
  @scala.inline
  def apply(
    bottomRadius: scala.Double,
    length: scala.Double,
    topRadius: scala.Double,
    numberOfVerticalLines: scala.Int | scala.Double = null,
    slices: scala.Int | scala.Double = null
  ): Anon_BottomRadiusLength = {
    val __obj = js.Dynamic.literal(bottomRadius = bottomRadius, length = length, topRadius = topRadius)
    if (numberOfVerticalLines != null) __obj.updateDynamic("numberOfVerticalLines")(numberOfVerticalLines.asInstanceOf[js.Any])
    if (slices != null) __obj.updateDynamic("slices")(slices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BottomRadiusLength]
  }
}

