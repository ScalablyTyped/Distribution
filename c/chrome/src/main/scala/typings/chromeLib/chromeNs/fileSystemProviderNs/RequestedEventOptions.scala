package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestedEventOptions extends js.Object {
  /** The identifier of the file system related to this operation. */
  var fileSystemId: java.lang.String
  /** The unique identifier of this request. */
  var requestId: scala.Double
}

object RequestedEventOptions {
  @scala.inline
  def apply(fileSystemId: java.lang.String, requestId: scala.Double): RequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId, requestId = requestId)
  
    __obj.asInstanceOf[RequestedEventOptions]
  }
}

