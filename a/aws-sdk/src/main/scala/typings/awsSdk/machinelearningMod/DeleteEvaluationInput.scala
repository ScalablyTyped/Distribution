package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEvaluationInput extends StObject {
  
  /**
    * A user-supplied ID that uniquely identifies the Evaluation to delete.
    */
  var EvaluationId: EntityId
}
object DeleteEvaluationInput {
  
  inline def apply(EvaluationId: EntityId): DeleteEvaluationInput = {
    val __obj = js.Dynamic.literal(EvaluationId = EvaluationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEvaluationInput]
  }
  
  extension [Self <: DeleteEvaluationInput](x: Self) {
    
    inline def setEvaluationId(value: EntityId): Self = StObject.set(x, "EvaluationId", value.asInstanceOf[js.Any])
  }
}
