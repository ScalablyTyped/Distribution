package typings.blessed.mod.Widgets

import typings.blessed.blessedStrings.bg
import typings.blessed.blessedStrings.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  /**
    * Border foreground and background, must be numbers (-1 for default).
    */
  var bg: js.UndefOr[Double] = js.undefined
  /**
    * Border attributes.
    */
  var bold: js.UndefOr[String] = js.undefined
  /**
    * Character to use if bg type, default is space.
    */
  var ch: js.UndefOr[String] = js.undefined
  var fg: js.UndefOr[Double] = js.undefined
  /**
    * Type of border (line or bg). bg by default.
    */
  var `type`: js.UndefOr[line | bg] = js.undefined
  var underline: js.UndefOr[String] = js.undefined
}

object Border {
  @scala.inline
  def apply(
    bg: js.UndefOr[Double] = js.undefined,
    bold: String = null,
    ch: String = null,
    fg: js.UndefOr[Double] = js.undefined,
    `type`: line | bg = null,
    underline: String = null
  ): Border = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bg)) __obj.updateDynamic("bg")(bg.get.asInstanceOf[js.Any])
    if (bold != null) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (ch != null) __obj.updateDynamic("ch")(ch.asInstanceOf[js.Any])
    if (!js.isUndefined(fg)) __obj.updateDynamic("fg")(fg.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
}

