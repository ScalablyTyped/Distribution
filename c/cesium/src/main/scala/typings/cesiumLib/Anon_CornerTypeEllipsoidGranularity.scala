package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CornerTypeEllipsoidGranularity extends js.Object {
  var cornerType: js.UndefOr[cesiumLib.cesiumMod.CornerType] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.Ellipsoid] = js.undefined
  var granularity: js.UndefOr[scala.Double] = js.undefined
  var polylinePositions: js.Array[cesiumLib.cesiumMod.Cartesian3]
  var shapePositions: js.Array[cesiumLib.cesiumMod.Cartesian2]
  var vertexFormat: js.UndefOr[cesiumLib.cesiumMod.VertexFormat] = js.undefined
}

object Anon_CornerTypeEllipsoidGranularity {
  @scala.inline
  def apply(
    polylinePositions: js.Array[cesiumLib.cesiumMod.Cartesian3],
    shapePositions: js.Array[cesiumLib.cesiumMod.Cartesian2],
    cornerType: cesiumLib.cesiumMod.CornerType = null,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid = null,
    granularity: scala.Int | scala.Double = null,
    vertexFormat: cesiumLib.cesiumMod.VertexFormat = null
  ): Anon_CornerTypeEllipsoidGranularity = {
    val __obj = js.Dynamic.literal(polylinePositions = polylinePositions, shapePositions = shapePositions)
    if (cornerType != null) __obj.updateDynamic("cornerType")(cornerType)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat)
    __obj.asInstanceOf[Anon_CornerTypeEllipsoidGranularity]
  }
}

