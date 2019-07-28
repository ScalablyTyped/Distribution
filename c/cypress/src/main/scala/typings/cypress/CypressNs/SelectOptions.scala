package typings.cypress.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectOptions
  extends Loggable
     with Timeoutable
     with Forceable {
  var interval: Double
}

object SelectOptions {
  @scala.inline
  def apply(force: Boolean, interval: Double, log: Boolean, timeout: Double): SelectOptions = {
    val __obj = js.Dynamic.literal(force = force, interval = interval, log = log, timeout = timeout)
  
    __obj.asInstanceOf[SelectOptions]
  }
}

