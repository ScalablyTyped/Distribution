package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationRequestedEventOptions extends RequestedEventOptions {
  /** An ID of the request to which this operation is related. */
  var operationRequestId: scala.Double
}

object OperationRequestedEventOptions {
  @scala.inline
  def apply(fileSystemId: java.lang.String, operationRequestId: scala.Double, requestId: scala.Double): OperationRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId, operationRequestId = operationRequestId, requestId = requestId)
  
    __obj.asInstanceOf[OperationRequestedEventOptions]
  }
}

