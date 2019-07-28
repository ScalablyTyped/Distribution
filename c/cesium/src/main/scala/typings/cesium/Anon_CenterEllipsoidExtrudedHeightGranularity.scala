package typings.cesium

import typings.cesium.cesiumMod.Cartesian3
import typings.cesium.cesiumMod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CenterEllipsoidExtrudedHeightGranularity extends js.Object {
  var center: Cartesian3
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var extrudedHeight: js.UndefOr[Double] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var numberOfVerticalLines: js.UndefOr[Double] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var semiMajorAxis: Double
  var semiMinorAxis: Double
}

object Anon_CenterEllipsoidExtrudedHeightGranularity {
  @scala.inline
  def apply(
    center: Cartesian3,
    semiMajorAxis: Double,
    semiMinorAxis: Double,
    ellipsoid: Ellipsoid = null,
    extrudedHeight: Int | Double = null,
    granularity: Int | Double = null,
    height: Int | Double = null,
    numberOfVerticalLines: Int | Double = null,
    rotation: Int | Double = null
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

