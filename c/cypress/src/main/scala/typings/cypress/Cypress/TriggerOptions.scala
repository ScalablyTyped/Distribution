package typings.cypress.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to change the default behavior of .trigger()
  */
trait TriggerOptions
  extends Loggable
     with Timeoutable
     with Forceable {
  /**
    * Whether the event bubbles
    *
    * @default true
    */
  var bubbles: Boolean
  /**
    * Whether the event is cancelable
    *
    * @default true
    */
  var cancelable: Boolean
}

object TriggerOptions {
  @scala.inline
  def apply(bubbles: Boolean, cancelable: Boolean, force: Boolean, log: Boolean, timeout: Double): TriggerOptions = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TriggerOptions]
  }
}

