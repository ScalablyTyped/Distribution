package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chartJs.chartJsStrings.left
  - typings.chartJs.chartJsStrings.center
  - typings.chartJs.chartJsStrings.right
*/
trait TextAlignment extends js.Object

object TextAlignment {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.chartJs.chartJsStrings.center = this.cast("center")
  @scala.inline
  def left: typings.chartJs.chartJsStrings.left = this.cast("left")
  @scala.inline
  def right: typings.chartJs.chartJsStrings.right = this.cast("right")
}

