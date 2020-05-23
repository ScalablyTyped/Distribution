package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberOfLevelZeroTilesX extends js.Object {
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var numberOfLevelZeroTilesX: js.UndefOr[Double] = js.undefined
  var numberOfLevelZeroTilesY: js.UndefOr[Double] = js.undefined
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.undefined
}

object NumberOfLevelZeroTilesX {
  @scala.inline
  def apply(
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    numberOfLevelZeroTilesX: js.UndefOr[Double] = js.undefined,
    numberOfLevelZeroTilesY: js.UndefOr[Double] = js.undefined,
    rectangle: typings.cesium.mod.Rectangle = null
  ): NumberOfLevelZeroTilesX = {
    val __obj = js.Dynamic.literal()
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfLevelZeroTilesX)) __obj.updateDynamic("numberOfLevelZeroTilesX")(numberOfLevelZeroTilesX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfLevelZeroTilesY)) __obj.updateDynamic("numberOfLevelZeroTilesY")(numberOfLevelZeroTilesY.get.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberOfLevelZeroTilesX]
  }
}

