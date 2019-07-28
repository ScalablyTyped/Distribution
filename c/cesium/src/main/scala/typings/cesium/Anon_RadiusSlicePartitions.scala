package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RadiusSlicePartitions extends js.Object {
  var radius: js.UndefOr[Double] = js.undefined
  var slicePartitions: js.UndefOr[Double] = js.undefined
  var stackPartitions: js.UndefOr[Double] = js.undefined
  var subdivisions: js.UndefOr[Double] = js.undefined
}

object Anon_RadiusSlicePartitions {
  @scala.inline
  def apply(
    radius: Int | Double = null,
    slicePartitions: Int | Double = null,
    stackPartitions: Int | Double = null,
    subdivisions: Int | Double = null
  ): Anon_RadiusSlicePartitions = {
    val __obj = js.Dynamic.literal()
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (slicePartitions != null) __obj.updateDynamic("slicePartitions")(slicePartitions.asInstanceOf[js.Any])
    if (stackPartitions != null) __obj.updateDynamic("stackPartitions")(stackPartitions.asInstanceOf[js.Any])
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RadiusSlicePartitions]
  }
}

