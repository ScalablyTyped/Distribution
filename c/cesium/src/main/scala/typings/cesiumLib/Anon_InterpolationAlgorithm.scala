package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InterpolationAlgorithm extends js.Object {
  var interpolationAlgorithm: js.UndefOr[cesiumLib.cesiumMod.InterpolationAlgorithm] = js.undefined
  var interpolationDegree: js.UndefOr[scala.Double] = js.undefined
}

object Anon_InterpolationAlgorithm {
  @scala.inline
  def apply(
    interpolationAlgorithm: cesiumLib.cesiumMod.InterpolationAlgorithm = null,
    interpolationDegree: scala.Int | scala.Double = null
  ): Anon_InterpolationAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (interpolationAlgorithm != null) __obj.updateDynamic("interpolationAlgorithm")(interpolationAlgorithm)
    if (interpolationDegree != null) __obj.updateDynamic("interpolationDegree")(interpolationDegree.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InterpolationAlgorithm]
  }
}

