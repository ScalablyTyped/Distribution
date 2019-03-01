package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that control `cy.type` command
  *
  * @see https://on.cypress.io/type
  */
trait TypeOptions
  extends Loggable
     with Timeoutable {
  /**
    * Delay after each keypress (ms)
    *
    * @default 10
    */
  var delay: scala.Double
  /**
    * Forces the action, disables waiting for actionability
    *
    * @default false
    */
  var force: scala.Boolean
  /**
    * Keep a modifier activated between commands
    *
    * @default true
    */
  var release: scala.Boolean
}

object TypeOptions {
  @scala.inline
  def apply(
    delay: scala.Double,
    force: scala.Boolean,
    log: scala.Boolean,
    release: scala.Boolean,
    timeout: scala.Double
  ): TypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delay")(delay)
    __obj.updateDynamic("force")(force)
    __obj.updateDynamic("log")(log)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[TypeOptions]
  }
}

