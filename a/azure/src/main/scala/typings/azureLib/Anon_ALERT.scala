package typings
package azureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ALERT extends js.Object {
  var ALERT: java.lang.String
  var CRITICAL: java.lang.String
  var DEBUG: java.lang.String
  var EMERGENCY: java.lang.String
  var ERROR: java.lang.String
  var INFO: java.lang.String
  var NOTICE: java.lang.String
  var WARNING: java.lang.String
}

object Anon_ALERT {
  @scala.inline
  def apply(
    ALERT: java.lang.String,
    CRITICAL: java.lang.String,
    DEBUG: java.lang.String,
    EMERGENCY: java.lang.String,
    ERROR: java.lang.String,
    INFO: java.lang.String,
    NOTICE: java.lang.String,
    WARNING: java.lang.String
  ): Anon_ALERT = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ALERT")(ALERT)
    __obj.updateDynamic("CRITICAL")(CRITICAL)
    __obj.updateDynamic("DEBUG")(DEBUG)
    __obj.updateDynamic("EMERGENCY")(EMERGENCY)
    __obj.updateDynamic("ERROR")(ERROR)
    __obj.updateDynamic("INFO")(INFO)
    __obj.updateDynamic("NOTICE")(NOTICE)
    __obj.updateDynamic("WARNING")(WARNING)
    __obj.asInstanceOf[Anon_ALERT]
  }
}

