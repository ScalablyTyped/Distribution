package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteActionRequestedOptions extends js.Object {
  /** The identifier of the action to be executed. */
  var actionId: java.lang.String
  /** The path of the entry to be used for the action. */
  var entryPath: java.lang.String
  /** The identifier of the file system related to this operation. */
  var fileSystemId: java.lang.String
  /** The unique identifier of this request. */
  var requestId: scala.Double
}

object ExecuteActionRequestedOptions {
  @scala.inline
  def apply(
    actionId: java.lang.String,
    entryPath: java.lang.String,
    fileSystemId: java.lang.String,
    requestId: scala.Double
  ): ExecuteActionRequestedOptions = {
    val __obj = js.Dynamic.literal(actionId = actionId, entryPath = entryPath, fileSystemId = fileSystemId, requestId = requestId)
  
    __obj.asInstanceOf[ExecuteActionRequestedOptions]
  }
}

