package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccuracyMetricsResponse extends StObject {
  
  /**
    * An array of results from evaluating the predictor.
    */
  var PredictorEvaluationResults: js.UndefOr[typings.awsSdk.forecastserviceMod.PredictorEvaluationResults] = js.undefined
}
object GetAccuracyMetricsResponse {
  
  inline def apply(): GetAccuracyMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccuracyMetricsResponse]
  }
  
  extension [Self <: GetAccuracyMetricsResponse](x: Self) {
    
    inline def setPredictorEvaluationResults(value: PredictorEvaluationResults): Self = StObject.set(x, "PredictorEvaluationResults", value.asInstanceOf[js.Any])
    
    inline def setPredictorEvaluationResultsUndefined: Self = StObject.set(x, "PredictorEvaluationResults", js.undefined)
    
    inline def setPredictorEvaluationResultsVarargs(value: EvaluationResult*): Self = StObject.set(x, "PredictorEvaluationResults", js.Array(value :_*))
  }
}
