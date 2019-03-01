package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectOptions
  extends Loggable
     with Timeoutable
     with Forceable {
  var interval: scala.Double
}

object SelectOptions {
  @scala.inline
  def apply(force: scala.Boolean, interval: scala.Double, log: scala.Boolean, timeout: scala.Double): SelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("force")(force)
    __obj.updateDynamic("interval")(interval)
    __obj.updateDynamic("log")(log)
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[SelectOptions]
  }
}

