package typings.cesium

import typings.cesium.cesiumMod.Camera
import typings.cesium.cesiumMod.Ellipsoid
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CameraCanvas extends js.Object {
  var camera: Camera
  var canvas: HTMLCanvasElement
  var clampToGround: js.UndefOr[Boolean] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var sourceUri: js.UndefOr[String] = js.undefined
}

object Anon_CameraCanvas {
  @scala.inline
  def apply(
    camera: Camera,
    canvas: HTMLCanvasElement,
    clampToGround: js.UndefOr[Boolean] = js.undefined,
    ellipsoid: Ellipsoid = null,
    sourceUri: String = null
  ): Anon_CameraCanvas = {
    val __obj = js.Dynamic.literal(camera = camera, canvas = canvas)
    if (!js.isUndefined(clampToGround)) __obj.updateDynamic("clampToGround")(clampToGround)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri)
    __obj.asInstanceOf[Anon_CameraCanvas]
  }
}

