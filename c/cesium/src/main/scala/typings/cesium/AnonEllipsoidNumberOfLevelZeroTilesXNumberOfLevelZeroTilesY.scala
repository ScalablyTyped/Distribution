package typings.cesium

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEllipsoidNumberOfLevelZeroTilesXNumberOfLevelZeroTilesY extends js.Object {
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var numberOfLevelZeroTilesX: js.UndefOr[Double] = js.undefined
  var numberOfLevelZeroTilesY: js.UndefOr[Double] = js.undefined
  var rectangleNortheastInMeters: js.UndefOr[Cartesian2] = js.undefined
  var rectangleSouthwestInMeters: js.UndefOr[Cartesian2] = js.undefined
}

object AnonEllipsoidNumberOfLevelZeroTilesXNumberOfLevelZeroTilesY {
  @scala.inline
  def apply(
    ellipsoid: Ellipsoid = null,
    numberOfLevelZeroTilesX: Int | Double = null,
    numberOfLevelZeroTilesY: Int | Double = null,
    rectangleNortheastInMeters: Cartesian2 = null,
    rectangleSouthwestInMeters: Cartesian2 = null
  ): AnonEllipsoidNumberOfLevelZeroTilesXNumberOfLevelZeroTilesY = {
    val __obj = js.Dynamic.literal()
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (numberOfLevelZeroTilesX != null) __obj.updateDynamic("numberOfLevelZeroTilesX")(numberOfLevelZeroTilesX.asInstanceOf[js.Any])
    if (numberOfLevelZeroTilesY != null) __obj.updateDynamic("numberOfLevelZeroTilesY")(numberOfLevelZeroTilesY.asInstanceOf[js.Any])
    if (rectangleNortheastInMeters != null) __obj.updateDynamic("rectangleNortheastInMeters")(rectangleNortheastInMeters.asInstanceOf[js.Any])
    if (rectangleSouthwestInMeters != null) __obj.updateDynamic("rectangleSouthwestInMeters")(rectangleSouthwestInMeters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEllipsoidNumberOfLevelZeroTilesXNumberOfLevelZeroTilesY]
  }
}

