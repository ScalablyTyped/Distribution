package typings.chrome.chrome.fileBrowserHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileHandlerExecuteEventDetails extends js.Object {
  /** Array of Entry instances representing files that are targets of this action (selected in ChromeOS file browser). */
  var entries: js.Array[_]
  /** Optional. The ID of the tab that raised this event. Tab IDs are unique within a browser session.  */
  var tab_id: js.UndefOr[Double] = js.undefined
}

object FileHandlerExecuteEventDetails {
  @scala.inline
  def apply(entries: js.Array[_], tab_id: Int | Double = null): FileHandlerExecuteEventDetails = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    if (tab_id != null) __obj.updateDynamic("tab_id")(tab_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileHandlerExecuteEventDetails]
  }
}

