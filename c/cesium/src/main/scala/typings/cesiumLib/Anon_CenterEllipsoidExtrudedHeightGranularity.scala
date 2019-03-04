package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CenterEllipsoidExtrudedHeightGranularity extends js.Object {
  var center: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Ellipsoid] = js.undefined
  var extrudedHeight: js.UndefOr[scala.Double] = js.undefined
  var granularity: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var numberOfVerticalLines: js.UndefOr[scala.Double] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var semiMajorAxis: scala.Double
  var semiMinorAxis: scala.Double
}

object Anon_CenterEllipsoidExtrudedHeightGranularity {
  @scala.inline
  def apply(
    center: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    semiMajorAxis: scala.Double,
    semiMinorAxis: scala.Double,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = null,
    extrudedHeight: scala.Int | scala.Double = null,
    granularity: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    numberOfVerticalLines: scala.Int | scala.Double = null,
    rotation: scala.Int | scala.Double = null
  ): Anon_CenterEllipsoidExtrudedHeightGranularity = {
    val __obj = js.Dynamic.literal(center = center, semiMajorAxis = semiMajorAxis, semiMinorAxis = semiMinorAxis)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (extrudedHeight != null) __obj.updateDynamic("extrudedHeight")(extrudedHeight.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (numberOfVerticalLines != null) __obj.updateDynamic("numberOfVerticalLines")(numberOfVerticalLines.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CenterEllipsoidExtrudedHeightGranularity]
  }
}

