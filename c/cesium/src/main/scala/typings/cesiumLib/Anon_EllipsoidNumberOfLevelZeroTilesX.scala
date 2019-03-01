package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EllipsoidNumberOfLevelZeroTilesX extends js.Object {
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Ellipsoid] = js.undefined
  var numberOfLevelZeroTilesX: js.UndefOr[scala.Double] = js.undefined
  var numberOfLevelZeroTilesY: js.UndefOr[scala.Double] = js.undefined
  var rectangle: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Rectangle] = js.undefined
}

object Anon_EllipsoidNumberOfLevelZeroTilesX {
  @scala.inline
  def apply(
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = null,
    numberOfLevelZeroTilesX: scala.Int | scala.Double = null,
    numberOfLevelZeroTilesY: scala.Int | scala.Double = null,
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle = null
  ): Anon_EllipsoidNumberOfLevelZeroTilesX = {
    val __obj = js.Dynamic.literal()
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (numberOfLevelZeroTilesX != null) __obj.updateDynamic("numberOfLevelZeroTilesX")(numberOfLevelZeroTilesX.asInstanceOf[js.Any])
    if (numberOfLevelZeroTilesY != null) __obj.updateDynamic("numberOfLevelZeroTilesY")(numberOfLevelZeroTilesY.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle)
    __obj.asInstanceOf[Anon_EllipsoidNumberOfLevelZeroTilesX]
  }
}

