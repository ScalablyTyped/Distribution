package typings.chromeDashApps.chromeNs.fileSystemProviderNs

import typings.chromeDashApps.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs.RequestedEventOptions
import typings.chromeDashApps.chromeNs.integer
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
    val __obj = js.Dynamic.literal(data = data, fileSystemId = fileSystemId, offset = offset, openRequestId = openRequestId, requestId = requestId)
  
    __obj.asInstanceOf[WriteFileRequestedEventOptions]
  }
}

