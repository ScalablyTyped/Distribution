package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseFileRequestedEventOptions
  extends chromeDashAppsLib.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs.RequestedEventOptions {
  /** A request ID used to open the file. */
  var openRequestId: chromeDashAppsLib.chromeNs.integer
}

object CloseFileRequestedEventOptions {
  @scala.inline
  def apply(
    fileSystemId: java.lang.String,
    openRequestId: chromeDashAppsLib.chromeNs.integer,
    requestId: chromeDashAppsLib.chromeNs.integer
  ): CloseFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId, openRequestId = openRequestId, requestId = requestId)
  
    __obj.asInstanceOf[CloseFileRequestedEventOptions]
  }
}

