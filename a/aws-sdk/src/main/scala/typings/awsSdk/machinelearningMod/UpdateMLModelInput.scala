package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMLModelInput extends js.Object {
  /**
    * The ID assigned to the MLModel during creation.
    */
  var MLModelId: EntityId = js.native
  /**
    * A user-supplied name or description of the MLModel.
    */
  var MLModelName: js.UndefOr[EntityName] = js.native
  /**
    * The ScoreThreshold used in binary classification MLModel that marks the boundary between a positive prediction and a negative prediction. Output values greater than or equal to the ScoreThreshold receive a positive result from the MLModel, such as true. Output values less than the ScoreThreshold receive a negative response from the MLModel, such as false.
    */
  var ScoreThreshold: js.UndefOr[typings.awsSdk.machinelearningMod.ScoreThreshold] = js.native
}

object UpdateMLModelInput {
  @scala.inline
  def apply(MLModelId: EntityId): UpdateMLModelInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMLModelInput]
  }
  @scala.inline
  implicit class UpdateMLModelInputOps[Self <: UpdateMLModelInput] (val x: Self) extends AnyVal {
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
    def setMLModelId(value: EntityId): Self = this.set("MLModelId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMLModelName(value: EntityName): Self = this.set("MLModelName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMLModelName: Self = this.set("MLModelName", js.undefined)
    @scala.inline
    def setScoreThreshold(value: ScoreThreshold): Self = this.set("ScoreThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoreThreshold: Self = this.set("ScoreThreshold", js.undefined)
  }
  
}

