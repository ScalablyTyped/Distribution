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
    val __obj = js.Dynamic.literal(bubbles = bubbles, cancelable = cancelable, force = force, log = log, timeout = timeout)
  
    __obj.asInstanceOf[TriggerOptions]
  }
}

