package typings.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenedFileRequestedEventOptions extends RequestedEventOptions {
  /** A request ID used to open the file. */
  var openRequestId: Double
}

object OpenedFileRequestedEventOptions {
  @scala.inline
  def apply(fileSystemId: String, openRequestId: Double, requestId: Double): OpenedFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenedFileRequestedEventOptions]
  }
}

