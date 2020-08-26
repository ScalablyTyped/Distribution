package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBatchPredictionInput extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the BatchPrediction.
    */
  var BatchPredictionId: EntityId = js.native
}

object DeleteBatchPredictionInput {
  @scala.inline
  def apply(BatchPredictionId: EntityId): DeleteBatchPredictionInput = {
    val __obj = js.Dynamic.literal(BatchPredictionId = BatchPredictionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBatchPredictionInput]
  }
  @scala.inline
  implicit class DeleteBatchPredictionInputOps[Self <: DeleteBatchPredictionInput] (val x: Self) extends AnyVal {
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
    def setBatchPredictionId(value: EntityId): Self = this.set("BatchPredictionId", value.asInstanceOf[js.Any])
  }
  
}

