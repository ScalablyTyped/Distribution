package typings
package d3DashColorLib.d3DashColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorFactory
  extends js.Function {
  def apply(color: ColorCommonInstance): RGBColor | HSLColor = js.native
  /**
    * Converts the provided color instance and returns an RGB or HSL color.
    *
    * @param color A permissible color space instance.
    */
  def apply(color: ColorSpaceObject): RGBColor | HSLColor = js.native
  /**
    * Parses the specified CSS Color Module Level 3 specifier string, returning an RGB or HSL color.
    * If the specifier was not valid, null is returned.
    *
    * @param cssColorSpecifier A CSS Color Module Level 3 specifier string.
    */
  def apply(cssColorSpecifier: java.lang.String): RGBColor | HSLColor | scala.Null = js.native
}

