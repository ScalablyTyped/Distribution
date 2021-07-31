package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEvaluationOutput extends StObject {
  
  /**
    * A user-supplied ID that uniquely identifies the Evaluation. This value should be identical to the value of the EvaluationId in the request.
    */
  var EvaluationId: js.UndefOr[EntityId] = js.undefined
}
object DeleteEvaluationOutput {
  
  @scala.inline
  def apply(): DeleteEvaluationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteEvaluationOutput]
  }
  
  @scala.inline
  implicit class DeleteEvaluationOutputMutableBuilder[Self <: DeleteEvaluationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluationId(value: EntityId): Self = StObject.set(x, "EvaluationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationIdUndefined: Self = StObject.set(x, "EvaluationId", js.undefined)
  }
}
