package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Camera extends js.Object {
  var camera: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Camera] = js.undefined
  var canvas: js.UndefOr[stdLib.HTMLCanvasElement] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Ellipsoid] = js.undefined
}

object Anon_Camera {
  @scala.inline
  def apply(
    camera: cesiumLib.cesiumMod.CesiumNs.Camera = null,
    canvas: stdLib.HTMLCanvasElement = null,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = null
  ): Anon_Camera = {
    val __obj = js.Dynamic.literal()
    if (camera != null) __obj.updateDynamic("camera")(camera)
    if (canvas != null) __obj.updateDynamic("canvas")(canvas)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    __obj.asInstanceOf[Anon_Camera]
  }
}

