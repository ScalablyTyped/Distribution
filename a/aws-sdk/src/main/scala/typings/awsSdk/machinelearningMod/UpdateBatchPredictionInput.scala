package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBatchPredictionInput extends js.Object {
  /**
    * The ID assigned to the BatchPrediction during creation.
    */
  var BatchPredictionId: EntityId = js.native
  /**
    * A new user-supplied name or description of the BatchPrediction.
    */
  var BatchPredictionName: EntityName = js.native
}

object UpdateBatchPredictionInput {
  @scala.inline
  def apply(BatchPredictionId: EntityId, BatchPredictionName: EntityName): UpdateBatchPredictionInput = {
    val __obj = js.Dynamic.literal(BatchPredictionId = BatchPredictionId.asInstanceOf[js.Any], BatchPredictionName = BatchPredictionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBatchPredictionInput]
  }
  @scala.inline
  implicit class UpdateBatchPredictionInputOps[Self <: UpdateBatchPredictionInput] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setBatchPredictionName(value: EntityName): Self = this.set("BatchPredictionName", value.asInstanceOf[js.Any])
  }
  
}

