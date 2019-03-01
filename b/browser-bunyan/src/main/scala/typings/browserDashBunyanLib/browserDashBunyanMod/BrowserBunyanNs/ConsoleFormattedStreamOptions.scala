package typings
package browserDashBunyanLib.browserDashBunyanMod.BrowserBunyanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleFormattedStreamOptions extends js.Object {
  var css: js.UndefOr[stdLib.Partial[ConsoleFormattedStreamStyle]] = js.undefined
  var logByLevel: js.UndefOr[scala.Boolean] = js.undefined
}

object ConsoleFormattedStreamOptions {
  @scala.inline
  def apply(
    css: stdLib.Partial[ConsoleFormattedStreamStyle] = null,
    logByLevel: js.UndefOr[scala.Boolean] = js.undefined
  ): ConsoleFormattedStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (css != null) __obj.updateDynamic("css")(css)
    if (!js.isUndefined(logByLevel)) __obj.updateDynamic("logByLevel")(logByLevel)
    __obj.asInstanceOf[ConsoleFormattedStreamOptions]
  }
}

