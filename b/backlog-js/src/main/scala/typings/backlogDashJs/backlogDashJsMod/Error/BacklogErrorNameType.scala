package typings.backlogDashJs.backlogDashJsMod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.backlogDashJs.backlogDashJsStrings.BacklogApiError
  - typings.backlogDashJs.backlogDashJsStrings.BacklogAuthError
  - typings.backlogDashJs.backlogDashJsStrings.UnexpectedError
*/
trait BacklogErrorNameType extends js.Object

object BacklogErrorNameType {
  @scala.inline
  def BacklogApiError: typings.backlogDashJs.backlogDashJsStrings.BacklogApiError = this.cast("BacklogApiError")
  @scala.inline
  def BacklogAuthError: typings.backlogDashJs.backlogDashJsStrings.BacklogAuthError = this.cast("BacklogAuthError")
  @scala.inline
  def UnexpectedError: typings.backlogDashJs.backlogDashJsStrings.UnexpectedError = this.cast("UnexpectedError")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

