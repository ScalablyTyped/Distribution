package typings.computeScrollIntoView.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.computeScrollIntoView.computeScrollIntoViewStrings.always
  - typings.computeScrollIntoView.computeScrollIntoViewStrings.`if-needed`
*/
trait ScrollMode extends js.Object

object ScrollMode {
  @scala.inline
  def always: typings.computeScrollIntoView.computeScrollIntoViewStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `if-needed`: typings.computeScrollIntoView.computeScrollIntoViewStrings.`if-needed` = this.cast("if-needed")
}

