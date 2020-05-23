package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterpolationAlgorithm extends js.Object {
  var interpolationAlgorithm: js.UndefOr[typings.cesium.mod.InterpolationAlgorithm] = js.undefined
  var interpolationDegree: js.UndefOr[Double] = js.undefined
}

object InterpolationAlgorithm {
  @scala.inline
  def apply(
    interpolationAlgorithm: typings.cesium.mod.InterpolationAlgorithm = null,
    interpolationDegree: js.UndefOr[Double] = js.undefined
  ): InterpolationAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (interpolationAlgorithm != null) __obj.updateDynamic("interpolationAlgorithm")(interpolationAlgorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(interpolationDegree)) __obj.updateDynamic("interpolationDegree")(interpolationDegree.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolationAlgorithm]
  }
}

