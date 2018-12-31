package typings
package d3DashColorLib.d3DashColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LCHColorFactory extends js.Object {
  def apply(color: ColorCommonInstance): HCLColor = js.native
  /**
    * Converts the provided color instance and returns an HCL color.
    * The color instance is converted to the RGB color space using color.rgb and then converted to HCL.
    * (Colors already in the HCL color space skip the conversion to RGB,
    * and colors in the Lab color space are converted directly to HCL.)
    *
    * @param color A permissible color space instance.
    */
  def apply(color: ColorSpaceObject): HCLColor = js.native
  /**
    * Parses the specified CSS Color Module Level 3 specifier string, returning an HCL color.
    * If the specifier was not valid, null is returned.
    *
    * @param cssColorSpecifier A CSS color Module Level 3 specifier string.
    */
  def apply(cssColorSpecifier: java.lang.String): HCLColor = js.native
  /**
    * Constructs a new HCL color based on the specified channel values and opacity.
    *
    * @param l Luminance channel value typically in the range [0, 100].
    * @param c Chroma channel value typically in [0, 230].
    * @param h Hue channel value typically in [0, 360).
    * @param opacity Optional opacity value, defaults to 1.
    */
  def apply(l: scala.Double, c: scala.Double, h: scala.Double): HCLColor = js.native
  def apply(l: scala.Double, c: scala.Double, h: scala.Double, opacity: scala.Double): HCLColor = js.native
}

