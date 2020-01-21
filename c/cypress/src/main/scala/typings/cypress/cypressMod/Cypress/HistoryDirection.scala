package typings.cypress.cypressMod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cypress.cypressStrings.back
  - typings.cypress.cypressStrings.forward
*/
trait HistoryDirection extends js.Object

object HistoryDirection {
  @scala.inline
  def back: typings.cypress.cypressStrings.back = this.cast("back")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def forward: typings.cypress.cypressStrings.forward = this.cast("forward")
}

