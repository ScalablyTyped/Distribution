package typings.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  /** The identifier of the action. Any string or CommonActionId for common actions. */
  var id: String
  /** Optional. The title of the action. It may be ignored for common actions.  */
  var title: js.UndefOr[String] = js.undefined
}

object Action {
  @scala.inline
  def apply(id: String, title: String = null): Action = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

