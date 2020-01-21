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
}

