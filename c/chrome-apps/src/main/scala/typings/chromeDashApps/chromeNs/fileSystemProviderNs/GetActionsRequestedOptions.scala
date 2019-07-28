package typings.chromeDashApps.chromeNs.fileSystemProviderNs

import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since Chrome 45. */
trait GetActionsRequestedOptions extends js.Object {
  /** The path of the entry to return the list of actions for. */
  var entryPath: String
  /** The identifier of the file system related to this operation. */
  var fileSystemId: String
  /** The unique identifier of this request. */
  var requestId: integer
}

object GetActionsRequestedOptions {
  @scala.inline
  def apply(entryPath: String, fileSystemId: String, requestId: integer): GetActionsRequestedOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath, fileSystemId = fileSystemId, requestId = requestId)
  
    __obj.asInstanceOf[GetActionsRequestedOptions]
  }
}

