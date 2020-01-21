package typings.bootstrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bootstrap.bootstrapStrings.showDotbsDotmodal
  - typings.bootstrap.bootstrapStrings.shownDotbsDotmodal
  - typings.bootstrap.bootstrapStrings.hideDotbsDotmodal
  - typings.bootstrap.bootstrapStrings.hiddenDotbsDotmodal
*/
trait ModalEvent extends js.Object

object ModalEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hiddenDotbsDotmodal: typings.bootstrap.bootstrapStrings.hiddenDotbsDotmodal = this.cast("hidden.bs.modal")
  @scala.inline
  def hideDotbsDotmodal: typings.bootstrap.bootstrapStrings.hideDotbsDotmodal = this.cast("hide.bs.modal")
  @scala.inline
  def showDotbsDotmodal: typings.bootstrap.bootstrapStrings.showDotbsDotmodal = this.cast("show.bs.modal")
  @scala.inline
  def shownDotbsDotmodal: typings.bootstrap.bootstrapStrings.shownDotbsDotmodal = this.cast("shown.bs.modal")
}

