package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typings.chromeApps.chrome.integer
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
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], sourcePath = sourcePath.asInstanceOf[js.Any], targetPath = targetPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyEntryRequestedEventOptions]
  }
}

