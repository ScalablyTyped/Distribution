package typings.codemirror.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.codemirror.codemirrorStrings.textarea
  - typings.codemirror.codemirrorStrings.contenteditable
*/
trait InputStyle extends js.Object

object InputStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def contenteditable: typings.codemirror.codemirrorStrings.contenteditable = this.cast("contenteditable")
  @scala.inline
  def textarea: typings.codemirror.codemirrorStrings.textarea = this.cast("textarea")
}

