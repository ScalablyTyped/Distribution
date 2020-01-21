package typings.cypress.JQuery_.Ajax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cypress.cypressStrings.success
  - typings.cypress.cypressStrings.notmodified
  - typings.cypress.cypressStrings.nocontent
*/
trait SuccessTextStatus extends js.Object

object SuccessTextStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def nocontent: typings.cypress.cypressStrings.nocontent = this.cast("nocontent")
  @scala.inline
  def notmodified: typings.cypress.cypressStrings.notmodified = this.cast("notmodified")
  @scala.inline
  def success: typings.cypress.cypressStrings.success = this.cast("success")
}

