package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chartJs.chartJsStrings.point
  - typings.chartJs.chartJsStrings.nearest
  - typings.chartJs.chartJsStrings.single
  - typings.chartJs.chartJsStrings.label
  - typings.chartJs.chartJsStrings.index
  - typings.chartJs.chartJsStrings.`x-axis`
  - typings.chartJs.chartJsStrings.dataset
  - typings.chartJs.chartJsStrings.x
  - typings.chartJs.chartJsStrings.y
*/
trait InteractionMode extends js.Object

object InteractionMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dataset: typings.chartJs.chartJsStrings.dataset = this.cast("dataset")
  @scala.inline
  def index: typings.chartJs.chartJsStrings.index = this.cast("index")
  @scala.inline
  def label: typings.chartJs.chartJsStrings.label = this.cast("label")
  @scala.inline
  def nearest: typings.chartJs.chartJsStrings.nearest = this.cast("nearest")
  @scala.inline
  def point: typings.chartJs.chartJsStrings.point = this.cast("point")
  @scala.inline
  def single: typings.chartJs.chartJsStrings.single = this.cast("single")
  @scala.inline
  def x: typings.chartJs.chartJsStrings.x = this.cast("x")
  @scala.inline
  def `x-axis`: typings.chartJs.chartJsStrings.`x-axis` = this.cast("x-axis")
  @scala.inline
  def y: typings.chartJs.chartJsStrings.y = this.cast("y")
}

