package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartQueryRequest extends js.Object {
  /**
    * The end of the time range to query. The range is inclusive, so the specified end time is included in the query. Specified as epoch time, the number of seconds since January 1, 1970, 00:00:00 UTC.
    */
  var endTime: Timestamp = js.native
  /**
    * The maximum number of log events to return in the query. If the query string uses the fields command, only the specified fields and their values are returned. The default is 1000.
    */
  var limit: js.UndefOr[EventsLimit] = js.native
  /**
    * The log group on which to perform the query. A StartQuery operation must include a logGroupNames or a logGroupName parameter, but not both.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.native
  /**
    * The list of log groups to be queried. You can include up to 20 log groups. A StartQuery operation must include a logGroupNames or a logGroupName parameter, but not both.
    */
  var logGroupNames: js.UndefOr[LogGroupNames] = js.native
  /**
    * The query string to use. For more information, see CloudWatch Logs Insights Query Syntax.
    */
  var queryString: QueryString = js.native
  /**
    * The beginning of the time range to query. The range is inclusive, so the specified start time is included in the query. Specified as epoch time, the number of seconds since January 1, 1970, 00:00:00 UTC.
    */
  var startTime: Timestamp = js.native
}

object StartQueryRequest {
  @scala.inline
  def apply(endTime: Timestamp, queryString: QueryString, startTime: Timestamp): StartQueryRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartQueryRequest]
  }
  @scala.inline
  implicit class StartQueryRequestOps[Self <: StartQueryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryString(value: QueryString): Self = this.set("queryString", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit(value: EventsLimit): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = this.set("logGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogGroupName: Self = this.set("logGroupName", js.undefined)
    @scala.inline
    def setLogGroupNamesVarargs(value: LogGroupName*): Self = this.set("logGroupNames", js.Array(value :_*))
    @scala.inline
    def setLogGroupNames(value: LogGroupNames): Self = this.set("logGroupNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogGroupNames: Self = this.set("logGroupNames", js.undefined)
  }
  
}

