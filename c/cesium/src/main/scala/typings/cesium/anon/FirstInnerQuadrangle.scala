package typings.cesium.anon

import typings.cesium.mod.Quaternion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirstInnerQuadrangle extends js.Object {
  var firstInnerQuadrangle: js.UndefOr[Quaternion] = js.undefined
  var lastInnerQuadrangle: js.UndefOr[Quaternion] = js.undefined
  var points: js.Array[Quaternion]
  var times: js.Array[Double]
}

object FirstInnerQuadrangle {
  @scala.inline
  def apply(
    points: js.Array[Quaternion],
    times: js.Array[Double],
    firstInnerQuadrangle: Quaternion = null,
    lastInnerQuadrangle: Quaternion = null
  ): FirstInnerQuadrangle = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    if (firstInnerQuadrangle != null) __obj.updateDynamic("firstInnerQuadrangle")(firstInnerQuadrangle.asInstanceOf[js.Any])
    if (lastInnerQuadrangle != null) __obj.updateDynamic("lastInnerQuadrangle")(lastInnerQuadrangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstInnerQuadrangle]
  }
}

