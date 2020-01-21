package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListForecastExportJobsResponse extends js.Object {
  /**
    * An array of objects that summarize each export job's properties.
    */
  var ForecastExportJobs: js.UndefOr[typings.awsSdk.forecastserviceMod.ForecastExportJobs] = js.native
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.forecastserviceMod.NextToken] = js.native
}

object ListForecastExportJobsResponse {
  @scala.inline
  def apply(ForecastExportJobs: ForecastExportJobs = null, NextToken: NextToken = null): ListForecastExportJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (ForecastExportJobs != null) __obj.updateDynamic("ForecastExportJobs")(ForecastExportJobs.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListForecastExportJobsResponse]
  }
}

