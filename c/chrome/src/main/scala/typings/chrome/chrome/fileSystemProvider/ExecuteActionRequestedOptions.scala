package typings.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteActionRequestedOptions extends js.Object {
  /** The identifier of the action to be executed. */
  var actionId: String
  /** The path of the entry to be used for the action. */
  var entryPath: String
  /** The identifier of the file system related to this operation. */
  var fileSystemId: String
  /** The unique identifier of this request. */
  var requestId: Double
}

object ExecuteActionRequestedOptions {
  @scala.inline
  def apply(actionId: String, entryPath: String, fileSystemId: String, requestId: Double): ExecuteActionRequestedOptions = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], entryPath = entryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExecuteActionRequestedOptions]
  }
}

