package typings.cordovaPluginOuralabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDEBUG extends js.Object {
  var DEBUG: Double
  var ERROR: Double
  var FATAL: Double
  var INFO: Double
  var TRACE: Double
  var WARN: Double
}

object AnonDEBUG {
  @scala.inline
  def apply(DEBUG: Double, ERROR: Double, FATAL: Double, INFO: Double, TRACE: Double, WARN: Double): AnonDEBUG = {
    val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], FATAL = FATAL.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDEBUG]
  }
}

