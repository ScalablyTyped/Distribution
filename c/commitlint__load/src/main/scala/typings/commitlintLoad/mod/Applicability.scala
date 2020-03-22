package typings.commitlintLoad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.commitlintLoad.commitlintLoadStrings.always
  - typings.commitlintLoad.commitlintLoadStrings.never
*/
trait Applicability extends js.Object

object Applicability {
  @scala.inline
  def always: typings.commitlintLoad.commitlintLoadStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def never: typings.commitlintLoad.commitlintLoadStrings.never = this.cast("never")
}

