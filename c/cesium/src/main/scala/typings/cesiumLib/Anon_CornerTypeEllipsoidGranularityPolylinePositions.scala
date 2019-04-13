package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CornerTypeEllipsoidGranularityPolylinePositions extends js.Object {
  var cornerType: js.UndefOr[cesiumLib.cesiumMod.CornerType] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.Ellipsoid] = js.undefined
  var granularity: js.UndefOr[scala.Double] = js.undefined
  var polylinePositions: js.Array[cesiumLib.cesiumMod.Cartesian3]
  var shapePositions: scala.Double
}

object Anon_CornerTypeEllipsoidGranularityPolylinePositions {
  @scala.inline
  def apply(
    polylinePositions: js.Array[cesiumLib.cesiumMod.Cartesian3],
    shapePositions: scala.Double,
    cornerType: cesiumLib.cesiumMod.CornerType = null,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid = null,
    granularity: scala.Int | scala.Double = null
  ): Anon_CornerTypeEllipsoidGranularityPolylinePositions = {
    val __obj = js.Dynamic.literal(polylinePositions = polylinePositions, shapePositions = shapePositions)
    if (cornerType != null) __obj.updateDynamic("cornerType")(cornerType)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CornerTypeEllipsoidGranularityPolylinePositions]
  }
}

