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
}

