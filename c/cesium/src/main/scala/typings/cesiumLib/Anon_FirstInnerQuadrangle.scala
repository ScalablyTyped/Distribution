package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstInnerQuadrangle extends js.Object {
  var firstInnerQuadrangle: js.UndefOr[cesiumLib.cesiumMod.Quaternion] = js.undefined
  var lastInnerQuadrangle: js.UndefOr[cesiumLib.cesiumMod.Quaternion] = js.undefined
  var points: js.Array[cesiumLib.cesiumMod.Quaternion]
  var times: js.Array[scala.Double]
}

object Anon_FirstInnerQuadrangle {
  @scala.inline
  def apply(
    points: js.Array[cesiumLib.cesiumMod.Quaternion],
    times: js.Array[scala.Double],
    firstInnerQuadrangle: cesiumLib.cesiumMod.Quaternion = null,
    lastInnerQuadrangle: cesiumLib.cesiumMod.Quaternion = null
  ): Anon_FirstInnerQuadrangle = {
    val __obj = js.Dynamic.literal(points = points, times = times)
    if (firstInnerQuadrangle != null) __obj.updateDynamic("firstInnerQuadrangle")(firstInnerQuadrangle)
    if (lastInnerQuadrangle != null) __obj.updateDynamic("lastInnerQuadrangle")(lastInnerQuadrangle)
    __obj.asInstanceOf[Anon_FirstInnerQuadrangle]
  }
}

