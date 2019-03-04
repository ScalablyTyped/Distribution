package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetActionsRequestedOptions extends js.Object {
  /** The path of the entry to return the list of actions for. */
  var entryPath: java.lang.String
  /** The identifier of the file system related to this operation. */
  var fileSystemId: java.lang.String
  /** The unique identifier of this request. */
  var requestId: scala.Double
}

object GetActionsRequestedOptions {
  @scala.inline
  def apply(entryPath: java.lang.String, fileSystemId: java.lang.String, requestId: scala.Double): GetActionsRequestedOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath, fileSystemId = fileSystemId, requestId = requestId)
  
    __obj.asInstanceOf[GetActionsRequestedOptions]
  }
}

