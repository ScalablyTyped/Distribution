package typings.chrome.chrome.fileSystemProvider

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenedFileIoRequestedEventOptions extends OpenedFileRequestedEventOptions {
  /** Buffer of bytes to be operated on the file. */
  var data: ArrayBuffer
  /** Position in the file (in bytes) to start operating from. */
  var offset: Double
}

object OpenedFileIoRequestedEventOptions {
  @scala.inline
  def apply(data: ArrayBuffer, fileSystemId: String, offset: Double, openRequestId: Double, requestId: Double): OpenedFileIoRequestedEventOptions = {
    val __obj = js.Dynamic.literal(data = data, fileSystemId = fileSystemId, offset = offset, openRequestId = openRequestId, requestId = requestId)
  
    __obj.asInstanceOf[OpenedFileIoRequestedEventOptions]
  }
}

