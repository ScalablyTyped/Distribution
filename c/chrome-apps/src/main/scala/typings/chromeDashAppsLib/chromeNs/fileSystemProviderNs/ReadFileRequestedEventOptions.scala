package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadFileRequestedEventOptions
  extends chromeDashAppsLib.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs.RequestedEventOptions {
  /** Number of bytes to be returned. */
  var length: chromeDashAppsLib.chromeNs.double
  /** Position in the file (in bytes) to start reading from. */
  var offset: chromeDashAppsLib.chromeNs.double
  /** A request ID used to open the file. */
  var openRequestId: chromeDashAppsLib.chromeNs.integer
}

object ReadFileRequestedEventOptions {
  @scala.inline
  def apply(
    fileSystemId: java.lang.String,
    length: chromeDashAppsLib.chromeNs.double,
    offset: chromeDashAppsLib.chromeNs.double,
    openRequestId: chromeDashAppsLib.chromeNs.integer,
    requestId: chromeDashAppsLib.chromeNs.integer
  ): ReadFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileSystemId")(fileSystemId)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("openRequestId")(openRequestId)
    __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[ReadFileRequestedEventOptions]
  }
}

