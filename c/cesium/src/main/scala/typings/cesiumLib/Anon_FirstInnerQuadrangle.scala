package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstInnerQuadrangle extends js.Object {
  var firstInnerQuadrangle: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Quaternion] = js.undefined
  var lastInnerQuadrangle: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Quaternion] = js.undefined
  var points: js.Array[cesiumLib.cesiumMod.CesiumNs.Quaternion]
  var times: js.Array[scala.Double]
}

object Anon_FirstInnerQuadrangle {
  @scala.inline
  def apply(
    points: js.Array[cesiumLib.cesiumMod.CesiumNs.Quaternion],
    times: js.Array[scala.Double],
    firstInnerQuadrangle: cesiumLib.cesiumMod.CesiumNs.Quaternion = null,
    lastInnerQuadrangle: cesiumLib.cesiumMod.CesiumNs.Quaternion = null
  ): Anon_FirstInnerQuadrangle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("points")(points)
    __obj.updateDynamic("times")(times)
    if (firstInnerQuadrangle != null) __obj.updateDynamic("firstInnerQuadrangle")(firstInnerQuadrangle)
    if (lastInnerQuadrangle != null) __obj.updateDynamic("lastInnerQuadrangle")(lastInnerQuadrangle)
    __obj.asInstanceOf[Anon_FirstInnerQuadrangle]
  }
}

