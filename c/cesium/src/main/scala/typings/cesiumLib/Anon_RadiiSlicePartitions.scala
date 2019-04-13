package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RadiiSlicePartitions extends js.Object {
  var radii: js.UndefOr[cesiumLib.cesiumMod.Cartesian3] = js.undefined
  var slicePartitions: js.UndefOr[scala.Double] = js.undefined
  var stackPartitions: js.UndefOr[scala.Double] = js.undefined
  var subdivisions: js.UndefOr[scala.Double] = js.undefined
}

object Anon_RadiiSlicePartitions {
  @scala.inline
  def apply(
    radii: cesiumLib.cesiumMod.Cartesian3 = null,
    slicePartitions: scala.Int | scala.Double = null,
    stackPartitions: scala.Int | scala.Double = null,
    subdivisions: scala.Int | scala.Double = null
  ): Anon_RadiiSlicePartitions = {
    val __obj = js.Dynamic.literal()
    if (radii != null) __obj.updateDynamic("radii")(radii)
    if (slicePartitions != null) __obj.updateDynamic("slicePartitions")(slicePartitions.asInstanceOf[js.Any])
    if (stackPartitions != null) __obj.updateDynamic("stackPartitions")(stackPartitions.asInstanceOf[js.Any])
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RadiiSlicePartitions]
  }
}

