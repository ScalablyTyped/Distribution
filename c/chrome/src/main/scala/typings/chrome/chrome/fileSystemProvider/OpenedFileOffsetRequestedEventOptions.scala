package typings.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenedFileOffsetRequestedEventOptions extends OpenedFileRequestedEventOptions {
  /** Number of bytes to be returned. */
  var length: Double
  /** Position in the file (in bytes) to start reading from. */
  var offset: Double
}

object OpenedFileOffsetRequestedEventOptions {
  @scala.inline
  def apply(fileSystemId: String, length: Double, offset: Double, openRequestId: Double, requestId: Double): OpenedFileOffsetRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenedFileOffsetRequestedEventOptions]
  }
}

