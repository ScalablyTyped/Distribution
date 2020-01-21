package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chartJs.chartJsStrings.category
  - typings.chartJs.chartJsStrings.linear
  - typings.chartJs.chartJsStrings.logarithmic
  - typings.chartJs.chartJsStrings.time
  - typings.chartJs.chartJsStrings.radialLinear
*/
trait ScaleType extends js.Object

object ScaleType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def category: typings.chartJs.chartJsStrings.category = this.cast("category")
  @scala.inline
  def linear: typings.chartJs.chartJsStrings.linear = this.cast("linear")
  @scala.inline
  def logarithmic: typings.chartJs.chartJsStrings.logarithmic = this.cast("logarithmic")
  @scala.inline
  def radialLinear: typings.chartJs.chartJsStrings.radialLinear = this.cast("radialLinear")
  @scala.inline
  def time: typings.chartJs.chartJsStrings.time = this.cast("time")
}

