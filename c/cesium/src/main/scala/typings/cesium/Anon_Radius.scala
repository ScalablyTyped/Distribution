package typings.cesium

import typings.cesium.cesiumMod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Radius extends js.Object {
  var radius: js.UndefOr[Double] = js.undefined
  var slicePartitions: js.UndefOr[Double] = js.undefined
  var stackPartitions: js.UndefOr[Double] = js.undefined
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
}

object Anon_Radius {
  @scala.inline
  def apply(
    radius: Int | Double = null,
    slicePartitions: Int | Double = null,
    stackPartitions: Int | Double = null,
    vertexFormat: VertexFormat = null
  ): Anon_Radius = {
    val __obj = js.Dynamic.literal()
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (slicePartitions != null) __obj.updateDynamic("slicePartitions")(slicePartitions.asInstanceOf[js.Any])
    if (stackPartitions != null) __obj.updateDynamic("stackPartitions")(stackPartitions.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat)
    __obj.asInstanceOf[Anon_Radius]
  }
}

