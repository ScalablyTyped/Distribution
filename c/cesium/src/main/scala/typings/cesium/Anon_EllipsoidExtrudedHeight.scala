package typings.cesium

import typings.cesium.cesiumMod.Ellipsoid
import typings.cesium.cesiumMod.PolygonHierarchy
import typings.cesium.cesiumMod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EllipsoidExtrudedHeight extends js.Object {
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var extrudedHeight: js.UndefOr[Double] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var perPositionHeight: js.UndefOr[Boolean] = js.undefined
  var polygonHierarchy: PolygonHierarchy
  var stRotation: js.UndefOr[Double] = js.undefined
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
}

object Anon_EllipsoidExtrudedHeight {
  @scala.inline
  def apply(
    polygonHierarchy: PolygonHierarchy,
    ellipsoid: Ellipsoid = null,
    extrudedHeight: Int | Double = null,
    granularity: Int | Double = null,
    height: Int | Double = null,
    perPositionHeight: js.UndefOr[Boolean] = js.undefined,
    stRotation: Int | Double = null,
    vertexFormat: VertexFormat = null
  ): Anon_EllipsoidExtrudedHeight = {
    val __obj = js.Dynamic.literal(polygonHierarchy = polygonHierarchy)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (extrudedHeight != null) __obj.updateDynamic("extrudedHeight")(extrudedHeight.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(perPositionHeight)) __obj.updateDynamic("perPositionHeight")(perPositionHeight)
    if (stRotation != null) __obj.updateDynamic("stRotation")(stRotation.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat)
    __obj.asInstanceOf[Anon_EllipsoidExtrudedHeight]
  }
}

