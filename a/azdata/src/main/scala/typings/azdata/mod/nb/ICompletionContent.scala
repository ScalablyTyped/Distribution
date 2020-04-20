package typings.azdata.mod.nb

import typings.azdata.azdataStrings.error
import typings.azdata.azdataStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompletionContent extends js.Object {
  var cursor_end: Double
  var cursor_start: Double
  var matches: js.Array[String]
  var metadata: js.Any
  var status: ok | error
}

object ICompletionContent {
  @scala.inline
  def apply(
    cursor_end: Double,
    cursor_start: Double,
    matches: js.Array[String],
    metadata: js.Any,
    status: ok | error
  ): ICompletionContent = {
    val __obj = js.Dynamic.literal(cursor_end = cursor_end.asInstanceOf[js.Any], cursor_start = cursor_start.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompletionContent]
  }
}

