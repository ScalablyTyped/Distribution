package typings.baseui.blockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.baseui.baseuiStrings.row
  - typings.baseui.baseuiStrings.`row-reverse`
  - typings.baseui.baseuiStrings.column
  - typings.baseui.baseuiStrings.`column-reverse`
  - typings.baseui.baseuiStrings.inherit
  - typings.baseui.baseuiStrings.initial
  - typings.baseui.baseuiStrings.unset
*/
trait FlexDirection extends js.Object

object FlexDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def column: typings.baseui.baseuiStrings.column = this.cast("column")
  @scala.inline
  def `column-reverse`: typings.baseui.baseuiStrings.`column-reverse` = this.cast("column-reverse")
  @scala.inline
  def inherit: typings.baseui.baseuiStrings.inherit = this.cast("inherit")
  @scala.inline
  def initial: typings.baseui.baseuiStrings.initial = this.cast("initial")
  @scala.inline
  def row: typings.baseui.baseuiStrings.row = this.cast("row")
  @scala.inline
  def `row-reverse`: typings.baseui.baseuiStrings.`row-reverse` = this.cast("row-reverse")
  @scala.inline
  def unset: typings.baseui.baseuiStrings.unset = this.cast("unset")
}

