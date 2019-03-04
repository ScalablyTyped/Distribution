package typings
package d3DashColorLib.d3DashColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  /**
    * Returns true if and only if the color is displayable on standard hardware.
    * For example, this returns false for an RGB color if any channel value is less than zero or greater than 255, or if the opacity is not in the range [0, 1].
    */
  def displayable(): scala.Boolean
   // Note: While this method is used in prototyping for colors of specific colorspaces, it should not be called directly, as 'this.rgb' would not be implemented on Color
  /**
    * Returns a hexadecimal string representing this color.
    * If this color is not displayable, a suitable displayable color is returned instead. For example, RGB channel values greater than 255 are clamped to 255.
    */
  def hex(): java.lang.String
}

object Color {
  @scala.inline
  def apply(
    displayable: js.Function0[scala.Boolean],
    hex: js.Function0[java.lang.String],
    toString: js.Function0[java.lang.String]
  ): Color = {
    val __obj = js.Dynamic.literal(displayable = displayable, hex = hex, toString = toString)
  
    __obj.asInstanceOf[Color]
  }
}

