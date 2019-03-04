package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearOptions
  extends Loggable
     with Timeoutable
     with Forceable {
  var interval: scala.Double
}

object ClearOptions {
  @scala.inline
  def apply(force: scala.Boolean, interval: scala.Double, log: scala.Boolean, timeout: scala.Double): ClearOptions = {
    val __obj = js.Dynamic.literal(force = force, interval = interval, log = log, timeout = timeout)
  
    __obj.asInstanceOf[ClearOptions]
  }
}

