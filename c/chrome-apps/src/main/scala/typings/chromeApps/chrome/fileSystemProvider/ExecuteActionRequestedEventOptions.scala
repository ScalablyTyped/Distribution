package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteActionRequestedEventOptions extends GetActionsRequestedEventOptions {
  /** The identifier of the action to be executed. */
  var actionId: String
}

object ExecuteActionRequestedEventOptions {
  @scala.inline
  def apply(actionId: String, entryPaths: js.Array[String], fileSystemId: String, requestId: integer): ExecuteActionRequestedEventOptions = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], entryPaths = entryPaths.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteActionRequestedEventOptions]
  }
}

