package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelSimulationJobBatchRequest extends js.Object {
  /**
    * The id of the batch to cancel.
    */
  var batch: Arn = js.native
}

object CancelSimulationJobBatchRequest {
  @scala.inline
  def apply(batch: Arn): CancelSimulationJobBatchRequest = {
    val __obj = js.Dynamic.literal(batch = batch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CancelSimulationJobBatchRequest]
  }
}

