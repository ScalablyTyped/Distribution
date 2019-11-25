package typings.bootstrap.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bootstrap.bootstrapStrings.showDOTbsDOTtooltip
  - typings.bootstrap.bootstrapStrings.shownDOTbsDOTtooltip
  - typings.bootstrap.bootstrapStrings.hideDOTbsDOTtooltip
  - typings.bootstrap.bootstrapStrings.hiddenDOTbsDOTtooltip
  - typings.bootstrap.bootstrapStrings.insertedDOTbsDOTtooltip
*/
trait TooltipEvent extends js.Object

object TooltipEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hiddenDOTbsDOTtooltip: typings.bootstrap.bootstrapStrings.hiddenDOTbsDOTtooltip = this.cast("hidden.bs.tooltip")
  @scala.inline
  def hideDOTbsDOTtooltip: typings.bootstrap.bootstrapStrings.hideDOTbsDOTtooltip = this.cast("hide.bs.tooltip")
  @scala.inline
  def insertedDOTbsDOTtooltip: typings.bootstrap.bootstrapStrings.insertedDOTbsDOTtooltip = this.cast("inserted.bs.tooltip")
  @scala.inline
  def showDOTbsDOTtooltip: typings.bootstrap.bootstrapStrings.showDOTbsDOTtooltip = this.cast("show.bs.tooltip")
  @scala.inline
  def shownDOTbsDOTtooltip: typings.bootstrap.bootstrapStrings.shownDOTbsDOTtooltip = this.cast("shown.bs.tooltip")
}

