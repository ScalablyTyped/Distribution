package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenedFileOffsetRequestedEventOptions extends OpenedFileRequestedEventOptions {
  /** Number of bytes to be returned. */
  var length: scala.Double
  /** Position in the file (in bytes) to start reading from. */
  var offset: scala.Double
}

object OpenedFileOffsetRequestedEventOptions {
  @scala.inline
  def apply(
    fileSystemId: java.lang.String,
    length: scala.Double,
    offset: scala.Double,
    openRequestId: scala.Double,
    requestId: scala.Double
  ): OpenedFileOffsetRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId, length = length, offset = offset, openRequestId = openRequestId, requestId = requestId)
  
    __obj.asInstanceOf[OpenedFileOffsetRequestedEventOptions]
  }
}

