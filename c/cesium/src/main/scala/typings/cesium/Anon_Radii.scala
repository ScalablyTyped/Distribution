package typings.cesium

import typings.cesium.cesiumMod.Cartesian3
import typings.cesium.cesiumMod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Radii extends js.Object {
  var radii: js.UndefOr[Cartesian3] = js.undefined
  var slicePartitions: js.UndefOr[Double] = js.undefined
  var stackPartitions: js.UndefOr[Double] = js.undefined
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
}

object Anon_Radii {
  @scala.inline
  def apply(
    radii: Cartesian3 = null,
    slicePartitions: Int | Double = null,
    stackPartitions: Int | Double = null,
    vertexFormat: VertexFormat = null
  ): Anon_Radii = {
    val __obj = js.Dynamic.literal()
    if (radii != null) __obj.updateDynamic("radii")(radii)
    if (slicePartitions != null) __obj.updateDynamic("slicePartitions")(slicePartitions.asInstanceOf[js.Any])
    if (stackPartitions != null) __obj.updateDynamic("stackPartitions")(stackPartitions.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat)
    __obj.asInstanceOf[Anon_Radii]
  }
}

