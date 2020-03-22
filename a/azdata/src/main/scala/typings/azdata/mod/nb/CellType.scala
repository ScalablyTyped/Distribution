package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.azdata.azdataStrings.code
  - typings.azdata.azdataStrings.markdown
  - typings.azdata.azdataStrings.raw
*/
trait CellType extends js.Object

object CellType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: typings.azdata.azdataStrings.code = this.cast("code")
  @scala.inline
  def markdown: typings.azdata.azdataStrings.markdown = this.cast("markdown")
  @scala.inline
  def raw: typings.azdata.azdataStrings.raw = this.cast("raw")
}

