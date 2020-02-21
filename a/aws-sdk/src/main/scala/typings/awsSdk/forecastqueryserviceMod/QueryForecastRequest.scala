package typings.awsSdk.forecastqueryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryForecastRequest extends js.Object {
  /**
    * The end date for the forecast. Specify the date using this format: yyyy-MM-dd'T'HH:mm:ss (ISO 8601 format). For example, 2015-01-01T20:00:00. 
    */
  var EndDate: js.UndefOr[DateTime] = js.native
  /**
    * The filtering criteria to apply when retrieving the forecast. For example, to get the forecast for client_21 in the electricity usage dataset, specify the following:  {"item_id" : "client_21"}  To get the full forecast, use the CreateForecastExportJob operation.
    */
  var Filters: typings.awsSdk.forecastqueryserviceMod.Filters = js.native
  /**
    * The Amazon Resource Name (ARN) of the forecast to query.
    */
  var ForecastArn: Arn = js.native
  /**
    * If the result of the previous request was truncated, the response includes a NextToken. To retrieve the next set of results, use the token in the next request. Tokens expire after 24 hours.
    */
  var NextToken: js.UndefOr[typings.awsSdk.forecastqueryserviceMod.NextToken] = js.native
  /**
    * The start date for the forecast. Specify the date using this format: yyyy-MM-dd'T'HH:mm:ss (ISO 8601 format). For example, 2015-01-01T08:00:00.
    */
  var StartDate: js.UndefOr[DateTime] = js.native
}

object QueryForecastRequest {
  @scala.inline
  def apply(
    Filters: Filters,
    ForecastArn: Arn,
    EndDate: DateTime = null,
    NextToken: NextToken = null,
    StartDate: DateTime = null
  ): QueryForecastRequest = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any], ForecastArn = ForecastArn.asInstanceOf[js.Any])
    if (EndDate != null) __obj.updateDynamic("EndDate")(EndDate.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryForecastRequest]
  }
}

