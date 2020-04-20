package typings.cypress.mod.Cypress

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
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectOptions]
  }
}

