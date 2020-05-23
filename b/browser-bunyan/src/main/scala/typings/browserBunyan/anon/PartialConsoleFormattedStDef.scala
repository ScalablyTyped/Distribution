package typings.browserBunyan.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<browser-bunyan.browser-bunyan.BrowserBunyan.ConsoleFormattedStreamStyle> */
trait PartialConsoleFormattedStDef extends js.Object {
  var `def`: js.UndefOr[String] = js.undefined
  var levels: js.UndefOr[PartialConsoleFormattedSt] = js.undefined
  var msg: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
}

object PartialConsoleFormattedStDef {
  @scala.inline
  def apply(
    `def`: String = null,
    levels: PartialConsoleFormattedSt = null,
    msg: String = null,
    src: String = null
  ): PartialConsoleFormattedStDef = {
    val __obj = js.Dynamic.literal()
    if (`def` != null) __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialConsoleFormattedStDef]
  }
}

