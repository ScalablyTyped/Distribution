package typings
package cypressLib.CypressNs

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
  var multiple: scala.Boolean
}

object ClickOptions {
  @scala.inline
  def apply(force: scala.Boolean, log: scala.Boolean, multiple: scala.Boolean, timeout: scala.Double): ClickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("force")(force)
    __obj.updateDynamic("log")(log)
    __obj.updateDynamic("multiple")(multiple)
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[ClickOptions]
  }
}

