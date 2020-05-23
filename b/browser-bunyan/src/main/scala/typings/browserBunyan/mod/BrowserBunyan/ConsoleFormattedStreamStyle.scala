package typings.browserBunyan.mod.BrowserBunyan

import typings.browserBunyan.anon.PartialConsoleFormattedSt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleFormattedStreamStyle extends js.Object {
  var `def`: String
  var levels: PartialConsoleFormattedSt
  var msg: String
  var src: String
}

object ConsoleFormattedStreamStyle {
  @scala.inline
  def apply(`def`: String, levels: PartialConsoleFormattedSt, msg: String, src: String): ConsoleFormattedStreamStyle = {
    val __obj = js.Dynamic.literal(levels = levels.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleFormattedStreamStyle]
  }
}

