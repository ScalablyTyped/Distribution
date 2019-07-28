package typings.cliDashBox.cliDashBoxMod

import typings.cliDashBox.cliDashBoxStrings.bottom
import typings.cliDashBox.cliDashBoxStrings.center
import typings.cliDashBox.cliDashBoxStrings.left
import typings.cliDashBox.cliDashBoxStrings.middle
import typings.cliDashBox.cliDashBoxStrings.right
import typings.cliDashBox.cliDashBoxStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends js.Object {
  var autoEOL: js.UndefOr[Boolean] = js.undefined
  var hAlign: js.UndefOr[left | middle | right] = js.undefined
  var stretch: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var vAlign: js.UndefOr[top | center | bottom] = js.undefined
}

object Text {
  @scala.inline
  def apply(
    autoEOL: js.UndefOr[Boolean] = js.undefined,
    hAlign: left | middle | right = null,
    stretch: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    vAlign: top | center | bottom = null
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

