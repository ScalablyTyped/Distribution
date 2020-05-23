package typings.cesium.anon

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Camera extends js.Object {
  var camera: js.UndefOr[typings.cesium.mod.Camera] = js.undefined
  var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
}

object Camera {
  @scala.inline
  def apply(
    camera: typings.cesium.mod.Camera = null,
    canvas: HTMLCanvasElement = null,
    ellipsoid: typings.cesium.mod.Ellipsoid = null
  ): Camera = {
    val __obj = js.Dynamic.literal()
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (canvas != null) __obj.updateDynamic("canvas")(canvas.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Camera]
  }
}

