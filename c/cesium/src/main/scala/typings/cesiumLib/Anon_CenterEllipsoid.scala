package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CenterEllipsoid extends js.Object {
  var center: cesiumLib.cesiumMod.Cartesian3
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.Ellipsoid] = js.undefined
  var extrudedHeight: js.UndefOr[scala.Double] = js.undefined
  var granularity: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var numberOfVerticalLines: js.UndefOr[scala.Double] = js.undefined
  var radius: scala.Double
}

object Anon_CenterEllipsoid {
  @scala.inline
  def apply(
    center: cesiumLib.cesiumMod.Cartesian3,
    radius: scala.Double,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid = null,
    extrudedHeight: scala.Int | scala.Double = null,
    granularity: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    numberOfVerticalLines: scala.Int | scala.Double = null
  ): Anon_CenterEllipsoid = {
    val __obj = js.Dynamic.literal(center = center, radius = radius)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (extrudedHeight != null) __obj.updateDynamic("extrudedHeight")(extrudedHeight.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (numberOfVerticalLines != null) __obj.updateDynamic("numberOfVerticalLines")(numberOfVerticalLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CenterEllipsoid]
  }
}

