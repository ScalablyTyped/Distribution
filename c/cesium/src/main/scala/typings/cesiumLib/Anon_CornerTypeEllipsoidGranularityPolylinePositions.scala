package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CornerTypeEllipsoidGranularityPolylinePositions extends js.Object {
  var cornerType: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.CornerType] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Ellipsoid] = js.undefined
  var granularity: js.UndefOr[scala.Double] = js.undefined
  var polylinePositions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3]
  var shapePositions: scala.Double
}

object Anon_CornerTypeEllipsoidGranularityPolylinePositions {
  @scala.inline
  def apply(
    polylinePositions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3],
    shapePositions: scala.Double,
    cornerType: cesiumLib.cesiumMod.CesiumNs.CornerType = null,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = null,
    granularity: scala.Int | scala.Double = null
  ): Anon_CornerTypeEllipsoidGranularityPolylinePositions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("polylinePositions")(polylinePositions)
    __obj.updateDynamic("shapePositions")(shapePositions)
    if (cornerType != null) __obj.updateDynamic("cornerType")(cornerType)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CornerTypeEllipsoidGranularityPolylinePositions]
  }
}

