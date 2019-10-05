package typings.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetActionsRequestedOptions extends js.Object {
  /** The path of the entry to return the list of actions for. */
  var entryPath: String
  /** The identifier of the file system related to this operation. */
  var fileSystemId: String
  /** The unique identifier of this request. */
  var requestId: Double
}

object GetActionsRequestedOptions {
  @scala.inline
  def apply(entryPath: String, fileSystemId: String, requestId: Double): GetActionsRequestedOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath, fileSystemId = fileSystemId, requestId = requestId)
  
    __obj.asInstanceOf[GetActionsRequestedOptions]
  }
}

