package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEvaluationInput extends js.Object {
  /**
    * The ID of the DataSource for the evaluation. The schema of the DataSource must match the schema used to create the MLModel.
    */
  var EvaluationDataSourceId: EntityId = js.native
  /**
    * A user-supplied ID that uniquely identifies the Evaluation.
    */
  var EvaluationId: EntityId = js.native
  /**
    * A user-supplied name or description of the Evaluation.
    */
  var EvaluationName: js.UndefOr[EntityName] = js.native
  /**
    * The ID of the MLModel to evaluate. The schema used in creating the MLModel must match the schema of the DataSource used in the Evaluation.
    */
  var MLModelId: EntityId = js.native
}

object CreateEvaluationInput {
  @scala.inline
  def apply(
    EvaluationDataSourceId: EntityId,
    EvaluationId: EntityId,
    MLModelId: EntityId,
    EvaluationName: EntityName = null
  ): CreateEvaluationInput = {
    val __obj = js.Dynamic.literal(EvaluationDataSourceId = EvaluationDataSourceId.asInstanceOf[js.Any], EvaluationId = EvaluationId.asInstanceOf[js.Any], MLModelId = MLModelId.asInstanceOf[js.Any])
    if (EvaluationName != null) __obj.updateDynamic("EvaluationName")(EvaluationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEvaluationInput]
  }
}

