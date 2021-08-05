package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEvaluationInput extends StObject {
  
  /**
    * The ID of the Evaluation to retrieve. The evaluation of each MLModel is recorded and cataloged. The ID provides the means to access the information. 
    */
  var EvaluationId: EntityId
}
object GetEvaluationInput {
  
  inline def apply(EvaluationId: EntityId): GetEvaluationInput = {
    val __obj = js.Dynamic.literal(EvaluationId = EvaluationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEvaluationInput]
  }
  
  extension [Self <: GetEvaluationInput](x: Self) {
    
    inline def setEvaluationId(value: EntityId): Self = StObject.set(x, "EvaluationId", value.asInstanceOf[js.Any])
  }
}
