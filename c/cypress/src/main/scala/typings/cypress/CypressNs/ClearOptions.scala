package typings.cypress.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearOptions
  extends Loggable
     with Timeoutable
     with Forceable {
  var interval: Double
}

object ClearOptions {
  @scala.inline
  def apply(force: Boolean, interval: Double, log: Boolean, timeout: Double): ClearOptions = {
    val __obj = js.Dynamic.literal(force = force, interval = interval, log = log, timeout = timeout)
  
    __obj.asInstanceOf[ClearOptions]
  }
}

