package typings.cesium

import typings.cesium.cesiumMod.Cartesian3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstTangent extends js.Object {
  var firstTangent: js.UndefOr[Cartesian3] = js.undefined
  var lastTangent: js.UndefOr[Cartesian3] = js.undefined
  var points: js.Array[Cartesian3]
  var times: js.Array[Double]
}

object Anon_FirstTangent {
  @scala.inline
  def apply(
    points: js.Array[Cartesian3],
    times: js.Array[Double],
    firstTangent: Cartesian3 = null,
    lastTangent: Cartesian3 = null
  ): Anon_FirstTangent = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    if (firstTangent != null) __obj.updateDynamic("firstTangent")(firstTangent.asInstanceOf[js.Any])
    if (lastTangent != null) __obj.updateDynamic("lastTangent")(lastTangent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FirstTangent]
  }
}

