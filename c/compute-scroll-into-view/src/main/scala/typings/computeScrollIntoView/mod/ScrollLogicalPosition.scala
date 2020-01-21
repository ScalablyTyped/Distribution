package typings.computeScrollIntoView.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.computeScrollIntoView.computeScrollIntoViewStrings.start
  - typings.computeScrollIntoView.computeScrollIntoViewStrings.center
  - typings.computeScrollIntoView.computeScrollIntoViewStrings.end
  - typings.computeScrollIntoView.computeScrollIntoViewStrings.nearest
*/
trait ScrollLogicalPosition extends js.Object

object ScrollLogicalPosition {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.computeScrollIntoView.computeScrollIntoViewStrings.center = this.cast("center")
  @scala.inline
  def end: typings.computeScrollIntoView.computeScrollIntoViewStrings.end = this.cast("end")
  @scala.inline
  def nearest: typings.computeScrollIntoView.computeScrollIntoViewStrings.nearest = this.cast("nearest")
  @scala.inline
  def start: typings.computeScrollIntoView.computeScrollIntoViewStrings.start = this.cast("start")
}

