package typings.blessed.mod.Widgets.Types

import typings.blessed.anon.Bg
import typings.blessed.blessedStrings.bg
import typings.blessed.blessedStrings.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TStyle extends js.Object {
  var bg: js.UndefOr[String] = js.undefined
  var blink: js.UndefOr[Boolean] = js.undefined
  var bold: js.UndefOr[Boolean] = js.undefined
  var border: js.UndefOr[line | bg | TBorder] = js.undefined
  var ch: js.UndefOr[String] = js.undefined
  var fg: js.UndefOr[String] = js.undefined
  var focus: js.UndefOr[Boolean] = js.undefined
  var hover: js.UndefOr[Boolean] = js.undefined
  var inverse: js.UndefOr[Boolean] = js.undefined
  var invisible: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var scrollbar: js.UndefOr[Bg] = js.undefined
  var track: js.UndefOr[Bg] = js.undefined
  var transparent: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var underline: js.UndefOr[Boolean] = js.undefined
}

object TStyle {
  @scala.inline
  def apply(
    bg: String = null,
    blink: js.UndefOr[Boolean] = js.undefined,
    bold: js.UndefOr[Boolean] = js.undefined,
    border: line | bg | TBorder = null,
    ch: String = null,
    fg: String = null,
    focus: js.UndefOr[Boolean] = js.undefined,
    hover: js.UndefOr[Boolean] = js.undefined,
    inverse: js.UndefOr[Boolean] = js.undefined,
    invisible: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    scrollbar: Bg = null,
    track: Bg = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    underline: js.UndefOr[Boolean] = js.undefined
  ): TStyle = {
    val __obj = js.Dynamic.literal()
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (!js.isUndefined(blink)) __obj.updateDynamic("blink")(blink.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.get.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (ch != null) __obj.updateDynamic("ch")(ch.asInstanceOf[js.Any])
    if (fg != null) __obj.updateDynamic("fg")(fg.asInstanceOf[js.Any])
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hover)) __obj.updateDynamic("hover")(hover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(invisible)) __obj.updateDynamic("invisible")(invisible.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TStyle]
  }
}

