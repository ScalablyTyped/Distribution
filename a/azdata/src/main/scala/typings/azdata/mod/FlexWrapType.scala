package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.azdata.azdataStrings.nowrap
  - typings.azdata.azdataStrings.wrap
  - typings.azdata.azdataStrings.`wrap-reverse`
*/
trait FlexWrapType extends js.Object

object FlexWrapType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def nowrap: typings.azdata.azdataStrings.nowrap = this.cast("nowrap")
  @scala.inline
  def wrap: typings.azdata.azdataStrings.wrap = this.cast("wrap")
  @scala.inline
  def `wrap-reverse`: typings.azdata.azdataStrings.`wrap-reverse` = this.cast("wrap-reverse")
}

