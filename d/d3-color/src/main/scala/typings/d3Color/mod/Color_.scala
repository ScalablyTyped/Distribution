package typings.d3Color.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color_ extends js.Object {
  /**
    * Returns true if and only if the color is displayable on standard hardware.
    * For example, this returns false for an RGB color if any channel value is less than zero or greater than 255, or if the opacity is not in the range [0, 1].
    */
  def displayable(): Boolean = js.native
   // Note: While this method is used in prototyping for colors of specific colorspaces, it should not be called directly, as 'this.rgb' would not be implemented on Color
  /**
    * Returns a hexadecimal string representing this color.
    * If this color is not displayable, a suitable displayable color is returned instead. For example, RGB channel values greater than 255 are clamped to 255.
    */
  def hex(): String = js.native
}

object Color_ {
  @scala.inline
  def apply(displayable: () => Boolean, hex: () => String): Color_ = {
    val __obj = js.Dynamic.literal(displayable = js.Any.fromFunction0(displayable), hex = js.Any.fromFunction0(hex))
    __obj.asInstanceOf[Color_]
  }
  @scala.inline
  implicit class Color_Ops[Self <: Color_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplayable(value: () => Boolean): Self = this.set("displayable", js.Any.fromFunction0(value))
    @scala.inline
    def setHex(value: () => String): Self = this.set("hex", js.Any.fromFunction0(value))
  }
  
}

