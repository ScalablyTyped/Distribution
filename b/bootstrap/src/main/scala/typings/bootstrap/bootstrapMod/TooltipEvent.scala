package typings.bootstrap.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bootstrap.bootstrapStrings.showDotbsDottooltip
  - typings.bootstrap.bootstrapStrings.shownDotbsDottooltip
  - typings.bootstrap.bootstrapStrings.hideDotbsDottooltip
  - typings.bootstrap.bootstrapStrings.hiddenDotbsDottooltip
  - typings.bootstrap.bootstrapStrings.insertedDotbsDottooltip
*/
trait TooltipEvent extends js.Object

object TooltipEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hiddenDotbsDottooltip: typings.bootstrap.bootstrapStrings.hiddenDotbsDottooltip = this.cast("hidden.bs.tooltip")
  @scala.inline
  def hideDotbsDottooltip: typings.bootstrap.bootstrapStrings.hideDotbsDottooltip = this.cast("hide.bs.tooltip")
  @scala.inline
  def insertedDotbsDottooltip: typings.bootstrap.bootstrapStrings.insertedDotbsDottooltip = this.cast("inserted.bs.tooltip")
  @scala.inline
  def showDotbsDottooltip: typings.bootstrap.bootstrapStrings.showDotbsDottooltip = this.cast("show.bs.tooltip")
  @scala.inline
  def shownDotbsDottooltip: typings.bootstrap.bootstrapStrings.shownDotbsDottooltip = this.cast("shown.bs.tooltip")
}

