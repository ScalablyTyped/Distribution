package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CornerTypeEllipsoid extends js.Object {
  var cornerType: js.UndefOr[cesiumLib.cesiumMod.CornerType] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.Ellipsoid] = js.undefined
  var extrudedHeight: js.UndefOr[scala.Double] = js.undefined
  var granularity: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var positions: js.Array[cesiumLib.cesiumMod.Cartesian3]
  var width: scala.Double
}

object Anon_CornerTypeEllipsoid {
  @scala.inline
  def apply(
    positions: js.Array[cesiumLib.cesiumMod.Cartesian3],
    width: scala.Double,
    cornerType: cesiumLib.cesiumMod.CornerType = null,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid = null,
    extrudedHeight: scala.Int | scala.Double = null,
    granularity: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null
  ): Anon_CornerTypeEllipsoid = {
    val __obj = js.Dynamic.literal(positions = positions, width = width)
    if (cornerType != null) __obj.updateDynamic("cornerType")(cornerType)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (extrudedHeight != null) __obj.updateDynamic("extrudedHeight")(extrudedHeight.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CornerTypeEllipsoid]
  }
}

