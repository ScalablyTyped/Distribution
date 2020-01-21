package typings.bootstrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bootstrap.bootstrapStrings.showDotbsDotcollapse
  - typings.bootstrap.bootstrapStrings.shownDotbsDotcollapse
  - typings.bootstrap.bootstrapStrings.hideDotbsDotcollapse
  - typings.bootstrap.bootstrapStrings.hiddenDotbsDotcollapse
*/
trait CollapseEvent extends js.Object

object CollapseEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hiddenDotbsDotcollapse: typings.bootstrap.bootstrapStrings.hiddenDotbsDotcollapse = this.cast("hidden.bs.collapse")
  @scala.inline
  def hideDotbsDotcollapse: typings.bootstrap.bootstrapStrings.hideDotbsDotcollapse = this.cast("hide.bs.collapse")
  @scala.inline
  def showDotbsDotcollapse: typings.bootstrap.bootstrapStrings.showDotbsDotcollapse = this.cast("show.bs.collapse")
  @scala.inline
  def shownDotbsDotcollapse: typings.bootstrap.bootstrapStrings.shownDotbsDotcollapse = this.cast("shown.bs.collapse")
}

