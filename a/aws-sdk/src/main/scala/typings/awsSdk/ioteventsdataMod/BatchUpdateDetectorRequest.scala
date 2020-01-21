package typings.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateDetectorRequest extends js.Object {
  /**
    * The list of detectors (instances) to update, along with the values to update.
    */
  var detectors: UpdateDetectorRequests = js.native
}

object BatchUpdateDetectorRequest {
  @scala.inline
  def apply(detectors: UpdateDetectorRequests): BatchUpdateDetectorRequest = {
    val __obj = js.Dynamic.literal(detectors = detectors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchUpdateDetectorRequest]
  }
}

