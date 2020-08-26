package typings.chrome.chrome.omnibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Suggestion extends js.Object {
  /** The text that is displayed in the URL dropdown. Can contain XML-style markup for styling. The supported tags are 'url' (for a literal URL), 'match' (for highlighting text that matched what the user's query), and 'dim' (for dim helper text). The styles can be nested, eg. dimmed match. */
  var description: String = js.native
}

object Suggestion {
  @scala.inline
  def apply(description: String): Suggestion = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suggestion]
  }
  @scala.inline
  implicit class SuggestionOps[Self <: Suggestion] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
  }
  
}

