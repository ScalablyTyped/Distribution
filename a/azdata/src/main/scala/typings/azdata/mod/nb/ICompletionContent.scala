package typings.azdata.mod.nb

import typings.azdata.azdataStrings.error
import typings.azdata.azdataStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompletionContent extends js.Object {
  var cursor_end: Double = js.native
  var cursor_start: Double = js.native
  var matches: js.Array[String] = js.native
  var metadata: js.Any = js.native
  var status: ok | error = js.native
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
  @scala.inline
  implicit class ICompletionContentOps[Self <: ICompletionContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCursor_end(value: Double): Self = this.set("cursor_end", value.asInstanceOf[js.Any])
    @scala.inline
    def setCursor_start(value: Double): Self = this.set("cursor_start", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchesVarargs(value: String*): Self = this.set("matches", js.Array(value :_*))
    @scala.inline
    def setMatches(value: js.Array[String]): Self = this.set("matches", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: ok | error): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

