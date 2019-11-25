package typings.cypress.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cypress.cypressStrings.optional
  - typings.cypress.cypressStrings.element
  - typings.cypress.cypressStrings.document
  - typings.cypress.cypressStrings.window
*/
trait PrevSubject extends js.Object

object PrevSubject {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def document: typings.cypress.cypressStrings.document = this.cast("document")
  @scala.inline
  def element: typings.cypress.cypressStrings.element = this.cast("element")
  @scala.inline
  def optional: typings.cypress.cypressStrings.optional = this.cast("optional")
  @scala.inline
  def window: typings.cypress.cypressStrings.window = this.cast("window")
}

