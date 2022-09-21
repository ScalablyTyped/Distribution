package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelVersionEvaluation extends StObject {
  
  /**
    *  The evaluation score generated for the model version. 
    */
  var evaluationScore: js.UndefOr[String] = js.undefined
  
  /**
    *  The output variable name. 
    */
  var outputVariableName: js.UndefOr[String] = js.undefined
  
  /**
    *  The prediction explanations generated for the model version. 
    */
  var predictionExplanations: js.UndefOr[PredictionExplanations] = js.undefined
}
object ModelVersionEvaluation {
  
  inline def apply(): ModelVersionEvaluation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelVersionEvaluation]
  }
  
  extension [Self <: ModelVersionEvaluation](x: Self) {
    
    inline def setEvaluationScore(value: String): Self = StObject.set(x, "evaluationScore", value.asInstanceOf[js.Any])
    
    inline def setEvaluationScoreUndefined: Self = StObject.set(x, "evaluationScore", js.undefined)
    
    inline def setOutputVariableName(value: String): Self = StObject.set(x, "outputVariableName", value.asInstanceOf[js.Any])
    
    inline def setOutputVariableNameUndefined: Self = StObject.set(x, "outputVariableName", js.undefined)
    
    inline def setPredictionExplanations(value: PredictionExplanations): Self = StObject.set(x, "predictionExplanations", value.asInstanceOf[js.Any])
    
    inline def setPredictionExplanationsUndefined: Self = StObject.set(x, "predictionExplanations", js.undefined)
  }
}
