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
}

