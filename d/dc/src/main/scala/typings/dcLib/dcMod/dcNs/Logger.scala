package typings
package dcLib.dcMod.dcNs

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
    debug: js.Function1[java.lang.String, scala.Unit],
    deprecate: js.Function2[js.Function, java.lang.String, scala.Unit],
    enableDebugLog: scala.Boolean,
    warn: js.Function1[java.lang.String, scala.Unit]
  ): Logger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("deprecate")(deprecate)
    __obj.updateDynamic("enableDebugLog")(enableDebugLog)
    __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[Logger]
  }
}

