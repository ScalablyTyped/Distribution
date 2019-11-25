package typings.csstype.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.center
  - typings.csstype.csstypeStrings.end
  - typings.csstype.csstypeStrings.`flex-end`
  - typings.csstype.csstypeStrings.`flex-start`
  - typings.csstype.csstypeStrings.start
*/
trait ContentPosition
  extends _AlignContentProperty
     with _JustifyContentProperty
     with _PlaceContentProperty

object ContentPosition {
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
  def start: typings.csstype.csstypeStrings.start = this.cast("start")
}

