package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.azdata.azdataStrings.left
  - typings.azdata.azdataStrings.right
  - typings.azdata.azdataStrings.center
  - typings.azdata.azdataStrings.justify
  - typings.azdata.azdataStrings.initial
  - typings.azdata.azdataStrings.inherit
*/
trait TextAlignType extends js.Object

object TextAlignType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.azdata.azdataStrings.center = this.cast("center")
  @scala.inline
  def inherit: typings.azdata.azdataStrings.inherit = this.cast("inherit")
  @scala.inline
  def initial: typings.azdata.azdataStrings.initial = this.cast("initial")
  @scala.inline
  def justify: typings.azdata.azdataStrings.justify = this.cast("justify")
  @scala.inline
  def left: typings.azdata.azdataStrings.left = this.cast("left")
  @scala.inline
  def right: typings.azdata.azdataStrings.right = this.cast("right")
}

