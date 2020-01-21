package typings.cypress.cypressMod.Cypress

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
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClearOptions]
  }
}

