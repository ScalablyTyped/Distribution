package typings.chromeDashApps.chrome.fileSystemProvider

import typings.chromeDashApps.chrome.fileSystemProvider._internal_.RequestedEventOptions
import typings.chromeDashApps.chrome.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteFileRequestedEventOptions extends RequestedEventOptions {
  /** Buffer of bytes to be operated on the file. */
  var data: ArrayBuffer
  /** Position in the file (in bytes) to start operating from. */
  var offset: integer
  /** A request ID used to open the file. */
  var openRequestId: integer
}

object WriteFileRequestedEventOptions {
  @scala.inline
  def apply(
    data: ArrayBuffer,
    fileSystemId: String,
    offset: integer,
    openRequestId: integer,
    requestId: integer
  ): WriteFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WriteFileRequestedEventOptions]
  }
}

