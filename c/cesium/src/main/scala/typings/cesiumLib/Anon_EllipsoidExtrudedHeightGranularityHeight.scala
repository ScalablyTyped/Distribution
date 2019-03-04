package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EllipsoidExtrudedHeightGranularityHeight extends js.Object {
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Ellipsoid] = js.undefined
  var extrudedHeight: js.UndefOr[scala.Double] = js.undefined
  var granularity: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var perPositionHeight: js.UndefOr[scala.Boolean] = js.undefined
  var positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3]
}

object Anon_EllipsoidExtrudedHeightGranularityHeight {
  @scala.inline
  def apply(
    positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3],
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = null,
    extrudedHeight: scala.Int | scala.Double = null,
    granularity: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    perPositionHeight: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_EllipsoidExtrudedHeightGranularityHeight = {
    val __obj = js.Dynamic.literal(positions = positions)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (extrudedHeight != null) __obj.updateDynamic("extrudedHeight")(extrudedHeight.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(perPositionHeight)) __obj.updateDynamic("perPositionHeight")(perPositionHeight)
    __obj.asInstanceOf[Anon_EllipsoidExtrudedHeightGranularityHeight]
  }
}

