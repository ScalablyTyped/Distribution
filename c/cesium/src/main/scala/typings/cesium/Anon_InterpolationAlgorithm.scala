package typings.cesium

import typings.cesium.cesiumMod.InterpolationAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InterpolationAlgorithm extends js.Object {
  var interpolationAlgorithm: js.UndefOr[InterpolationAlgorithm] = js.undefined
  var interpolationDegree: js.UndefOr[Double] = js.undefined
}

object Anon_InterpolationAlgorithm {
  @scala.inline
  def apply(interpolationAlgorithm: InterpolationAlgorithm = null, interpolationDegree: Int | Double = null): Anon_InterpolationAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (interpolationAlgorithm != null) __obj.updateDynamic("interpolationAlgorithm")(interpolationAlgorithm.asInstanceOf[js.Any])
    if (interpolationDegree != null) __obj.updateDynamic("interpolationDegree")(interpolationDegree.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InterpolationAlgorithm]
  }
}

