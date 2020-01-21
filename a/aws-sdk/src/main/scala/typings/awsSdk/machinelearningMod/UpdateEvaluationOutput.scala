package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEvaluationOutput extends js.Object {
  /**
    * The ID assigned to the Evaluation during creation. This value should be identical to the value of the Evaluation in the request.
    */
  var EvaluationId: js.UndefOr[EntityId] = js.native
}

object UpdateEvaluationOutput {
  @scala.inline
  def apply(EvaluationId: EntityId = null): UpdateEvaluationOutput = {
    val __obj = js.Dynamic.literal()
    if (EvaluationId != null) __obj.updateDynamic("EvaluationId")(EvaluationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEvaluationOutput]
  }
}

