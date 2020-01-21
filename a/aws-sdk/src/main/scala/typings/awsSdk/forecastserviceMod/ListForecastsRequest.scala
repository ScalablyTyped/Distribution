package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListForecastsRequest extends js.Object {
  /**
    * An array of filters. For each filter, you provide a condition and a match statement. The condition is either IS or IS_NOT, which specifies whether to include or exclude the forecasts that match the statement from the list, respectively. The match statement consists of a key and a value.  Filter properties     Condition - The condition to apply. Valid values are IS and IS_NOT. To include the forecasts that match the statement, specify IS. To exclude matching forecasts, specify IS_NOT.    Key - The name of the parameter to filter on. Valid values are DatasetGroupArn, PredictorArn, and Status.    Value - The value to match.   For example, to list all forecasts whose status is not ACTIVE, you would specify:  "Filters": [ { "Condition": "IS_NOT", "Key": "Status", "Value": "ACTIVE" } ] 
    */
  var Filters: js.UndefOr[typings.awsSdk.forecastserviceMod.Filters] = js.native
  /**
    * The number of items to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.forecastserviceMod.MaxResults] = js.native
  /**
    * If the result of the previous request was truncated, the response includes a NextToken. To retrieve the next set of results, use the token in the next request. Tokens expire after 24 hours.
    */
  var NextToken: js.UndefOr[typings.awsSdk.forecastserviceMod.NextToken] = js.native
}

object ListForecastsRequest {
  @scala.inline
  def apply(Filters: Filters = null, MaxResults: Int | scala.Double = null, NextToken: NextToken = null): ListForecastsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListForecastsRequest]
  }
}

