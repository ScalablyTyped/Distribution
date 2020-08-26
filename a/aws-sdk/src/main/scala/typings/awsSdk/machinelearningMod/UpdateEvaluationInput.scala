package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEvaluationInput extends js.Object {
  /**
    * The ID assigned to the Evaluation during creation.
    */
  var EvaluationId: EntityId = js.native
  /**
    * A new user-supplied name or description of the Evaluation that will replace the current content. 
    */
  var EvaluationName: EntityName = js.native
}

object UpdateEvaluationInput {
  @scala.inline
  def apply(EvaluationId: EntityId, EvaluationName: EntityName): UpdateEvaluationInput = {
    val __obj = js.Dynamic.literal(EvaluationId = EvaluationId.asInstanceOf[js.Any], EvaluationName = EvaluationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEvaluationInput]
  }
  @scala.inline
  implicit class UpdateEvaluationInputOps[Self <: UpdateEvaluationInput] (val x: Self) extends AnyVal {
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
    def setEvaluationId(value: EntityId): Self = this.set("EvaluationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvaluationName(value: EntityName): Self = this.set("EvaluationName", value.asInstanceOf[js.Any])
  }
  
}

