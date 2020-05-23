package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaximumHeights extends js.Object {
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var maximumHeights: js.UndefOr[js.Array[Double]] = js.undefined
  var minimumHeights: js.UndefOr[js.Array[Double]] = js.undefined
  var positions: js.Array[Cartesian3]
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
}

object MaximumHeights {
  @scala.inline
  def apply(
    positions: js.Array[Cartesian3],
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    granularity: js.UndefOr[Double] = js.undefined,
    maximumHeights: js.Array[Double] = null,
    minimumHeights: js.Array[Double] = null,
    vertexFormat: VertexFormat = null
  ): MaximumHeights = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(granularity)) __obj.updateDynamic("granularity")(granularity.get.asInstanceOf[js.Any])
    if (maximumHeights != null) __obj.updateDynamic("maximumHeights")(maximumHeights.asInstanceOf[js.Any])
    if (minimumHeights != null) __obj.updateDynamic("minimumHeights")(minimumHeights.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumHeights]
  }
}

