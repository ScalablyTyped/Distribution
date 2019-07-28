package typings.cesium

import typings.cesium.cesiumMod.Cartesian2
import typings.cesium.cesiumMod.Cartesian3
import typings.cesium.cesiumMod.CornerType
import typings.cesium.cesiumMod.Ellipsoid
import typings.cesium.cesiumMod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CornerTypeEllipsoidGranularity extends js.Object {
  var cornerType: js.UndefOr[CornerType] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var polylinePositions: js.Array[Cartesian3]
  var shapePositions: js.Array[Cartesian2]
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
}

object Anon_CornerTypeEllipsoidGranularity {
  @scala.inline
  def apply(
    polylinePositions: js.Array[Cartesian3],
    shapePositions: js.Array[Cartesian2],
    cornerType: CornerType = null,
    ellipsoid: Ellipsoid = null,
    granularity: Int | Double = null,
    vertexFormat: VertexFormat = null
  ): Anon_CornerTypeEllipsoidGranularity = {
    val __obj = js.Dynamic.literal(polylinePositions = polylinePositions, shapePositions = shapePositions)
    if (cornerType != null) __obj.updateDynamic("cornerType")(cornerType)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat)
    __obj.asInstanceOf[Anon_CornerTypeEllipsoidGranularity]
  }
}

