package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.fileSystemProvider.internal.FilePathRequestedEventOptions
import typings.chromeApps.chrome.integer
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
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TruncateRequestedEventOptions]
  }
}

