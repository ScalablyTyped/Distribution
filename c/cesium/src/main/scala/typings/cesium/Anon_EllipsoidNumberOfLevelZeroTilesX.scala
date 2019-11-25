package typings.cesium

import typings.cesium.cesiumMod.Ellipsoid
import typings.cesium.cesiumMod.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EllipsoidNumberOfLevelZeroTilesX extends js.Object {
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var numberOfLevelZeroTilesX: js.UndefOr[Double] = js.undefined
  var numberOfLevelZeroTilesY: js.UndefOr[Double] = js.undefined
  var rectangle: js.UndefOr[Rectangle] = js.undefined
}

object Anon_EllipsoidNumberOfLevelZeroTilesX {
  @scala.inline
  def apply(
    ellipsoid: Ellipsoid = null,
    numberOfLevelZeroTilesX: Int | Double = null,
    numberOfLevelZeroTilesY: Int | Double = null,
    rectangle: Rectangle = null
  ): Anon_EllipsoidNumberOfLevelZeroTilesX = {
    val __obj = js.Dynamic.literal()
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (numberOfLevelZeroTilesX != null) __obj.updateDynamic("numberOfLevelZeroTilesX")(numberOfLevelZeroTilesX.asInstanceOf[js.Any])
    if (numberOfLevelZeroTilesY != null) __obj.updateDynamic("numberOfLevelZeroTilesY")(numberOfLevelZeroTilesY.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EllipsoidNumberOfLevelZeroTilesX]
  }
}

