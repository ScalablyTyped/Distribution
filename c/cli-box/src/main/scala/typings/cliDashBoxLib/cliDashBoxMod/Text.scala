package typings
package cliDashBoxLib.cliDashBoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends js.Object {
  var autoEOL: js.UndefOr[scala.Boolean] = js.undefined
  var hAlign: js.UndefOr[
    cliDashBoxLib.cliDashBoxLibStrings.left | cliDashBoxLib.cliDashBoxLibStrings.middle | cliDashBoxLib.cliDashBoxLibStrings.right
  ] = js.undefined
  var stretch: js.UndefOr[scala.Boolean] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var vAlign: js.UndefOr[
    cliDashBoxLib.cliDashBoxLibStrings.top | cliDashBoxLib.cliDashBoxLibStrings.center | cliDashBoxLib.cliDashBoxLibStrings.bottom
  ] = js.undefined
}

object Text {
  @scala.inline
  def apply(
    autoEOL: js.UndefOr[scala.Boolean] = js.undefined,
    hAlign: cliDashBoxLib.cliDashBoxLibStrings.left | cliDashBoxLib.cliDashBoxLibStrings.middle | cliDashBoxLib.cliDashBoxLibStrings.right = null,
    stretch: js.UndefOr[scala.Boolean] = js.undefined,
    text: java.lang.String = null,
    vAlign: cliDashBoxLib.cliDashBoxLibStrings.top | cliDashBoxLib.cliDashBoxLibStrings.center | cliDashBoxLib.cliDashBoxLibStrings.bottom = null
  ): Text = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoEOL)) __obj.updateDynamic("autoEOL")(autoEOL)
    if (hAlign != null) __obj.updateDynamic("hAlign")(hAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(stretch)) __obj.updateDynamic("stretch")(stretch)
    if (text != null) __obj.updateDynamic("text")(text)
    if (vAlign != null) __obj.updateDynamic("vAlign")(vAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

