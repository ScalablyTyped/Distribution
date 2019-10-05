package typings.blessed.blessedMod.Widgets.Types

import typings.blessed.blessedStrings.bg
import typings.blessed.blessedStrings.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TBorder extends js.Object {
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

object TBorder {
  @scala.inline
  def apply(
    bg: Int | Double = null,
    bold: String = null,
    ch: String = null,
    fg: Int | Double = null,
    `type`: line | bg = null,
    underline: String = null
  ): TBorder = {
    val __obj = js.Dynamic.literal()
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (bold != null) __obj.updateDynamic("bold")(bold)
    if (ch != null) __obj.updateDynamic("ch")(ch)
    if (fg != null) __obj.updateDynamic("fg")(fg.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline)
    __obj.asInstanceOf[TBorder]
  }
}

