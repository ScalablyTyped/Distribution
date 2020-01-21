package typings.colornames.mod

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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(css)) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(vga)) __obj.updateDynamic("vga")(vga.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

