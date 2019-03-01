package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that control how a command is logged in the Reporter
  */
trait Loggable extends js.Object {
  /**
    * Displays the command in the Command Log
    *
    * @default true
    */
  var log: scala.Boolean
}

object Loggable {
  @scala.inline
  def apply(log: scala.Boolean): Loggable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("log")(log)
    __obj.asInstanceOf[Loggable]
  }
}

