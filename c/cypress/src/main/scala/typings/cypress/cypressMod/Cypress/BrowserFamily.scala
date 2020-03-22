package typings.cypress.cypressMod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cypress.cypressStrings.chromium
  - typings.cypress.cypressStrings.firefox
*/
trait BrowserFamily extends js.Object

object BrowserFamily {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chromium: typings.cypress.cypressStrings.chromium = this.cast("chromium")
  @scala.inline
  def firefox: typings.cypress.cypressStrings.firefox = this.cast("firefox")
}

