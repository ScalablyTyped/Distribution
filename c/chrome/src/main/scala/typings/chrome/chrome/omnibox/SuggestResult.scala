package typings.chrome.chrome.omnibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestResult extends js.Object {
  /** The text that is put into the URL bar, and that is sent to the extension when the user chooses this entry. */
  var content: String
  /**
    * Whether the suggest result can be deleted by the user.
    * @since Chrome 63.
    */
  var deletable: js.UndefOr[Boolean] = js.undefined
  /** The text that is displayed in the URL dropdown. Can contain XML-style markup for styling. The supported tags are 'url' (for a literal URL), 'match' (for highlighting text that matched what the user's query), and 'dim' (for dim helper text). The styles can be nested, eg. dimmed match. You must escape the five predefined entities to display them as text: stackoverflow.com/a/1091953/89484 */
  var description: String
}

object SuggestResult {
  @scala.inline
  def apply(content: String, description: String, deletable: js.UndefOr[Boolean] = js.undefined): SuggestResult = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    if (!js.isUndefined(deletable)) __obj.updateDynamic("deletable")(deletable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestResult]
  }
}

