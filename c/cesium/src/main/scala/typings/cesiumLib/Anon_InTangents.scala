package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InTangents extends js.Object {
  var inTangents: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3]
  var outTangents: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3]
  var points: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3]
  var times: js.Array[scala.Double]
}

object Anon_InTangents {
  @scala.inline
  def apply(
    inTangents: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3],
    outTangents: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3],
    points: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3],
    times: js.Array[scala.Double]
  ): Anon_InTangents = {
    val __obj = js.Dynamic.literal(inTangents = inTangents, outTangents = outTangents, points = points, times = times)
  
    __obj.asInstanceOf[Anon_InTangents]
  }
}

