package typings.colornames.colornamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  /**
    * Gets a value indicating whether the color is a valid `CSS`-color.
    */
  var css: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets the name of the color.
    */
  var name: String
  /**
    * Gets the value of the color.
    */
  var value: String
  /**
    * Gets a value indicating whether the color is a valid `VGA`-color.
    */
  var vga: js.UndefOr[Boolean] = js.undefined
}

object Color {
  @scala.inline
  def apply(
    name: String,
    value: String,
    css: js.UndefOr[Boolean] = js.undefined,
    vga: js.UndefOr[Boolean] = js.undefined
  ): Color = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (!js.isUndefined(css)) __obj.updateDynamic("css")(css)
    if (!js.isUndefined(vga)) __obj.updateDynamic("vga")(vga)
    __obj.asInstanceOf[Color]
  }
}

