package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListForecastsResponse extends StObject {
  
  /**
    * An array of objects that summarize each forecast's properties.
    */
  var Forecasts: js.UndefOr[typings.awsSdk.forecastserviceMod.Forecasts] = js.undefined
  
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.forecastserviceMod.NextToken] = js.undefined
}
object ListForecastsResponse {
  
  @scala.inline
  def apply(): ListForecastsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListForecastsResponse]
  }
  
  @scala.inline
  implicit class ListForecastsResponseMutableBuilder[Self <: ListForecastsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForecasts(value: Forecasts): Self = StObject.set(x, "Forecasts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastsUndefined: Self = StObject.set(x, "Forecasts", js.undefined)
    
    @scala.inline
    def setForecastsVarargs(value: ForecastSummary*): Self = StObject.set(x, "Forecasts", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
