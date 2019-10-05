package typings.chromeDashApps.chrome.fileSystemProvider

import typings.chromeDashApps.chrome.fileSystemProvider._internal_.RequestedEventOptions
import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetActionsRequestedEventOptions extends RequestedEventOptions {
  /** The path of the entry to which this operation is related to. */
  var entryPaths: js.Array[String]
}

object GetActionsRequestedEventOptions {
  @scala.inline
  def apply(entryPaths: js.Array[String], fileSystemId: String, requestId: integer): GetActionsRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPaths = entryPaths, fileSystemId = fileSystemId, requestId = requestId)
  
    __obj.asInstanceOf[GetActionsRequestedEventOptions]
  }
}

