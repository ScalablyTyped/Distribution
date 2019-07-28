package typings.chromeDashApps.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs

import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  * @internal
  */
trait RequestedEventOptions extends js.Object {
  /** The identifier of the file system related to this operation. */
  var fileSystemId: String
  /** The unique identifier of this request. */
  var requestId: integer
}

object RequestedEventOptions {
  @scala.inline
  def apply(fileSystemId: String, requestId: integer): RequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId, requestId = requestId)
  
    __obj.asInstanceOf[RequestedEventOptions]
  }
}

