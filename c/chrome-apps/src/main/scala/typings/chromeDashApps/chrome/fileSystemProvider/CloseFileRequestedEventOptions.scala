package typings.chromeDashApps.chrome.fileSystemProvider

import typings.chromeDashApps.chrome.fileSystemProvider._internal_.RequestedEventOptions
import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseFileRequestedEventOptions extends RequestedEventOptions {
  /** A request ID used to open the file. */
  var openRequestId: integer
}

object CloseFileRequestedEventOptions {
  @scala.inline
  def apply(fileSystemId: String, openRequestId: integer, requestId: integer): CloseFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloseFileRequestedEventOptions]
  }
}

