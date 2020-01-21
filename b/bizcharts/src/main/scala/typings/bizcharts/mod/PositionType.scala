package typings.bizcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bizcharts.bizchartsStrings.top
  - typings.bizcharts.bizchartsStrings.bottom
  - typings.bizcharts.bizchartsStrings.left
  - typings.bizcharts.bizchartsStrings.right
*/
trait PositionType extends js.Object

object PositionType {
  @scala.inline
  def bottom: typings.bizcharts.bizchartsStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typings.bizcharts.bizchartsStrings.left = this.cast("left")
  @scala.inline
  def right: typings.bizcharts.bizchartsStrings.right = this.cast("right")
  @scala.inline
  def top: typings.bizcharts.bizchartsStrings.top = this.cast("top")
}

