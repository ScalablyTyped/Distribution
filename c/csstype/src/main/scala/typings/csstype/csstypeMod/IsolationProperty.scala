package typings.csstype.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.auto
  - typings.csstype.csstypeStrings.isolate
  - typings.csstype.csstypeStrings.`-moz-initial`
  - typings.csstype.csstypeStrings.inherit
  - typings.csstype.csstypeStrings.initial
  - typings.csstype.csstypeStrings.revert
  - typings.csstype.csstypeStrings.unset
*/
trait IsolationProperty extends js.Object

object IsolationProperty {
  @scala.inline
  def `-moz-initial`: typings.csstype.csstypeStrings.`-moz-initial` = this.cast("-moz-initial")
  @scala.inline
  def auto: typings.csstype.csstypeStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inherit: typings.csstype.csstypeStrings.inherit = this.cast("inherit")
  @scala.inline
  def initial: typings.csstype.csstypeStrings.initial = this.cast("initial")
  @scala.inline
  def isolate: typings.csstype.csstypeStrings.isolate = this.cast("isolate")
  @scala.inline
  def revert: typings.csstype.csstypeStrings.revert = this.cast("revert")
  @scala.inline
  def unset: typings.csstype.csstypeStrings.unset = this.cast("unset")
}

