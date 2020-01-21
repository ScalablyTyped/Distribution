package typings.bizcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bizcharts.bizchartsStrings.rect
  - typings.bizcharts.bizchartsStrings.x
  - typings.bizcharts.bizchartsStrings.y
  - typings.bizcharts.bizchartsStrings.cross
*/
trait CrosshairsType extends js.Object

object CrosshairsType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cross: typings.bizcharts.bizchartsStrings.cross = this.cast("cross")
  @scala.inline
  def rect: typings.bizcharts.bizchartsStrings.rect = this.cast("rect")
  @scala.inline
  def x: typings.bizcharts.bizchartsStrings.x = this.cast("x")
  @scala.inline
  def y: typings.bizcharts.bizchartsStrings.y = this.cast("y")
}

