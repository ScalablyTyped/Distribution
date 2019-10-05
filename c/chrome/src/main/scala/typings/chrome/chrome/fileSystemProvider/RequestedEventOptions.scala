package typings.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestedEventOptions extends js.Object {
  /** The identifier of the file system related to this operation. */
  var fileSystemId: String
  /** The unique identifier of this request. */
  var requestId: Double
}

object RequestedEventOptions {
  @scala.inline
  def apply(fileSystemId: String, requestId: Double): RequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId, requestId = requestId)
  
    __obj.asInstanceOf[RequestedEventOptions]
  }
}

