package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMLModelOutput extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the MLModel. This value should be identical to the value of the MLModelId in the request. 
    */
  var MLModelId: js.UndefOr[EntityId] = js.native
}

object CreateMLModelOutput {
  @scala.inline
  def apply(MLModelId: EntityId = null): CreateMLModelOutput = {
    val __obj = js.Dynamic.literal()
    if (MLModelId != null) __obj.updateDynamic("MLModelId")(MLModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMLModelOutput]
  }
}

