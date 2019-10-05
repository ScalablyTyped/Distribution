package typings.browserDashBunyan.browserDashBunyanMod.BrowserBunyan

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleFormattedStreamStyle extends js.Object {
  var `def`: String
  var levels: Partial[ConsoleFormattedStreamLevelStyle]
  var msg: String
  var src: String
}

object ConsoleFormattedStreamStyle {
  @scala.inline
  def apply(`def`: String, levels: Partial[ConsoleFormattedStreamLevelStyle], msg: String, src: String): ConsoleFormattedStreamStyle = {
    val __obj = js.Dynamic.literal(levels = levels, msg = msg, src = src)
    __obj.updateDynamic("def")(`def`)
    __obj.asInstanceOf[ConsoleFormattedStreamStyle]
  }
}

