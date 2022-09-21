package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEventPredictionResult extends StObject {
  
  /**
    * The model scores for Amazon SageMaker models.
    */
  var externalModelOutputs: js.UndefOr[ListOfExternalModelOutputs] = js.undefined
  
  /**
    * The model scores. Amazon Fraud Detector generates model scores between 0 and 1000, where 0 is low fraud risk and 1000 is high fraud risk. Model scores are directly related to the false positive rate (FPR). For example, a score of 600 corresponds to an estimated 10% false positive rate whereas a score of 900 corresponds to an estimated 2% false positive rate.
    */
  var modelScores: js.UndefOr[ListOfModelScores] = js.undefined
  
  /**
    * The results from the rules.
    */
  var ruleResults: js.UndefOr[ListOfRuleResults] = js.undefined
}
object GetEventPredictionResult {
  
  inline def apply(): GetEventPredictionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEventPredictionResult]
  }
  
  extension [Self <: GetEventPredictionResult](x: Self) {
    
    inline def setExternalModelOutputs(value: ListOfExternalModelOutputs): Self = StObject.set(x, "externalModelOutputs", value.asInstanceOf[js.Any])
    
    inline def setExternalModelOutputsUndefined: Self = StObject.set(x, "externalModelOutputs", js.undefined)
    
    inline def setExternalModelOutputsVarargs(value: ExternalModelOutputs*): Self = StObject.set(x, "externalModelOutputs", js.Array(value*))
    
    inline def setModelScores(value: ListOfModelScores): Self = StObject.set(x, "modelScores", value.asInstanceOf[js.Any])
    
    inline def setModelScoresUndefined: Self = StObject.set(x, "modelScores", js.undefined)
    
    inline def setModelScoresVarargs(value: ModelScores*): Self = StObject.set(x, "modelScores", js.Array(value*))
    
    inline def setRuleResults(value: ListOfRuleResults): Self = StObject.set(x, "ruleResults", value.asInstanceOf[js.Any])
    
    inline def setRuleResultsUndefined: Self = StObject.set(x, "ruleResults", js.undefined)
    
    inline def setRuleResultsVarargs(value: RuleResult*): Self = StObject.set(x, "ruleResults", js.Array(value*))
  }
}
