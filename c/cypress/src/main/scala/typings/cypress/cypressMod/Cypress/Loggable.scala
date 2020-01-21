package typings.cypress.cypressMod.Cypress

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
  var log: Boolean
}

object Loggable {
  @scala.inline
  def apply(log: Boolean): Loggable = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Loggable]
  }
}

