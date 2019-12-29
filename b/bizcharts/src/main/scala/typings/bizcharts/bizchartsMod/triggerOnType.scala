package typings.bizcharts.bizchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bizcharts.bizchartsStrings.mousemove
  - typings.bizcharts.bizchartsStrings.click
  - typings.bizcharts.bizchartsStrings.none
*/
trait triggerOnType extends js.Object

object triggerOnType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def click: typings.bizcharts.bizchartsStrings.click = this.cast("click")
  @scala.inline
  def mousemove: typings.bizcharts.bizchartsStrings.mousemove = this.cast("mousemove")
  @scala.inline
  def none: typings.bizcharts.bizchartsStrings.none = this.cast("none")
}

