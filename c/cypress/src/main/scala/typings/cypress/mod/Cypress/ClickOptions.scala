package typings.cypress.mod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object to change the default behavior of .click().
  */
trait ClickOptions
  extends Loggable
     with Timeoutable
     with Forceable {
  /**
    * Serially click multiple elements
    *
    * @default false
    */
  var multiple: Boolean
}

object ClickOptions {
  @scala.inline
  def apply(force: Boolean, log: Boolean, multiple: Boolean, timeout: Double): ClickOptions = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickOptions]
  }
}

