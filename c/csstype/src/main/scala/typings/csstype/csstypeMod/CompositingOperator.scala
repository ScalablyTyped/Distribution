package typings.csstype.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.add
  - typings.csstype.csstypeStrings.exclude
  - typings.csstype.csstypeStrings.intersect
  - typings.csstype.csstypeStrings.subtract
*/
trait CompositingOperator
  extends _MaskLayer[js.Any]
     with _MaskCompositeProperty

object CompositingOperator {
  @scala.inline
  def add: typings.csstype.csstypeStrings.add = this.cast("add")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exclude: typings.csstype.csstypeStrings.exclude = this.cast("exclude")
  @scala.inline
  def intersect: typings.csstype.csstypeStrings.intersect = this.cast("intersect")
  @scala.inline
  def subtract: typings.csstype.csstypeStrings.subtract = this.cast("subtract")
}

