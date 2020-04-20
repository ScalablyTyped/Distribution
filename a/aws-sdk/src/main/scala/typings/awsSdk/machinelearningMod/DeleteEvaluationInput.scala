package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEvaluationInput extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the Evaluation to delete.
    */
  var EvaluationId: EntityId = js.native
}

object DeleteEvaluationInput {
  @scala.inline
  def apply(EvaluationId: EntityId): DeleteEvaluationInput = {
    val __obj = js.Dynamic.literal(EvaluationId = EvaluationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEvaluationInput]
  }
}

