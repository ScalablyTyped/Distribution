package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBatchPredictionInput extends js.Object {
  /**
    * An ID assigned to the BatchPrediction at creation.
    */
  var BatchPredictionId: EntityId = js.native
}

object GetBatchPredictionInput {
  @scala.inline
  def apply(BatchPredictionId: EntityId): GetBatchPredictionInput = {
    val __obj = js.Dynamic.literal(BatchPredictionId = BatchPredictionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBatchPredictionInput]
  }
}

