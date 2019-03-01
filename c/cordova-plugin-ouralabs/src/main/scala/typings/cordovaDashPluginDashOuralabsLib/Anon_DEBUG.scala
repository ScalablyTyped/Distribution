package typings
package cordovaDashPluginDashOuralabsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DEBUG extends js.Object {
  var DEBUG: scala.Double
  var ERROR: scala.Double
  var FATAL: scala.Double
  var INFO: scala.Double
  var TRACE: scala.Double
  var WARN: scala.Double
}

object Anon_DEBUG {
  @scala.inline
  def apply(
    DEBUG: scala.Double,
    ERROR: scala.Double,
    FATAL: scala.Double,
    INFO: scala.Double,
    TRACE: scala.Double,
    WARN: scala.Double
  ): Anon_DEBUG = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DEBUG")(DEBUG)
    __obj.updateDynamic("ERROR")(ERROR)
    __obj.updateDynamic("FATAL")(FATAL)
    __obj.updateDynamic("INFO")(INFO)
    __obj.updateDynamic("TRACE")(TRACE)
    __obj.updateDynamic("WARN")(WARN)
    __obj.asInstanceOf[Anon_DEBUG]
  }
}

