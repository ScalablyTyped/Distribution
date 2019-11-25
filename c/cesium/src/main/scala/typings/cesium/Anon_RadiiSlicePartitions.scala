package typings.cesium

import typings.cesium.cesiumMod.Cartesian3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RadiiSlicePartitions extends js.Object {
  var radii: js.UndefOr[Cartesian3] = js.undefined
  var slicePartitions: js.UndefOr[Double] = js.undefined
  var stackPartitions: js.UndefOr[Double] = js.undefined
  var subdivisions: js.UndefOr[Double] = js.undefined
}

object Anon_RadiiSlicePartitions {
  @scala.inline
  def apply(
    radii: Cartesian3 = null,
    slicePartitions: Int | Double = null,
    stackPartitions: Int | Double = null,
    subdivisions: Int | Double = null
  ): Anon_RadiiSlicePartitions = {
    val __obj = js.Dynamic.literal()
    if (radii != null) __obj.updateDynamic("radii")(radii.asInstanceOf[js.Any])
    if (slicePartitions != null) __obj.updateDynamic("slicePartitions")(slicePartitions.asInstanceOf[js.Any])
    if (stackPartitions != null) __obj.updateDynamic("stackPartitions")(stackPartitions.asInstanceOf[js.Any])
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RadiiSlicePartitions]
  }
}

