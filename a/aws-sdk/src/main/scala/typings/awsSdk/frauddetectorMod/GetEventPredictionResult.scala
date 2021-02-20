package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEventPredictionResult extends StObject {
  
  /**
    * The model scores. Amazon Fraud Detector generates model scores between 0 and 1000, where 0 is low fraud risk and 1000 is high fraud risk. Model scores are directly related to the false positive rate (FPR). For example, a score of 600 corresponds to an estimated 10% false positive rate whereas a score of 900 corresponds to an estimated 2% false positive rate.
    */
  var modelScores: js.UndefOr[ListOfModelScores] = js.native
  
  /**
    * The results.
    */
  var ruleResults: js.UndefOr[ListOfRuleResults] = js.native
}
object GetEventPredictionResult {
  
  @scala.inline
  def apply(): GetEventPredictionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEventPredictionResult]
  }
  
  @scala.inline
  implicit class GetEventPredictionResultMutableBuilder[Self <: GetEventPredictionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelScores(value: ListOfModelScores): Self = StObject.set(x, "modelScores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelScoresUndefined: Self = StObject.set(x, "modelScores", js.undefined)
    
    @scala.inline
    def setModelScoresVarargs(value: ModelScores*): Self = StObject.set(x, "modelScores", js.Array(value :_*))
    
    @scala.inline
    def setRuleResults(value: ListOfRuleResults): Self = StObject.set(x, "ruleResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleResultsUndefined: Self = StObject.set(x, "ruleResults", js.undefined)
    
    @scala.inline
    def setRuleResultsVarargs(value: RuleResult*): Self = StObject.set(x, "ruleResults", js.Array(value :_*))
  }
}
