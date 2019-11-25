package typings.csstype.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.dashed
  - typings.csstype.csstypeStrings.dotted
  - typings.csstype.csstypeStrings.double
  - typings.csstype.csstypeStrings.groove
  - typings.csstype.csstypeStrings.hidden
  - typings.csstype.csstypeStrings.inset
  - typings.csstype.csstypeStrings.none
  - typings.csstype.csstypeStrings.outset
  - typings.csstype.csstypeStrings.ridge
  - typings.csstype.csstypeStrings.solid
*/
trait LineStyle
  extends _BorderBlockEndProperty[js.Any]
     with _BorderBlockProperty[js.Any]
     with _BorderBlockStartProperty[js.Any]
     with _BorderBottomProperty[js.Any]
     with _BorderInlineEndProperty[js.Any]
     with _BorderInlineProperty[js.Any]
     with _BorderInlineStartProperty[js.Any]
     with _BorderLeftProperty[js.Any]
     with _BorderProperty[js.Any]
     with _BorderRightProperty[js.Any]
     with _BorderStyleProperty
     with _BorderTopProperty[js.Any]
     with _ColumnRuleProperty[js.Any]
     with _ColumnRuleStyleProperty
     with _OutlineProperty[js.Any]
     with _OutlineStyleProperty
     with _WebkitBorderBeforeProperty[js.Any]
     with _WebkitBorderBeforeStyleProperty

object LineStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dashed: typings.csstype.csstypeStrings.dashed = this.cast("dashed")
  @scala.inline
  def dotted: typings.csstype.csstypeStrings.dotted = this.cast("dotted")
  @scala.inline
  def double: typings.csstype.csstypeStrings.double = this.cast("double")
  @scala.inline
  def groove: typings.csstype.csstypeStrings.groove = this.cast("groove")
  @scala.inline
  def hidden: typings.csstype.csstypeStrings.hidden = this.cast("hidden")
  @scala.inline
  def inset: typings.csstype.csstypeStrings.inset = this.cast("inset")
  @scala.inline
  def none: typings.csstype.csstypeStrings.none = this.cast("none")
  @scala.inline
  def outset: typings.csstype.csstypeStrings.outset = this.cast("outset")
  @scala.inline
  def ridge: typings.csstype.csstypeStrings.ridge = this.cast("ridge")
  @scala.inline
  def solid: typings.csstype.csstypeStrings.solid = this.cast("solid")
}

