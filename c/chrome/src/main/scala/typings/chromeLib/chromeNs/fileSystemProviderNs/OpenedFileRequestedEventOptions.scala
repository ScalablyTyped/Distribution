package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenedFileRequestedEventOptions extends RequestedEventOptions {
  /** A request ID used to open the file. */
  var openRequestId: scala.Double
}

object OpenedFileRequestedEventOptions {
  @scala.inline
  def apply(fileSystemId: java.lang.String, openRequestId: scala.Double, requestId: scala.Double): OpenedFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileSystemId")(fileSystemId)
    __obj.updateDynamic("openRequestId")(openRequestId)
    __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[OpenedFileRequestedEventOptions]
  }
}

