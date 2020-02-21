package typings.cesium

import typings.cesium.mod.ArcType
import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Color
import typings.cesium.mod.Ellipsoid
import typings.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArcType extends js.Object {
  var arcType: js.UndefOr[ArcType] = js.undefined
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  var colorsPerVertex: js.UndefOr[Boolean] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var positions: js.Array[Cartesian3]
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonArcType {
  @scala.inline
  def apply(
    positions: js.Array[Cartesian3],
    arcType: ArcType = null,
    colors: js.Array[Color] = null,
    colorsPerVertex: js.UndefOr[Boolean] = js.undefined,
    ellipsoid: Ellipsoid = null,
    granularity: Int | Double = null,
    vertexFormat: VertexFormat = null,
    width: Int | Double = null
  ): AnonArcType = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    if (arcType != null) __obj.updateDynamic("arcType")(arcType.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(colorsPerVertex)) __obj.updateDynamic("colorsPerVertex")(colorsPerVertex.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArcType]
  }
}

