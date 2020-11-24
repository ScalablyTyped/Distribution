package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListForecastsResponse extends js.Object {
  
  /**
    * An array of objects that summarize each forecast's properties.
    */
  var Forecasts: js.UndefOr[typings.awsSdk.forecastserviceMod.Forecasts] = js.native
  
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.forecastserviceMod.NextToken] = js.native
}
object ListForecastsResponse {
  
  @scala.inline
  def apply(): ListForecastsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListForecastsResponse]
  }
  
  @scala.inline
  implicit class ListForecastsResponseOps[Self <: ListForecastsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setForecastsVarargs(value: ForecastSummary*): Self = this.set("Forecasts", js.Array(value :_*))
    
    @scala.inline
    def setForecasts(value: Forecasts): Self = this.set("Forecasts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForecasts: Self = this.set("Forecasts", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
