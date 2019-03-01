package typings
package cypressLib.CypressNs

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
  var bubbles: scala.Boolean
  /**
    * Whether the event is cancelable
    *
    * @default true
    */
  var cancable: scala.Boolean
}

object TriggerOptions {
  @scala.inline
  def apply(
    bubbles: scala.Boolean,
    cancable: scala.Boolean,
    force: scala.Boolean,
    log: scala.Boolean,
    timeout: scala.Double
  ): TriggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bubbles")(bubbles)
    __obj.updateDynamic("cancable")(cancable)
    __obj.updateDynamic("force")(force)
    __obj.updateDynamic("log")(log)
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[TriggerOptions]
  }
}

