package typings.dc.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  var enableDebugLog: Boolean
  def debug(msg: String): Unit
  def deprecate(fn: js.Function, msg: String): Unit
  def warn(msg: String): Unit
}

object Logger {
  @scala.inline
  def apply(
    debug: String => Unit,
    deprecate: (js.Function, String) => Unit,
    enableDebugLog: Boolean,
    warn: String => Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), deprecate = js.Any.fromFunction2(deprecate), enableDebugLog = enableDebugLog.asInstanceOf[js.Any], warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[Logger]
  }
}

