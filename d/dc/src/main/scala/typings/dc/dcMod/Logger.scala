package typings.dc.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  var enableDebugLog: Boolean
  def annotate(fn: js.Function, msg: String): Logger
  def debug(msg: String): Logger
  def deprecate(fn: js.Function, msg: String): Unit
  def warn(msg: String): Logger
  def warnOnce(msg: String): Logger
}

object Logger {
  @scala.inline
  def apply(
    annotate: (js.Function, String) => Logger,
    debug: String => Logger,
    deprecate: (js.Function, String) => Unit,
    enableDebugLog: Boolean,
    warn: String => Logger,
    warnOnce: String => Logger
  ): Logger = {
    val __obj = js.Dynamic.literal(annotate = js.Any.fromFunction2(annotate), debug = js.Any.fromFunction1(debug), deprecate = js.Any.fromFunction2(deprecate), enableDebugLog = enableDebugLog.asInstanceOf[js.Any], warn = js.Any.fromFunction1(warn), warnOnce = js.Any.fromFunction1(warnOnce))
  
    __obj.asInstanceOf[Logger]
  }
}

