package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListForecastExportJobsResponse extends StObject {
  
  /**
    * An array of objects that summarize each export job's properties.
    */
  var ForecastExportJobs: js.UndefOr[typings.awsSdk.forecastserviceMod.ForecastExportJobs] = js.undefined
  
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.forecastserviceMod.NextToken] = js.undefined
}
object ListForecastExportJobsResponse {
  
  @scala.inline
  def apply(): ListForecastExportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListForecastExportJobsResponse]
  }
  
  @scala.inline
  implicit class ListForecastExportJobsResponseMutableBuilder[Self <: ListForecastExportJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForecastExportJobs(value: ForecastExportJobs): Self = StObject.set(x, "ForecastExportJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastExportJobsUndefined: Self = StObject.set(x, "ForecastExportJobs", js.undefined)
    
    @scala.inline
    def setForecastExportJobsVarargs(value: ForecastExportJobSummary*): Self = StObject.set(x, "ForecastExportJobs", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
