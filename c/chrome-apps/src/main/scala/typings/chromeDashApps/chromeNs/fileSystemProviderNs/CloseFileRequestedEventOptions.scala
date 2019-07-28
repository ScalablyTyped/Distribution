package typings.chromeDashApps.chromeNs.fileSystemProviderNs

import typings.chromeDashApps.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs.RequestedEventOptions
import typings.chromeDashApps.chromeNs.integer
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
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId, openRequestId = openRequestId, requestId = requestId)
  
    __obj.asInstanceOf[CloseFileRequestedEventOptions]
  }
}

