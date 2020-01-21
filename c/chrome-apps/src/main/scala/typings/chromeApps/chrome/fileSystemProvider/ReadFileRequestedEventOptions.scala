package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadFileRequestedEventOptions extends RequestedEventOptions {
  /** Number of bytes to be returned. */
  var length: double
  /** Position in the file (in bytes) to start reading from. */
  var offset: double
  /** A request ID used to open the file. */
  var openRequestId: integer
}

object ReadFileRequestedEventOptions {
  @scala.inline
  def apply(fileSystemId: String, length: double, offset: double, openRequestId: integer, requestId: integer): ReadFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadFileRequestedEventOptions]
  }
}

