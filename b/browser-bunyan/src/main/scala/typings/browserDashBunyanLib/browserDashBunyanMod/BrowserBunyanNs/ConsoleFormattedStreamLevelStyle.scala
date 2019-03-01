package typings
package browserDashBunyanLib.browserDashBunyanMod.BrowserBunyanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleFormattedStreamLevelStyle extends js.Object {
  var debug: java.lang.String
  var error: java.lang.String
  var fatal: java.lang.String
  var info: java.lang.String
  var trace: java.lang.String
  var warn: java.lang.String
}

object ConsoleFormattedStreamLevelStyle {
  @scala.inline
  def apply(
    debug: java.lang.String,
    error: java.lang.String,
    fatal: java.lang.String,
    info: java.lang.String,
    trace: java.lang.String,
    warn: java.lang.String
  ): ConsoleFormattedStreamLevelStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("fatal")(fatal)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("trace")(trace)
    __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[ConsoleFormattedStreamLevelStyle]
  }
}

