package typings.browserBunyan.mod.BrowserBunyan

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleFormattedStreamOptions extends js.Object {
  var css: js.UndefOr[Partial[ConsoleFormattedStreamStyle]] = js.undefined
  var logByLevel: js.UndefOr[Boolean] = js.undefined
}

object ConsoleFormattedStreamOptions {
  @scala.inline
  def apply(css: Partial[ConsoleFormattedStreamStyle] = null, logByLevel: js.UndefOr[Boolean] = js.undefined): ConsoleFormattedStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(logByLevel)) __obj.updateDynamic("logByLevel")(logByLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleFormattedStreamOptions]
  }
}

