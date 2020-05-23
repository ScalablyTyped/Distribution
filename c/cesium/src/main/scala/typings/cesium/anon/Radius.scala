package typings.cesium.anon

import typings.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Radius extends js.Object {
  var radius: js.UndefOr[Double] = js.undefined
  var slicePartitions: js.UndefOr[Double] = js.undefined
  var stackPartitions: js.UndefOr[Double] = js.undefined
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
}

object Radius {
  @scala.inline
  def apply(
    radius: js.UndefOr[Double] = js.undefined,
    slicePartitions: js.UndefOr[Double] = js.undefined,
    stackPartitions: js.UndefOr[Double] = js.undefined,
    vertexFormat: VertexFormat = null
  ): Radius = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slicePartitions)) __obj.updateDynamic("slicePartitions")(slicePartitions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stackPartitions)) __obj.updateDynamic("stackPartitions")(stackPartitions.get.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radius]
  }
}

