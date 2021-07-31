package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEvaluationOutput extends StObject {
  
  /**
    * The user-supplied ID that uniquely identifies the Evaluation. This value should be identical to the value of the EvaluationId in the request.
    */
  var EvaluationId: js.UndefOr[EntityId] = js.undefined
}
object CreateEvaluationOutput {
  
  @scala.inline
  def apply(): CreateEvaluationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEvaluationOutput]
  }
  
  @scala.inline
  implicit class CreateEvaluationOutputMutableBuilder[Self <: CreateEvaluationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluationId(value: EntityId): Self = StObject.set(x, "EvaluationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationIdUndefined: Self = StObject.set(x, "EvaluationId", js.undefined)
  }
}
