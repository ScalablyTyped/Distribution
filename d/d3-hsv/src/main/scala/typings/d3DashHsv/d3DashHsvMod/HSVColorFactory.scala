package typings.d3DashHsv.d3DashHsvMod

import typings.d3DashColor.d3DashColorMod.ColorCommonInstance
import typings.d3DashColor.d3DashColorMod.ColorSpaceObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HSVColorFactory
  extends js.Function {
  def apply(color: ColorCommonInstance): HSVColor = js.native
  def apply(color: ColorSpaceObject): HSVColor = js.native
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
  def apply(cssColorSpecifier: String): HSVColor = js.native
  /**
    * Constructs a new HSV color.
    * @param h The hue of the returned color.
    * @param s The saturation of the returned color.
    * @param v The value of the returned color.
    * @param opacity The opacity of the returned color.
    */
  def apply(h: Double, s: Double, v: Double): HSVColor = js.native
  def apply(h: Double, s: Double, v: Double, opacity: Double): HSVColor = js.native
}

