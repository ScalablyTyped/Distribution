package typings.cypress.CypressNs

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
    val __obj = js.Dynamic.literal(force = force, log = log, multiple = multiple, timeout = timeout)
  
    __obj.asInstanceOf[ClickOptions]
  }
}

