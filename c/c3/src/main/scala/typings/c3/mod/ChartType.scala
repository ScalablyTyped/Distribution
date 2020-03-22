package typings.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.c3.c3Strings.line
  - typings.c3.c3Strings.spline
  - typings.c3.c3Strings.step
  - typings.c3.c3Strings.area
  - typings.c3.c3Strings.`area-spline`
  - typings.c3.c3Strings.`area-step`
  - typings.c3.c3Strings.bar
  - typings.c3.c3Strings.scatter
  - typings.c3.c3Strings.stanford
  - typings.c3.c3Strings.pie
  - typings.c3.c3Strings.donut
  - typings.c3.c3Strings.gauge
*/
trait ChartType extends js.Object

object ChartType {
  @scala.inline
  def area: typings.c3.c3Strings.area = this.cast("area")
  @scala.inline
  def `area-spline`: typings.c3.c3Strings.`area-spline` = this.cast("area-spline")
  @scala.inline
  def `area-step`: typings.c3.c3Strings.`area-step` = this.cast("area-step")
  @scala.inline
  def bar: typings.c3.c3Strings.bar = this.cast("bar")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def donut: typings.c3.c3Strings.donut = this.cast("donut")
  @scala.inline
  def gauge: typings.c3.c3Strings.gauge = this.cast("gauge")
  @scala.inline
  def line: typings.c3.c3Strings.line = this.cast("line")
  @scala.inline
  def pie: typings.c3.c3Strings.pie = this.cast("pie")
  @scala.inline
  def scatter: typings.c3.c3Strings.scatter = this.cast("scatter")
  @scala.inline
  def spline: typings.c3.c3Strings.spline = this.cast("spline")
  @scala.inline
  def stanford: typings.c3.c3Strings.stanford = this.cast("stanford")
  @scala.inline
  def step: typings.c3.c3Strings.step = this.cast("step")
}

