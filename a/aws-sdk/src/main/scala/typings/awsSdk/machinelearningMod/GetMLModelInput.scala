package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMLModelInput extends js.Object {
  /**
    * The ID assigned to the MLModel at creation.
    */
  var MLModelId: EntityId = js.native
  /**
    * Specifies whether the GetMLModel operation should return Recipe. If true, Recipe is returned. If false, Recipe is not returned.
    */
  var Verbose: js.UndefOr[typings.awsSdk.machinelearningMod.Verbose] = js.native
}

object GetMLModelInput {
  @scala.inline
  def apply(MLModelId: EntityId, Verbose: js.UndefOr[Verbose] = js.undefined): GetMLModelInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId.asInstanceOf[js.Any])
    if (!js.isUndefined(Verbose)) __obj.updateDynamic("Verbose")(Verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMLModelInput]
  }
}

