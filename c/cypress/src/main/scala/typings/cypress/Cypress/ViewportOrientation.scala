package typings.cypress.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cypress.cypressStrings.portrait
  - typings.cypress.cypressStrings.landscape
*/
trait ViewportOrientation extends js.Object

object ViewportOrientation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def landscape: typings.cypress.cypressStrings.landscape = this.cast("landscape")
  @scala.inline
  def portrait: typings.cypress.cypressStrings.portrait = this.cast("portrait")
}

