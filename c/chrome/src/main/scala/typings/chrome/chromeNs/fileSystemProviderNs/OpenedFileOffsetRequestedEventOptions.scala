package typings.chrome.chromeNs.fileSystemProviderNs

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
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId, length = length, offset = offset, openRequestId = openRequestId, requestId = requestId)
  
    __obj.asInstanceOf[OpenedFileOffsetRequestedEventOptions]
  }
}

