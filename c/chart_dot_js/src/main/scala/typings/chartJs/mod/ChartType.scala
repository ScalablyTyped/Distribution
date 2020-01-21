package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chartJs.chartJsStrings.line
  - typings.chartJs.chartJsStrings.bar
  - typings.chartJs.chartJsStrings.horizontalBar
  - typings.chartJs.chartJsStrings.radar
  - typings.chartJs.chartJsStrings.doughnut
  - typings.chartJs.chartJsStrings.polarArea
  - typings.chartJs.chartJsStrings.bubble
  - typings.chartJs.chartJsStrings.pie
  - typings.chartJs.chartJsStrings.scatter
*/
trait ChartType extends js.Object

object ChartType {
  @scala.inline
  def bar: typings.chartJs.chartJsStrings.bar = this.cast("bar")
  @scala.inline
  def bubble: typings.chartJs.chartJsStrings.bubble = this.cast("bubble")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def doughnut: typings.chartJs.chartJsStrings.doughnut = this.cast("doughnut")
  @scala.inline
  def horizontalBar: typings.chartJs.chartJsStrings.horizontalBar = this.cast("horizontalBar")
  @scala.inline
  def line: typings.chartJs.chartJsStrings.line = this.cast("line")
  @scala.inline
  def pie: typings.chartJs.chartJsStrings.pie = this.cast("pie")
  @scala.inline
  def polarArea: typings.chartJs.chartJsStrings.polarArea = this.cast("polarArea")
  @scala.inline
  def radar: typings.chartJs.chartJsStrings.radar = this.cast("radar")
  @scala.inline
  def scatter: typings.chartJs.chartJsStrings.scatter = this.cast("scatter")
}

