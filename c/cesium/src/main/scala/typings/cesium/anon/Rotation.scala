package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rotation extends js.Object {
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var extrudedHeight: js.UndefOr[Double] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var rectangle: typings.cesium.mod.Rectangle
  var rotation: js.UndefOr[Double] = js.undefined
}

object Rotation {
  @scala.inline
  def apply(
    rectangle: typings.cesium.mod.Rectangle,
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    extrudedHeight: js.UndefOr[Double] = js.undefined,
    granularity: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    rotation: js.UndefOr[Double] = js.undefined
  ): Rotation = {
    val __obj = js.Dynamic.literal(rectangle = rectangle.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(extrudedHeight)) __obj.updateDynamic("extrudedHeight")(extrudedHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(granularity)) __obj.updateDynamic("granularity")(granularity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rotation]
  }
}

