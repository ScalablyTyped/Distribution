package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InnerRadii extends js.Object {
  var innerRadii: js.UndefOr[Cartesian3] = js.undefined
  var maximumClock: js.UndefOr[Double] = js.undefined
  var maximumCone: js.UndefOr[Double] = js.undefined
  var minimumClock: js.UndefOr[Double] = js.undefined
  var minimumCone: js.UndefOr[Double] = js.undefined
  var radii: js.UndefOr[Cartesian3] = js.undefined
  var slicePartitions: js.UndefOr[Double] = js.undefined
  var stackPartitions: js.UndefOr[Double] = js.undefined
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
}

object InnerRadii {
  @scala.inline
  def apply(
    innerRadii: Cartesian3 = null,
    maximumClock: js.UndefOr[Double] = js.undefined,
    maximumCone: js.UndefOr[Double] = js.undefined,
    minimumClock: js.UndefOr[Double] = js.undefined,
    minimumCone: js.UndefOr[Double] = js.undefined,
    radii: Cartesian3 = null,
    slicePartitions: js.UndefOr[Double] = js.undefined,
    stackPartitions: js.UndefOr[Double] = js.undefined,
    vertexFormat: VertexFormat = null
  ): InnerRadii = {
    val __obj = js.Dynamic.literal()
    if (innerRadii != null) __obj.updateDynamic("innerRadii")(innerRadii.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumClock)) __obj.updateDynamic("maximumClock")(maximumClock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumCone)) __obj.updateDynamic("maximumCone")(maximumCone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumClock)) __obj.updateDynamic("minimumClock")(minimumClock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumCone)) __obj.updateDynamic("minimumCone")(minimumCone.get.asInstanceOf[js.Any])
    if (radii != null) __obj.updateDynamic("radii")(radii.asInstanceOf[js.Any])
    if (!js.isUndefined(slicePartitions)) __obj.updateDynamic("slicePartitions")(slicePartitions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stackPartitions)) __obj.updateDynamic("stackPartitions")(stackPartitions.get.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerRadii]
  }
}

