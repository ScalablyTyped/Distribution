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
  @scala.inline
  implicit class CancelSimulationJobBatchRequestOps[Self <: CancelSimulationJobBatchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBatch(value: Arn): Self = this.set("batch", value.asInstanceOf[js.Any])
  }
  
}

