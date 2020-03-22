package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.azdata.azdataStrings.execute_result
  - typings.azdata.azdataStrings.display_data
  - typings.azdata.azdataStrings.stream
  - typings.azdata.azdataStrings.error
  - typings.azdata.azdataStrings.update_display_data
*/
trait OutputTypeName extends js.Object

object OutputTypeName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def display_data: typings.azdata.azdataStrings.display_data = this.cast("display_data")
  @scala.inline
  def error: typings.azdata.azdataStrings.error = this.cast("error")
  @scala.inline
  def execute_result: typings.azdata.azdataStrings.execute_result = this.cast("execute_result")
  @scala.inline
  def stream: typings.azdata.azdataStrings.stream = this.cast("stream")
  @scala.inline
  def update_display_data: typings.azdata.azdataStrings.update_display_data = this.cast("update_display_data")
}

