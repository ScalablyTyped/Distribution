package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EllipsoidNumberOfLevelZeroTilesXNumberOfLevelZeroTilesY extends js.Object {
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.Ellipsoid] = js.undefined
  var numberOfLevelZeroTilesX: js.UndefOr[scala.Double] = js.undefined
  var numberOfLevelZeroTilesY: js.UndefOr[scala.Double] = js.undefined
  var rectangleNortheastInMeters: js.UndefOr[cesiumLib.cesiumMod.Cartesian2] = js.undefined
  var rectangleSouthwestInMeters: js.UndefOr[cesiumLib.cesiumMod.Cartesian2] = js.undefined
}

object Anon_EllipsoidNumberOfLevelZeroTilesXNumberOfLevelZeroTilesY {
  @scala.inline
  def apply(
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid = null,
    numberOfLevelZeroTilesX: scala.Int | scala.Double = null,
    numberOfLevelZeroTilesY: scala.Int | scala.Double = null,
    rectangleNortheastInMeters: cesiumLib.cesiumMod.Cartesian2 = null,
    rectangleSouthwestInMeters: cesiumLib.cesiumMod.Cartesian2 = null
  ): Anon_EllipsoidNumberOfLevelZeroTilesXNumberOfLevelZeroTilesY = {
    val __obj = js.Dynamic.literal()
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (numberOfLevelZeroTilesX != null) __obj.updateDynamic("numberOfLevelZeroTilesX")(numberOfLevelZeroTilesX.asInstanceOf[js.Any])
    if (numberOfLevelZeroTilesY != null) __obj.updateDynamic("numberOfLevelZeroTilesY")(numberOfLevelZeroTilesY.asInstanceOf[js.Any])
    if (rectangleNortheastInMeters != null) __obj.updateDynamic("rectangleNortheastInMeters")(rectangleNortheastInMeters)
    if (rectangleSouthwestInMeters != null) __obj.updateDynamic("rectangleSouthwestInMeters")(rectangleSouthwestInMeters)
    __obj.asInstanceOf[Anon_EllipsoidNumberOfLevelZeroTilesXNumberOfLevelZeroTilesY]
  }
}

