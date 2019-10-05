package typings.chromeDashApps.chrome.fileSystemProvider

import typings.chromeDashApps.chrome.integer
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
    val __obj = js.Dynamic.literal(actionId = actionId, entryPaths = entryPaths, fileSystemId = fileSystemId, requestId = requestId)
  
    __obj.asInstanceOf[ExecuteActionRequestedEventOptions]
  }
}

