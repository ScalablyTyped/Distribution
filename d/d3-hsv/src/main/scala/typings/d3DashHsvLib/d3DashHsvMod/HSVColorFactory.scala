package typings
package d3DashHsvLib.d3DashHsvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HSVColorFactory
  extends js.Function {
  def apply(color: d3DashColorLib.d3DashColorMod.ColorCommonInstance): HSVColor = js.native
  def apply(color: d3DashColorLib.d3DashColorMod.ColorSpaceObject): HSVColor = js.native
  /**
    * Constructs a new HSV color.
    * @param color A color instance, it will be converted to the RGB color space
    * using `color.rgb` and then converted to HSV.
    */
  def apply(color: HSVColor): HSVColor = js.native
  /**
    * Constructs a new HSV color.
    * @param cssColorSpecifier A CSS Color Module Level 3 specifier string,
    * it is parsed and then converted to the HSV color space.
    */
  def apply(cssColorSpecifier: java.lang.String): HSVColor = js.native
  /**
    * Constructs a new HSV color.
    * @param h The hue of the returned color.
    * @param s The saturation of the returned color.
    * @param v The value of the returned color.
    * @param opacity The opacity of the returned color.
    */
  def apply(h: scala.Double, s: scala.Double, v: scala.Double): HSVColor = js.native
  def apply(h: scala.Double, s: scala.Double, v: scala.Double, opacity: scala.Double): HSVColor = js.native
}

