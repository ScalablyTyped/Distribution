package typings.bizcharts.bizchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bizcharts.bizchartsStrings.stack
  - typings.bizcharts.bizchartsStrings.dodge
  - typings.bizcharts.bizchartsStrings.jitter
  - typings.bizcharts.bizchartsStrings.symmetric
*/
trait GeomAdjustType extends js.Object

object GeomAdjustType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dodge: typings.bizcharts.bizchartsStrings.dodge = this.cast("dodge")
  @scala.inline
  def jitter: typings.bizcharts.bizchartsStrings.jitter = this.cast("jitter")
  @scala.inline
  def stack: typings.bizcharts.bizchartsStrings.stack = this.cast("stack")
  @scala.inline
  def symmetric: typings.bizcharts.bizchartsStrings.symmetric = this.cast("symmetric")
}

