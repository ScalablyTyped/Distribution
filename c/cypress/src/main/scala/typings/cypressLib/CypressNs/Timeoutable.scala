package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that control how long Test Runner is waiting for command to succeed
  */
trait Timeoutable extends js.Object {
  /**
    * Time to wait (ms)
    *
    * @default defaultCommandTimeout
    * @see https://docs.cypress.io/guides/references/configuration.html#Timeouts
    */
  var timeout: scala.Double
}

object Timeoutable {
  @scala.inline
  def apply(timeout: scala.Double): Timeoutable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[Timeoutable]
  }
}

