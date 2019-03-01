package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortRequestedEventOptions
  extends chromeDashAppsLib.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs.RequestedEventOptions {
  /** An ID of the request to which this operation is related. */
  var operationRequestId: chromeDashAppsLib.chromeNs.integer
}

object AbortRequestedEventOptions {
  @scala.inline
  def apply(
    fileSystemId: java.lang.String,
    operationRequestId: chromeDashAppsLib.chromeNs.integer,
    requestId: chromeDashAppsLib.chromeNs.integer
  ): AbortRequestedEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileSystemId")(fileSystemId)
    __obj.updateDynamic("operationRequestId")(operationRequestId)
    __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[AbortRequestedEventOptions]
  }
}

