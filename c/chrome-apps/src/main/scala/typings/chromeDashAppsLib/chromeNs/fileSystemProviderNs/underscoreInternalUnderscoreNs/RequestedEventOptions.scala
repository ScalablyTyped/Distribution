package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  * @internal
  */
trait RequestedEventOptions extends js.Object {
  /** The identifier of the file system related to this operation. */
  var fileSystemId: java.lang.String
  /** The unique identifier of this request. */
  var requestId: chromeDashAppsLib.chromeNs.integer
}

object RequestedEventOptions {
  @scala.inline
  def apply(fileSystemId: java.lang.String, requestId: chromeDashAppsLib.chromeNs.integer): RequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId, requestId = requestId)
  
    __obj.asInstanceOf[RequestedEventOptions]
  }
}

