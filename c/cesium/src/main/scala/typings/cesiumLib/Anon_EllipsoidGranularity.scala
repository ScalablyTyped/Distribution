package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EllipsoidGranularity extends js.Object {
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.Ellipsoid] = js.undefined
  var granularity: js.UndefOr[scala.Double] = js.undefined
  var maximumHeights: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var minimumHeights: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var positions: js.Array[cesiumLib.cesiumMod.Cartesian3]
  var vertexFormat: js.UndefOr[cesiumLib.cesiumMod.VertexFormat] = js.undefined
}

object Anon_EllipsoidGranularity {
  @scala.inline
  def apply(
    positions: js.Array[cesiumLib.cesiumMod.Cartesian3],
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid = null,
    granularity: scala.Int | scala.Double = null,
    maximumHeights: js.Array[scala.Double] = null,
    minimumHeights: js.Array[scala.Double] = null,
    vertexFormat: cesiumLib.cesiumMod.VertexFormat = null
  ): Anon_EllipsoidGranularity = {
    val __obj = js.Dynamic.literal(positions = positions)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (maximumHeights != null) __obj.updateDynamic("maximumHeights")(maximumHeights)
    if (minimumHeights != null) __obj.updateDynamic("minimumHeights")(minimumHeights)
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat)
    __obj.asInstanceOf[Anon_EllipsoidGranularity]
  }
}

