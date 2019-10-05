package typings.cypress.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckOptions
  extends Loggable
     with Timeoutable
     with Forceable {
  var interval: Double
}

object CheckOptions {
  @scala.inline
  def apply(force: Boolean, interval: Double, log: Boolean, timeout: Double): CheckOptions = {
    val __obj = js.Dynamic.literal(force = force, interval = interval, log = log, timeout = timeout)
  
    __obj.asInstanceOf[CheckOptions]
  }
}

