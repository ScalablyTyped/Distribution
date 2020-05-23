package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberOfVerticalLines extends js.Object {
  var center: Cartesian3
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var extrudedHeight: js.UndefOr[Double] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var numberOfVerticalLines: js.UndefOr[Double] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var semiMajorAxis: Double
  var semiMinorAxis: Double
}

object NumberOfVerticalLines {
  @scala.inline
  def apply(
    center: Cartesian3,
    semiMajorAxis: Double,
    semiMinorAxis: Double,
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    extrudedHeight: js.UndefOr[Double] = js.undefined,
    granularity: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    numberOfVerticalLines: js.UndefOr[Double] = js.undefined,
    rotation: js.UndefOr[Double] = js.undefined
  ): NumberOfVerticalLines = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], semiMajorAxis = semiMajorAxis.asInstanceOf[js.Any], semiMinorAxis = semiMinorAxis.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(extrudedHeight)) __obj.updateDynamic("extrudedHeight")(extrudedHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(granularity)) __obj.updateDynamic("granularity")(granularity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfVerticalLines)) __obj.updateDynamic("numberOfVerticalLines")(numberOfVerticalLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberOfVerticalLines]
  }
}

