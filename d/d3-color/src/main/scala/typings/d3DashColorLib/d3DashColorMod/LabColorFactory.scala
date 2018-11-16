package typings
package d3DashColorLib.d3DashColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabColorFactory
  extends js.Function {
  /**
       * Converts the provided color instance and returns a Lab color.
       * The color instance is converted to the RGB color space using color.rgb and then converted to Lab.
       * (Colors already in the Lab color space skip the conversion to RGB,
       * and colors in the HCL color space are converted directly to Lab.)
       *
       * @param color A permissible color space instance.
       */
  def apply(color: ColorCommonInstance): LabColor = js.native
  /**
       * Converts the provided color instance and returns a Lab color.
       * The color instance is converted to the RGB color space using color.rgb and then converted to Lab.
       * (Colors already in the Lab color space skip the conversion to RGB,
       * and colors in the HCL color space are converted directly to Lab.)
       *
       * @param color A permissible color space instance.
       */
  def apply(color: ColorSpaceObject): LabColor = js.native
  /**
       * Parses the specified CSS Color Module Level 3 specifier string, returning a Lab color.
       * If the specifier was not valid, null is returned.
       *
       * @param cssColorSpecifier A CSS Color Module Level 3 specifier string.
       */
  def apply(cssColorSpecifier: java.lang.String): LabColor = js.native
  /**
       * Constructs a new Lab color based on the specified channel values and opacity.
       *
       * @param l Lightness typically in the range [0, 100].
       * @param a Position between red/magenta and green typically in [-160, +160].
       * @param b Position between yellow and blue typically in [-160, +160].
       * @param opacity Optional opacity value, defaults to 1.
       */
  def apply(l: scala.Double, a: scala.Double, b: scala.Double): LabColor = js.native
  /**
       * Constructs a new Lab color based on the specified channel values and opacity.
       *
       * @param l Lightness typically in the range [0, 100].
       * @param a Position between red/magenta and green typically in [-160, +160].
       * @param b Position between yellow and blue typically in [-160, +160].
       * @param opacity Optional opacity value, defaults to 1.
       */
  def apply(l: scala.Double, a: scala.Double, b: scala.Double, opacity: scala.Double): LabColor = js.native
}

