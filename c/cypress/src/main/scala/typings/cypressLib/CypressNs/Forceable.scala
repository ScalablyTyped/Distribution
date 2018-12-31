package typings
package cypressLib.CypressNs

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
  var force: scala.Boolean
}

