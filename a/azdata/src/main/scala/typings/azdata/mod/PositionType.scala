package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.azdata.azdataStrings.static
  - typings.azdata.azdataStrings.absolute
  - typings.azdata.azdataStrings.fixed
  - typings.azdata.azdataStrings.relative
  - typings.azdata.azdataStrings.sticky
  - typings.azdata.azdataStrings.initial
  - typings.azdata.azdataStrings.inherit
*/
trait PositionType extends js.Object

object PositionType {
  @scala.inline
  def absolute: typings.azdata.azdataStrings.absolute = this.cast("absolute")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fixed: typings.azdata.azdataStrings.fixed = this.cast("fixed")
  @scala.inline
  def inherit: typings.azdata.azdataStrings.inherit = this.cast("inherit")
  @scala.inline
  def initial: typings.azdata.azdataStrings.initial = this.cast("initial")
  @scala.inline
  def relative: typings.azdata.azdataStrings.relative = this.cast("relative")
  @scala.inline
  def static: typings.azdata.azdataStrings.static = this.cast("static")
  @scala.inline
  def sticky: typings.azdata.azdataStrings.sticky = this.cast("sticky")
}

