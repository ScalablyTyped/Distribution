package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenedFileIoRequestedEventOptions extends OpenedFileRequestedEventOptions {
  /** Buffer of bytes to be operated on the file. */
  var data: stdLib.ArrayBuffer
  /** Position in the file (in bytes) to start operating from. */
  var offset: scala.Double
}

object OpenedFileIoRequestedEventOptions {
  @scala.inline
  def apply(
    data: stdLib.ArrayBuffer,
    fileSystemId: java.lang.String,
    offset: scala.Double,
    openRequestId: scala.Double,
    requestId: scala.Double
  ): OpenedFileIoRequestedEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("fileSystemId")(fileSystemId)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("openRequestId")(openRequestId)
    __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[OpenedFileIoRequestedEventOptions]
  }
}

