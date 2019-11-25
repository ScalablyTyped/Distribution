package typings.bootstrap.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bootstrap.bootstrapStrings.showDOTbsDOTtoast
  - typings.bootstrap.bootstrapStrings.shownDOTbsDOTtoast
  - typings.bootstrap.bootstrapStrings.hideDOTbsDOTtoast
  - typings.bootstrap.bootstrapStrings.hiddenDOTbsDOTtoast
*/
trait ToastEvent extends js.Object

object ToastEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hiddenDOTbsDOTtoast: typings.bootstrap.bootstrapStrings.hiddenDOTbsDOTtoast = this.cast("hidden.bs.toast")
  @scala.inline
  def hideDOTbsDOTtoast: typings.bootstrap.bootstrapStrings.hideDOTbsDOTtoast = this.cast("hide.bs.toast")
  @scala.inline
  def showDOTbsDOTtoast: typings.bootstrap.bootstrapStrings.showDOTbsDOTtoast = this.cast("show.bs.toast")
  @scala.inline
  def shownDOTbsDOTtoast: typings.bootstrap.bootstrapStrings.shownDOTbsDOTtoast = this.cast("shown.bs.toast")
}

