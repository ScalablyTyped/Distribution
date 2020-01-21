package typings.cesium

import typings.cesium.mod.InterpolationAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInterpolationAlgorithm extends js.Object {
  var interpolationAlgorithm: js.UndefOr[InterpolationAlgorithm] = js.undefined
  var interpolationDegree: js.UndefOr[Double] = js.undefined
}

object AnonInterpolationAlgorithm {
  @scala.inline
  def apply(interpolationAlgorithm: InterpolationAlgorithm = null, interpolationDegree: Int | Double = null): AnonInterpolationAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (interpolationAlgorithm != null) __obj.updateDynamic("interpolationAlgorithm")(interpolationAlgorithm.asInstanceOf[js.Any])
    if (interpolationDegree != null) __obj.updateDynamic("interpolationDegree")(interpolationDegree.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInterpolationAlgorithm]
  }
}

