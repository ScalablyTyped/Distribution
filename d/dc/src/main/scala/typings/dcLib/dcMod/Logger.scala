package typings
package dcLib.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  var enableDebugLog: scala.Boolean
  def debug(msg: java.lang.String): scala.Unit
  def deprecate(fn: js.Function, msg: java.lang.String): scala.Unit
  def warn(msg: java.lang.String): scala.Unit
}

object Logger {
  @scala.inline
  def apply(
    debug: java.lang.String => scala.Unit,
    deprecate: (js.Function, java.lang.String) => scala.Unit,
    enableDebugLog: scala.Boolean,
    warn: java.lang.String => scala.Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), deprecate = js.Any.fromFunction2(deprecate), enableDebugLog = enableDebugLog, warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[Logger]
  }
}

