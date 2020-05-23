package typings.cesium.anon

import typings.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerPositionHeight extends js.Object {
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var extrudedHeight: js.UndefOr[Double] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var perPositionHeight: js.UndefOr[Boolean] = js.undefined
  var polygonHierarchy: typings.cesium.mod.PolygonHierarchy
  var stRotation: js.UndefOr[Double] = js.undefined
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
}

object PerPositionHeight {
  @scala.inline
  def apply(
    polygonHierarchy: typings.cesium.mod.PolygonHierarchy,
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    extrudedHeight: js.UndefOr[Double] = js.undefined,
    granularity: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    perPositionHeight: js.UndefOr[Boolean] = js.undefined,
    stRotation: js.UndefOr[Double] = js.undefined,
    vertexFormat: VertexFormat = null
  ): PerPositionHeight = {
    val __obj = js.Dynamic.literal(polygonHierarchy = polygonHierarchy.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(extrudedHeight)) __obj.updateDynamic("extrudedHeight")(extrudedHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(granularity)) __obj.updateDynamic("granularity")(granularity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(perPositionHeight)) __obj.updateDynamic("perPositionHeight")(perPositionHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stRotation)) __obj.updateDynamic("stRotation")(stRotation.get.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerPositionHeight]
  }
}

