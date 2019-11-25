package typings.csstype.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.large
  - typings.csstype.csstypeStrings.medium
  - typings.csstype.csstypeStrings.small
  - typings.csstype.csstypeStrings.`x-large`
  - typings.csstype.csstypeStrings.`x-small`
  - typings.csstype.csstypeStrings.`xx-large`
  - typings.csstype.csstypeStrings.`xx-small`
*/
trait AbsoluteSize
  extends _FontSizeProperty[js.Any]

object AbsoluteSize {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def large: typings.csstype.csstypeStrings.large = this.cast("large")
  @scala.inline
  def medium: typings.csstype.csstypeStrings.medium = this.cast("medium")
  @scala.inline
  def small: typings.csstype.csstypeStrings.small = this.cast("small")
  @scala.inline
  def `x-large`: typings.csstype.csstypeStrings.`x-large` = this.cast("x-large")
  @scala.inline
  def `x-small`: typings.csstype.csstypeStrings.`x-small` = this.cast("x-small")
  @scala.inline
  def `xx-large`: typings.csstype.csstypeStrings.`xx-large` = this.cast("xx-large")
  @scala.inline
  def `xx-small`: typings.csstype.csstypeStrings.`xx-small` = this.cast("xx-small")
}

