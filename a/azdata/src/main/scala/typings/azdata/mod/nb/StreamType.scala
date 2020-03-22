package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.azdata.azdataStrings.stdout
  - typings.azdata.azdataStrings.stderr
*/
trait StreamType extends js.Object

object StreamType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def stderr: typings.azdata.azdataStrings.stderr = this.cast("stderr")
  @scala.inline
  def stdout: typings.azdata.azdataStrings.stdout = this.cast("stdout")
}

