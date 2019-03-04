package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteFileRequestedEventOptions
  extends chromeDashAppsLib.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs.RequestedEventOptions {
  /** Buffer of bytes to be operated on the file. */
  var data: stdLib.ArrayBuffer
  /** Position in the file (in bytes) to start operating from. */
  var offset: chromeDashAppsLib.chromeNs.integer
  /** A request ID used to open the file. */
  var openRequestId: chromeDashAppsLib.chromeNs.integer
}

object WriteFileRequestedEventOptions {
  @scala.inline
  def apply(
    data: stdLib.ArrayBuffer,
    fileSystemId: java.lang.String,
    offset: chromeDashAppsLib.chromeNs.integer,
    openRequestId: chromeDashAppsLib.chromeNs.integer,
    requestId: chromeDashAppsLib.chromeNs.integer
  ): WriteFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(data = data, fileSystemId = fileSystemId, offset = offset, openRequestId = openRequestId, requestId = requestId)
  
    __obj.asInstanceOf[WriteFileRequestedEventOptions]
  }
}

