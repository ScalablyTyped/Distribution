package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberOfLevelZeroTilesY extends js.Object {
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var numberOfLevelZeroTilesX: js.UndefOr[Double] = js.undefined
  var numberOfLevelZeroTilesY: js.UndefOr[Double] = js.undefined
  var rectangleNortheastInMeters: js.UndefOr[Cartesian2] = js.undefined
  var rectangleSouthwestInMeters: js.UndefOr[Cartesian2] = js.undefined
}

object NumberOfLevelZeroTilesY {
  @scala.inline
  def apply(
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    numberOfLevelZeroTilesX: js.UndefOr[Double] = js.undefined,
    numberOfLevelZeroTilesY: js.UndefOr[Double] = js.undefined,
    rectangleNortheastInMeters: Cartesian2 = null,
    rectangleSouthwestInMeters: Cartesian2 = null
  ): NumberOfLevelZeroTilesY = {
    val __obj = js.Dynamic.literal()
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfLevelZeroTilesX)) __obj.updateDynamic("numberOfLevelZeroTilesX")(numberOfLevelZeroTilesX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfLevelZeroTilesY)) __obj.updateDynamic("numberOfLevelZeroTilesY")(numberOfLevelZeroTilesY.get.asInstanceOf[js.Any])
    if (rectangleNortheastInMeters != null) __obj.updateDynamic("rectangleNortheastInMeters")(rectangleNortheastInMeters.asInstanceOf[js.Any])
    if (rectangleSouthwestInMeters != null) __obj.updateDynamic("rectangleSouthwestInMeters")(rectangleSouthwestInMeters.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberOfLevelZeroTilesY]
  }
}

