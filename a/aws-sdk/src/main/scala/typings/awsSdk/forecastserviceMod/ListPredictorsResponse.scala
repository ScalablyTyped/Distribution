package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPredictorsResponse extends StObject {
  
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.forecastserviceMod.NextToken] = js.undefined
  
  /**
    * An array of objects that summarize each predictor's properties.
    */
  var Predictors: js.UndefOr[typings.awsSdk.forecastserviceMod.Predictors] = js.undefined
}
object ListPredictorsResponse {
  
  inline def apply(): ListPredictorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPredictorsResponse]
  }
  
  extension [Self <: ListPredictorsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPredictors(value: Predictors): Self = StObject.set(x, "Predictors", value.asInstanceOf[js.Any])
    
    inline def setPredictorsUndefined: Self = StObject.set(x, "Predictors", js.undefined)
    
    inline def setPredictorsVarargs(value: PredictorSummary*): Self = StObject.set(x, "Predictors", js.Array(value :_*))
  }
}
