package typings.cesium

import typings.cesium.cesiumMod.Cartesian3
import typings.cesium.cesiumMod.CornerType
import typings.cesium.cesiumMod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CornerTypeEllipsoidGranularityPolylinePositions extends js.Object {
  var cornerType: js.UndefOr[CornerType] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var polylinePositions: js.Array[Cartesian3]
  var shapePositions: Double
}

object Anon_CornerTypeEllipsoidGranularityPolylinePositions {
  @scala.inline
  def apply(
    polylinePositions: js.Array[Cartesian3],
    shapePositions: Double,
    cornerType: CornerType = null,
    ellipsoid: Ellipsoid = null,
    granularity: Int | Double = null
  ): Anon_CornerTypeEllipsoidGranularityPolylinePositions = {
    val __obj = js.Dynamic.literal(polylinePositions = polylinePositions, shapePositions = shapePositions)
    if (cornerType != null) __obj.updateDynamic("cornerType")(cornerType)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CornerTypeEllipsoidGranularityPolylinePositions]
  }
}

