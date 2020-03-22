package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.azdata.azdataStrings.shell
  - typings.azdata.azdataStrings.iopub
  - typings.azdata.azdataStrings.stdin
  - typings.azdata.azdataStrings.execute_reply
*/
trait Channel extends js.Object

object Channel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def execute_reply: typings.azdata.azdataStrings.execute_reply = this.cast("execute_reply")
  @scala.inline
  def iopub: typings.azdata.azdataStrings.iopub = this.cast("iopub")
  @scala.inline
  def shell: typings.azdata.azdataStrings.shell = this.cast("shell")
  @scala.inline
  def stdin: typings.azdata.azdataStrings.stdin = this.cast("stdin")
}

