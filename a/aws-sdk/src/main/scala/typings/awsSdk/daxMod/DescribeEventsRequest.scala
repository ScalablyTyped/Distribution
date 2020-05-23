package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventsRequest extends js.Object {
  /**
    * The number of minutes' worth of events to retrieve.
    */
  var Duration: js.UndefOr[IntegerOptional] = js.native
  /**
    * The end of the time interval for which to retrieve events, specified in ISO 8601 format.
    */
  var EndTime: js.UndefOr[TStamp] = js.native
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. The value for MaxResults must be between 20 and 100.
    */
  var MaxResults: js.UndefOr[IntegerOptional] = js.native
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The identifier of the event source for which events will be returned. If not specified, then all sources are included in the response.
    */
  var SourceName: js.UndefOr[String] = js.native
  /**
    * The event source to retrieve events for. If no value is specified, all events are returned.
    */
  var SourceType: js.UndefOr[typings.awsSdk.daxMod.SourceType] = js.native
  /**
    * The beginning of the time interval to retrieve events for, specified in ISO 8601 format.
    */
  var StartTime: js.UndefOr[TStamp] = js.native
}

object DescribeEventsRequest {
  @scala.inline
  def apply(
    Duration: js.UndefOr[IntegerOptional] = js.undefined,
    EndTime: TStamp = null,
    MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
    NextToken: String = null,
    SourceName: String = null,
    SourceType: SourceType = null,
    StartTime: TStamp = null
  ): DescribeEventsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration.get.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SourceName != null) __obj.updateDynamic("SourceName")(SourceName.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventsRequest]
  }
}

