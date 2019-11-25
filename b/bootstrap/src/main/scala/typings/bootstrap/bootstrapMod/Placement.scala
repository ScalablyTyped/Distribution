package typings.bootstrap.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bootstrap.bootstrapStrings.auto
  - typings.bootstrap.bootstrapStrings.top
  - typings.bootstrap.bootstrapStrings.bottom
  - typings.bootstrap.bootstrapStrings.left
  - typings.bootstrap.bootstrapStrings.right
*/
trait Placement extends js.Object

object Placement {
  @scala.inline
  def auto: typings.bootstrap.bootstrapStrings.auto = this.cast("auto")
  @scala.inline
  def bottom: typings.bootstrap.bootstrapStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typings.bootstrap.bootstrapStrings.left = this.cast("left")
  @scala.inline
  def right: typings.bootstrap.bootstrapStrings.right = this.cast("right")
  @scala.inline
  def top: typings.bootstrap.bootstrapStrings.top = this.cast("top")
}

