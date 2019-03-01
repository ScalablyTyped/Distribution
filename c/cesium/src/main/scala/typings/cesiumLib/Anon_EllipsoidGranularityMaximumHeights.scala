package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EllipsoidGranularityMaximumHeights extends js.Object {
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Ellipsoid] = js.undefined
  var granularity: js.UndefOr[scala.Double] = js.undefined
  var maximumHeights: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var minimumHeights: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3]
}

object Anon_EllipsoidGranularityMaximumHeights {
  @scala.inline
  def apply(
    positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3],
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = null,
    granularity: scala.Int | scala.Double = null,
    maximumHeights: js.Array[scala.Double] = null,
    minimumHeights: js.Array[scala.Double] = null
  ): Anon_EllipsoidGranularityMaximumHeights = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("positions")(positions)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (maximumHeights != null) __obj.updateDynamic("maximumHeights")(maximumHeights)
    if (minimumHeights != null) __obj.updateDynamic("minimumHeights")(minimumHeights)
    __obj.asInstanceOf[Anon_EllipsoidGranularityMaximumHeights]
  }
}

