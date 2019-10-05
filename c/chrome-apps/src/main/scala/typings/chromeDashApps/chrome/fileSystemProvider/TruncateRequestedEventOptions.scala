package typings.chromeDashApps.chrome.fileSystemProvider

import typings.chromeDashApps.chrome.double
import typings.chromeDashApps.chrome.fileSystemProvider._internal_.FilePathRequestedEventOptions
import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TruncateRequestedEventOptions extends FilePathRequestedEventOptions {
  /** Number of bytes to be retained after the operation completes. */
  var length: double
}

object TruncateRequestedEventOptions {
  @scala.inline
  def apply(filePath: String, fileSystemId: String, length: double, requestId: integer): TruncateRequestedEventOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath, fileSystemId = fileSystemId, length = length, requestId = requestId)
  
    __obj.asInstanceOf[TruncateRequestedEventOptions]
  }
}

