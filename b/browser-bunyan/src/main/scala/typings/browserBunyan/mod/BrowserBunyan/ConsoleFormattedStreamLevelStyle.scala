package typings.browserBunyan.mod.BrowserBunyan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleFormattedStreamLevelStyle extends js.Object {
  var debug: String
  var error: String
  var fatal: String
  var info: String
  var trace: String
  var warn: String
}

object ConsoleFormattedStreamLevelStyle {
  @scala.inline
  def apply(debug: String, error: String, fatal: String, info: String, trace: String, warn: String): ConsoleFormattedStreamLevelStyle = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConsoleFormattedStreamLevelStyle]
  }
}

