package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InTangents extends js.Object {
  var inTangents: js.Array[Cartesian3]
  var outTangents: js.Array[Cartesian3]
  var points: js.Array[Cartesian3]
  var times: js.Array[Double]
}

object InTangents {
  @scala.inline
  def apply(
    inTangents: js.Array[Cartesian3],
    outTangents: js.Array[Cartesian3],
    points: js.Array[Cartesian3],
    times: js.Array[Double]
  ): InTangents = {
    val __obj = js.Dynamic.literal(inTangents = inTangents.asInstanceOf[js.Any], outTangents = outTangents.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[InTangents]
  }
}

