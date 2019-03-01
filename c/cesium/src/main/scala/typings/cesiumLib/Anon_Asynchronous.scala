package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Asynchronous extends js.Object {
  var asynchronous: js.UndefOr[scala.Boolean] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[scala.Boolean] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Ellipsoid] = js.undefined
  var granularity: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var id: js.UndefOr[js.Any] = js.undefined
  var material: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Material] = js.undefined
  var rectangle: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Rectangle] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var textureRotationAngle: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Asynchronous {
  @scala.inline
  def apply(
    asynchronous: js.UndefOr[scala.Boolean] = js.undefined,
    debugShowBoundingVolume: js.UndefOr[scala.Boolean] = js.undefined,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = null,
    granularity: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    id: js.Any = null,
    material: cesiumLib.cesiumMod.CesiumNs.Material = null,
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle = null,
    rotation: scala.Int | scala.Double = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    textureRotationAngle: scala.Int | scala.Double = null
  ): Anon_Asynchronous = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asynchronous)) __obj.updateDynamic("asynchronous")(asynchronous)
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (material != null) __obj.updateDynamic("material")(material)
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (textureRotationAngle != null) __obj.updateDynamic("textureRotationAngle")(textureRotationAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Asynchronous]
  }
}

