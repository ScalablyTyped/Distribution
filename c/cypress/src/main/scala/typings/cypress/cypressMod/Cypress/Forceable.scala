package typings.cypress.cypressMod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to force an event, skipping Actionability check
  * @see https://docs.cypress.io/guides/core-concepts/interacting-with-elements.html#Actionability
  */
trait Forceable extends js.Object {
  /**
    * Forces the action, disables waiting for actionability
    *
    * @default false
    */
  var force: Boolean
}

object Forceable {
  @scala.inline
  def apply(force: Boolean): Forceable = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Forceable]
  }
}

