package typings.chromeDashApps.chrome.fileSystemProvider

import typings.chromeDashApps.chrome.fileSystemProvider._internal_.RequestedEventOptions
import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyEntryRequestedEventOptions extends RequestedEventOptions {
  /** The source path for the operation. */
  var sourcePath: String
  /** The destination path for the operation. */
  var targetPath: String
}

object CopyEntryRequestedEventOptions {
  @scala.inline
  def apply(fileSystemId: String, requestId: integer, sourcePath: String, targetPath: String): CopyEntryRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId, requestId = requestId, sourcePath = sourcePath, targetPath = targetPath)
  
    __obj.asInstanceOf[CopyEntryRequestedEventOptions]
  }
}

