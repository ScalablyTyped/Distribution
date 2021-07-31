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
  
  @scala.inline
  def apply(): ListPredictorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPredictorsResponse]
  }
  
  @scala.inline
  implicit class ListPredictorsResponseMutableBuilder[Self <: ListPredictorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPredictors(value: Predictors): Self = StObject.set(x, "Predictors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictorsUndefined: Self = StObject.set(x, "Predictors", js.undefined)
    
    @scala.inline
    def setPredictorsVarargs(value: PredictorSummary*): Self = StObject.set(x, "Predictors", js.Array(value :_*))
  }
}
