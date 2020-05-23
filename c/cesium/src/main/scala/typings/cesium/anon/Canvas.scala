package typings.cesium.anon

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Canvas extends js.Object {
  var camera: typings.cesium.mod.Camera
  var canvas: HTMLCanvasElement
  var clampToGround: js.UndefOr[Boolean] = js.undefined
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var sourceUri: js.UndefOr[String] = js.undefined
}

object Canvas {
  @scala.inline
  def apply(
    camera: typings.cesium.mod.Camera,
    canvas: HTMLCanvasElement,
    clampToGround: js.UndefOr[Boolean] = js.undefined,
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    sourceUri: String = null
  ): Canvas = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any])
    if (!js.isUndefined(clampToGround)) __obj.updateDynamic("clampToGround")(clampToGround.get.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canvas]
  }
}

