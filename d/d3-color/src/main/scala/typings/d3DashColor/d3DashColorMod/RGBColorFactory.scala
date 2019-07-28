package typings.d3DashColor.d3DashColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RGBColorFactory
  extends js.Function {
  def apply(color: ColorCommonInstance): RGBColor = js.native
  /**
    * Converts the provided color instance and returns an RGB color. The color instance is converted to the RGB color space using color.rgb.
    * Note that unlike color.rgb this method always returns a new instance, even if color is already an RGB color.
    *
    * @param color A permissible color space instance.
    */
  def apply(color: ColorSpaceObject): RGBColor = js.native
  /**
    * Parses the specified CSS Color Module Level 3 specifier string, returning an RGB color.
    * If the specifier was not valid, null is returned.
    *
    * @param cssColorSpecifier A CSS Color Module Level 3 specifier string.
    */
  def apply(cssColorSpecifier: String): RGBColor = js.native
  /**
    * Constructs a new RGB color based on the specified channel values and opacity.
    *
    * @param r Red channel value.
    * @param g Green channel value.
    * @param b Blue channel value.
    * @param opacity Optional opacity value, defaults to 1.
    */
  def apply(r: Double, g: Double, b: Double): RGBColor = js.native
  def apply(r: Double, g: Double, b: Double, opacity: Double): RGBColor = js.native
}

