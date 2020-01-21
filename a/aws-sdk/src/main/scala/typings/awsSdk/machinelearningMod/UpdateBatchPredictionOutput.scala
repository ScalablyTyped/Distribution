package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBatchPredictionOutput extends js.Object {
  /**
    * The ID assigned to the BatchPrediction during creation. This value should be identical to the value of the BatchPredictionId in the request.
    */
  var BatchPredictionId: js.UndefOr[EntityId] = js.native
}

object UpdateBatchPredictionOutput {
  @scala.inline
  def apply(BatchPredictionId: EntityId = null): UpdateBatchPredictionOutput = {
    val __obj = js.Dynamic.literal()
    if (BatchPredictionId != null) __obj.updateDynamic("BatchPredictionId")(BatchPredictionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBatchPredictionOutput]
  }
}

