package typings
package browserDashBunyanLib.browserDashBunyanMod.BrowserBunyanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleFormattedStreamStyle extends js.Object {
  var `def`: java.lang.String
  var levels: stdLib.Partial[ConsoleFormattedStreamLevelStyle]
  var msg: java.lang.String
  var src: java.lang.String
}

object ConsoleFormattedStreamStyle {
  @scala.inline
  def apply(
    `def`: java.lang.String,
    levels: stdLib.Partial[ConsoleFormattedStreamLevelStyle],
    msg: java.lang.String,
    src: java.lang.String
  ): ConsoleFormattedStreamStyle = {
    val __obj = js.Dynamic.literal(`def` = `def`)
    __obj.updateDynamic("levels")(levels)
    __obj.updateDynamic("msg")(msg)
    __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[ConsoleFormattedStreamStyle]
  }
}

