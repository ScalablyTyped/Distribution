package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CameraCanvas extends js.Object {
  var camera: cesiumLib.cesiumMod.CesiumNs.Camera
  var canvas: stdLib.HTMLCanvasElement
  var clampToGround: js.UndefOr[scala.Boolean] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Ellipsoid] = js.undefined
  var sourceUri: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CameraCanvas {
  @scala.inline
  def apply(
    camera: cesiumLib.cesiumMod.CesiumNs.Camera,
    canvas: stdLib.HTMLCanvasElement,
    clampToGround: js.UndefOr[scala.Boolean] = js.undefined,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = null,
    sourceUri: java.lang.String = null
  ): Anon_CameraCanvas = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("camera")(camera)
    __obj.updateDynamic("canvas")(canvas)
    if (!js.isUndefined(clampToGround)) __obj.updateDynamic("clampToGround")(clampToGround)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri)
    __obj.asInstanceOf[Anon_CameraCanvas]
  }
}

