package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.ltr
  - typings.csstype.csstypeStrings.rtl
  - typings.csstype.csstypeStrings.`-moz-initial`
  - typings.csstype.csstypeStrings.inherit
  - typings.csstype.csstypeStrings.initial
  - typings.csstype.csstypeStrings.revert
  - typings.csstype.csstypeStrings.unset
*/
trait DirectionProperty extends js.Object

object DirectionProperty {
  @scala.inline
  def `-moz-initial`: typings.csstype.csstypeStrings.`-moz-initial` = this.cast("-moz-initial")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inherit: typings.csstype.csstypeStrings.inherit = this.cast("inherit")
  @scala.inline
  def initial: typings.csstype.csstypeStrings.initial = this.cast("initial")
  @scala.inline
  def ltr: typings.csstype.csstypeStrings.ltr = this.cast("ltr")
  @scala.inline
  def revert: typings.csstype.csstypeStrings.revert = this.cast("revert")
  @scala.inline
  def rtl: typings.csstype.csstypeStrings.rtl = this.cast("rtl")
  @scala.inline
  def unset: typings.csstype.csstypeStrings.unset = this.cast("unset")
}

