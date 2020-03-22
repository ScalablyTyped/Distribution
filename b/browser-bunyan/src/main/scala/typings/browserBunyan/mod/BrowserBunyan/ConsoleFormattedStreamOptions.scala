package typings.browserBunyan.mod.BrowserBunyan

import typings.browserBunyan.PartialConsoleFormattedStDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleFormattedStreamOptions extends js.Object {
  var css: js.UndefOr[PartialConsoleFormattedStDef] = js.undefined
  var logByLevel: js.UndefOr[Boolean] = js.undefined
}

object ConsoleFormattedStreamOptions {
  @scala.inline
  def apply(css: PartialConsoleFormattedStDef = null, logByLevel: js.UndefOr[Boolean] = js.undefined): ConsoleFormattedStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(logByLevel)) __obj.updateDynamic("logByLevel")(logByLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleFormattedStreamOptions]
  }
}

