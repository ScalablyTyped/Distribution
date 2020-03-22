package typings.cesium

import typings.cesium.mod.Camera
import typings.cesium.mod.Ellipsoid
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanvas extends js.Object {
  var camera: Camera
  var canvas: HTMLCanvasElement
  var clampToGround: js.UndefOr[Boolean] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var sourceUri: js.UndefOr[String] = js.undefined
}

object AnonCanvas {
  @scala.inline
  def apply(
    camera: Camera,
    canvas: HTMLCanvasElement,
    clampToGround: js.UndefOr[Boolean] = js.undefined,
    ellipsoid: Ellipsoid = null,
    sourceUri: String = null
  ): AnonCanvas = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any])
    if (!js.isUndefined(clampToGround)) __obj.updateDynamic("clampToGround")(clampToGround.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCanvas]
  }
}

