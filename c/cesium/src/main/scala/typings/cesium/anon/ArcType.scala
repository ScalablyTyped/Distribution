package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcType extends js.Object {
  var arcType: js.UndefOr[typings.cesium.mod.ArcType] = js.undefined
  var colors: js.UndefOr[js.Array[typings.cesium.mod.Color]] = js.undefined
  var colorsPerVertex: js.UndefOr[Boolean] = js.undefined
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var positions: js.Array[Cartesian3]
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ArcType {
  @scala.inline
  def apply(
    positions: js.Array[Cartesian3],
    arcType: typings.cesium.mod.ArcType = null,
    colors: js.Array[typings.cesium.mod.Color] = null,
    colorsPerVertex: js.UndefOr[Boolean] = js.undefined,
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    granularity: js.UndefOr[Double] = js.undefined,
    vertexFormat: VertexFormat = null,
    width: js.UndefOr[Double] = js.undefined
  ): ArcType = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    if (arcType != null) __obj.updateDynamic("arcType")(arcType.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(colorsPerVertex)) __obj.updateDynamic("colorsPerVertex")(colorsPerVertex.get.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(granularity)) __obj.updateDynamic("granularity")(granularity.get.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcType]
  }
}

