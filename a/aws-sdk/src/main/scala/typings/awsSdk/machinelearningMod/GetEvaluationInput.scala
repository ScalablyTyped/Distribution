package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEvaluationInput extends js.Object {
  /**
    * The ID of the Evaluation to retrieve. The evaluation of each MLModel is recorded and cataloged. The ID provides the means to access the information. 
    */
  var EvaluationId: EntityId = js.native
}

object GetEvaluationInput {
  @scala.inline
  def apply(EvaluationId: EntityId): GetEvaluationInput = {
    val __obj = js.Dynamic.literal(EvaluationId = EvaluationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEvaluationInput]
  }
  @scala.inline
  implicit class GetEvaluationInputOps[Self <: GetEvaluationInput] (val x: Self) extends AnyVal {
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
  }
  
}

