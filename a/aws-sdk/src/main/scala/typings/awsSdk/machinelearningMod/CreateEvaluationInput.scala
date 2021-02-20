package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateEvaluationInput extends StObject {
  
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
  def apply(EvaluationDataSourceId: EntityId, EvaluationId: EntityId, MLModelId: EntityId): CreateEvaluationInput = {
    val __obj = js.Dynamic.literal(EvaluationDataSourceId = EvaluationDataSourceId.asInstanceOf[js.Any], EvaluationId = EvaluationId.asInstanceOf[js.Any], MLModelId = MLModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEvaluationInput]
  }
  
  @scala.inline
  implicit class CreateEvaluationInputMutableBuilder[Self <: CreateEvaluationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluationDataSourceId(value: EntityId): Self = StObject.set(x, "EvaluationDataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationId(value: EntityId): Self = StObject.set(x, "EvaluationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationName(value: EntityName): Self = StObject.set(x, "EvaluationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationNameUndefined: Self = StObject.set(x, "EvaluationName", js.undefined)
    
    @scala.inline
    def setMLModelId(value: EntityId): Self = StObject.set(x, "MLModelId", value.asInstanceOf[js.Any])
  }
}
