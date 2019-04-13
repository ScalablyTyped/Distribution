package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstTangent extends js.Object {
  var firstTangent: js.UndefOr[cesiumLib.cesiumMod.Cartesian3] = js.undefined
  var lastTangent: js.UndefOr[cesiumLib.cesiumMod.Cartesian3] = js.undefined
  var points: js.Array[cesiumLib.cesiumMod.Cartesian3]
  var times: js.Array[scala.Double]
}

object Anon_FirstTangent {
  @scala.inline
  def apply(
    points: js.Array[cesiumLib.cesiumMod.Cartesian3],
    times: js.Array[scala.Double],
    firstTangent: cesiumLib.cesiumMod.Cartesian3 = null,
    lastTangent: cesiumLib.cesiumMod.Cartesian3 = null
  ): Anon_FirstTangent = {
    val __obj = js.Dynamic.literal(points = points, times = times)
    if (firstTangent != null) __obj.updateDynamic("firstTangent")(firstTangent)
    if (lastTangent != null) __obj.updateDynamic("lastTangent")(lastTangent)
    __obj.asInstanceOf[Anon_FirstTangent]
  }
}

