package typings.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ALERT extends js.Object {
  var ALERT: String
  var CRITICAL: String
  var DEBUG: String
  var EMERGENCY: String
  var ERROR: String
  var INFO: String
  var NOTICE: String
  var WARNING: String
}

object Anon_ALERT {
  @scala.inline
  def apply(
    ALERT: String,
    CRITICAL: String,
    DEBUG: String,
    EMERGENCY: String,
    ERROR: String,
    INFO: String,
    NOTICE: String,
    WARNING: String
  ): Anon_ALERT = {
    val __obj = js.Dynamic.literal(ALERT = ALERT, CRITICAL = CRITICAL, DEBUG = DEBUG, EMERGENCY = EMERGENCY, ERROR = ERROR, INFO = INFO, NOTICE = NOTICE, WARNING = WARNING)
  
    __obj.asInstanceOf[Anon_ALERT]
  }
}

