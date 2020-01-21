package typings.backlogJs.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.backlogJs.backlogJsStrings.BacklogApiError
  - typings.backlogJs.backlogJsStrings.BacklogAuthError
  - typings.backlogJs.backlogJsStrings.UnexpectedError
*/
trait BacklogErrorNameType extends js.Object

object BacklogErrorNameType {
  @scala.inline
  def BacklogApiError: typings.backlogJs.backlogJsStrings.BacklogApiError = this.cast("BacklogApiError")
  @scala.inline
  def BacklogAuthError: typings.backlogJs.backlogJsStrings.BacklogAuthError = this.cast("BacklogAuthError")
  @scala.inline
  def UnexpectedError: typings.backlogJs.backlogJsStrings.UnexpectedError = this.cast("UnexpectedError")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

