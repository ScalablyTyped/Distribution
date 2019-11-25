package typings.cesium

import typings.cesium.cesiumMod.BoundingRectangle
import typings.cesium.cesiumMod.Color
import typings.cesium.cesiumMod.PixelFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClearColor extends js.Object {
  var clearColor: js.UndefOr[Color] = js.undefined
  var forcePowerOfTwo: js.UndefOr[Boolean] = js.undefined
  var fragmentShader: String
  var name: js.UndefOr[String] = js.undefined
  var pixelFormat: js.UndefOr[PixelFormat] = js.undefined
  var scissorRectangle: js.UndefOr[BoundingRectangle] = js.undefined
  var textureScale: js.UndefOr[Double] = js.undefined
  var uniforms: js.UndefOr[js.Object] = js.undefined
}

object Anon_ClearColor {
  @scala.inline
  def apply(
    fragmentShader: String,
    clearColor: Color = null,
    forcePowerOfTwo: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    pixelFormat: PixelFormat = null,
    scissorRectangle: BoundingRectangle = null,
    textureScale: Int | Double = null,
    uniforms: js.Object = null
  ): Anon_ClearColor = {
    val __obj = js.Dynamic.literal(fragmentShader = fragmentShader.asInstanceOf[js.Any])
    if (clearColor != null) __obj.updateDynamic("clearColor")(clearColor.asInstanceOf[js.Any])
    if (!js.isUndefined(forcePowerOfTwo)) __obj.updateDynamic("forcePowerOfTwo")(forcePowerOfTwo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pixelFormat != null) __obj.updateDynamic("pixelFormat")(pixelFormat.asInstanceOf[js.Any])
    if (scissorRectangle != null) __obj.updateDynamic("scissorRectangle")(scissorRectangle.asInstanceOf[js.Any])
    if (textureScale != null) __obj.updateDynamic("textureScale")(textureScale.asInstanceOf[js.Any])
    if (uniforms != null) __obj.updateDynamic("uniforms")(uniforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClearColor]
  }
}

