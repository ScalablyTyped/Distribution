package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredictInput extends js.Object {
  /**
    * A unique identifier of the MLModel.
    */
  var MLModelId: EntityId = js.native
  var PredictEndpoint: VipURL = js.native
  var Record: typings.awsSdk.machinelearningMod.Record = js.native
}

object PredictInput {
  @scala.inline
  def apply(MLModelId: EntityId, PredictEndpoint: VipURL, Record: Record): PredictInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId.asInstanceOf[js.Any], PredictEndpoint = PredictEndpoint.asInstanceOf[js.Any], Record = Record.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictInput]
  }
}

