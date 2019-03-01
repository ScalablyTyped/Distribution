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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileSystemId")(fileSystemId)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("openRequestId")(openRequestId)
    __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[OpenedFileOffsetRequestedEventOptions]
  }
}

