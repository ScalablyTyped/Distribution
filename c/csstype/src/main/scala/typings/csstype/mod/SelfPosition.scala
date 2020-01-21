package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.center
  - typings.csstype.csstypeStrings.end
  - typings.csstype.csstypeStrings.`flex-end`
  - typings.csstype.csstypeStrings.`flex-start`
  - typings.csstype.csstypeStrings.`self-end`
  - typings.csstype.csstypeStrings.`self-start`
  - typings.csstype.csstypeStrings.start
*/
trait SelfPosition
  extends _AlignItemsProperty
     with _AlignSelfProperty
     with _JustifyItemsProperty
     with _JustifySelfProperty
     with _PlaceItemsProperty
     with _PlaceSelfProperty

object SelfPosition {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.csstype.csstypeStrings.center = this.cast("center")
  @scala.inline
  def end: typings.csstype.csstypeStrings.end = this.cast("end")
  @scala.inline
  def `flex-end`: typings.csstype.csstypeStrings.`flex-end` = this.cast("flex-end")
  @scala.inline
  def `flex-start`: typings.csstype.csstypeStrings.`flex-start` = this.cast("flex-start")
  @scala.inline
  def `self-end`: typings.csstype.csstypeStrings.`self-end` = this.cast("self-end")
  @scala.inline
  def `self-start`: typings.csstype.csstypeStrings.`self-start` = this.cast("self-start")
  @scala.inline
  def start: typings.csstype.csstypeStrings.start = this.cast("start")
}

