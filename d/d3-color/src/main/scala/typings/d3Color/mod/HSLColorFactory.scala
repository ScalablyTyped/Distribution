package typings.d3Color.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HSLColorFactory
  extends js.Function {
  def apply(color: ColorCommonInstance): HSLColor = js.native
  /**
    * Converts the provided color instance and returns an HSL color.
    * The color instance is converted to the RGB color space using color.rgb and then converted to HSL.
    * (Colors already in the HSL color space skip the conversion to RGB.)
    *
    * @param color A permissible color space instance.
    */
  def apply(color: ColorSpaceObject): HSLColor = js.native
  /**
    * Parses the specified CSS Color Module Level 3 specifier string, returning an HSL color.
    * If the specifier was not valid, null is returned.
    *
    * @param cssColorSpecifier A CSS Color Module Level 3 specifier string.
    */
  def apply(cssColorSpecifier: String): HSLColor = js.native
  /**
    * Constructs a new HSL color based on the specified channel values and opacity.
    *
    * @param h Hue channel value.
    * @param s Saturation channel value.
    * @param l Lightness channel value.
    * @param opacity Optional opacity value, defaults to 1.
    */
  def apply(h: Double, s: Double, l: Double): HSLColor = js.native
  def apply(h: Double, s: Double, l: Double, opacity: Double): HSLColor = js.native
}

