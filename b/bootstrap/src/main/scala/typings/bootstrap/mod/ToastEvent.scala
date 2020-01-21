package typings.bootstrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bootstrap.bootstrapStrings.showDotbsDottoast
  - typings.bootstrap.bootstrapStrings.shownDotbsDottoast
  - typings.bootstrap.bootstrapStrings.hideDotbsDottoast
  - typings.bootstrap.bootstrapStrings.hiddenDotbsDottoast
*/
trait ToastEvent extends js.Object

object ToastEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hiddenDotbsDottoast: typings.bootstrap.bootstrapStrings.hiddenDotbsDottoast = this.cast("hidden.bs.toast")
  @scala.inline
  def hideDotbsDottoast: typings.bootstrap.bootstrapStrings.hideDotbsDottoast = this.cast("hide.bs.toast")
  @scala.inline
  def showDotbsDottoast: typings.bootstrap.bootstrapStrings.showDotbsDottoast = this.cast("show.bs.toast")
  @scala.inline
  def shownDotbsDottoast: typings.bootstrap.bootstrapStrings.shownDotbsDottoast = this.cast("shown.bs.toast")
}

