package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClearColor extends js.Object {
  var clearColor: js.UndefOr[cesiumLib.cesiumMod.Color] = js.undefined
  var forcePowerOfTwo: js.UndefOr[scala.Boolean] = js.undefined
  var fragmentShader: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
  var pixelFormat: js.UndefOr[cesiumLib.cesiumMod.PixelFormat] = js.undefined
  var scissorRectangle: js.UndefOr[cesiumLib.cesiumMod.BoundingRectangle] = js.undefined
  var textureScale: js.UndefOr[scala.Double] = js.undefined
  var uniforms: js.UndefOr[js.Object] = js.undefined
}

object Anon_ClearColor {
  @scala.inline
  def apply(
    fragmentShader: java.lang.String,
    clearColor: cesiumLib.cesiumMod.Color = null,
    forcePowerOfTwo: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    pixelFormat: cesiumLib.cesiumMod.PixelFormat = null,
    scissorRectangle: cesiumLib.cesiumMod.BoundingRectangle = null,
    textureScale: scala.Int | scala.Double = null,
    uniforms: js.Object = null
  ): Anon_ClearColor = {
    val __obj = js.Dynamic.literal(fragmentShader = fragmentShader)
    if (clearColor != null) __obj.updateDynamic("clearColor")(clearColor)
    if (!js.isUndefined(forcePowerOfTwo)) __obj.updateDynamic("forcePowerOfTwo")(forcePowerOfTwo)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pixelFormat != null) __obj.updateDynamic("pixelFormat")(pixelFormat)
    if (scissorRectangle != null) __obj.updateDynamic("scissorRectangle")(scissorRectangle)
    if (textureScale != null) __obj.updateDynamic("textureScale")(textureScale.asInstanceOf[js.Any])
    if (uniforms != null) __obj.updateDynamic("uniforms")(uniforms)
    __obj.asInstanceOf[Anon_ClearColor]
  }
}

